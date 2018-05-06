package cust.plant.sso.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import cust.plant.common.pojo.PlantResult;
import cust.plant.common.utils.JsonUtils;
import cust.plant.interfaces.mapper.UserinfoMapper;
import cust.plant.manager.pojo.Userinfo;
import cust.plant.manager.pojo.UserinfoExample;
import cust.plant.manager.pojo.UserinfoExample.Criteria;
import cust.plant.sso.interfaces.UserService;
import cust.plant.sso.jedis.JedisClient;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserinfoMapper userinfoMapper;
	@Autowired
	private JedisClient jedisClient;

	@Value("${USER_SESSION}")
	private String USER_SESSION;
	@Value("${SESSION_EXPIRE}")
	private Integer SESSION_EXPIRE;

	@Override
	public PlantResult register(Userinfo user) {
		if (StringUtils.isEmpty(user.getUsername())) {
			return PlantResult.build(400, "用户名不能为空");
		}
		// 判断用户名是否重复
		PlantResult plantResult = checkData(user.getUsername(), 1);
		if (!(boolean) plantResult.getData()) {
			return PlantResult.build(400, "用户名重复");
		}

		if (StringUtils.isEmpty(user.getPassword())) {
			return PlantResult.build(400, "密码不能为空");
		}
		if (!StringUtils.isEmpty(user.getPhone())) {
			// 是否重复校验
			plantResult = checkData(user.getPhone(), 2);
			if (!(boolean) plantResult.getData()) {
				return PlantResult.build(400, "电话号码重复");
			}
		}
		String md5Pass = DigestUtils.md5DigestAsHex(user.getPassword().getBytes());
		user.setPassword(md5Pass);
		user.setRole("普通用户");
		userinfoMapper.insert(user);
		return PlantResult.ok();
	}

	@Override
	public PlantResult login(String username, String password) {
		UserinfoExample example = new UserinfoExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(username);
		List<Userinfo> list = userinfoMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return PlantResult.build(400, "用户不存在");
		}
		Userinfo user = list.get(0);
		// 密码进行加密后比较
		if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getPassword())) {
			return PlantResult.build(400, "用户名或密码不正确");
		}
		// 生成token，使用uuid
		String token = UUID.randomUUID().toString();
		// 清空密码
		user.setPassword(null);
		// 把用户信息保存到redis，key就是token，value就是用户信息
		jedisClient.set(USER_SESSION + ":" + token, JsonUtils.objectToJson(user));
		// 设置key的过期时间
		jedisClient.expire(USER_SESSION + ":" + token, SESSION_EXPIRE);
		// 返回登录成功，其中要把token返回。
		return PlantResult.ok(token);
	}

	@Override
	public PlantResult getUserByToken(String token) {
		String json = jedisClient.get(USER_SESSION + ":" + token);
		if (StringUtils.isEmpty(json)) {
			return PlantResult.build(400, "用户登录已经过期");
		}
		// 重置Session的过期时间
		jedisClient.expire(USER_SESSION + ":" + token, SESSION_EXPIRE);
		// 把json转换成User对象
		Userinfo user = JsonUtils.jsonToPojo(json, Userinfo.class);
		return PlantResult.ok(user);
	}

	@Override
	public PlantResult checkData(String data, int type) {
		UserinfoExample example = new UserinfoExample();
		Criteria criteria = example.createCriteria();
		// 设置查询条件
		// 1.判断用户名是否可用
		if (type == 1) {
			criteria.andUsernameEqualTo(data);
			// 2判断手机号是否可以使用
		} else if (type == 2) {
			criteria.andPhoneEqualTo(data);

		} else {
			return PlantResult.build(400, "参数中包含非法数据");
		}
		// 执行查询
		List<Userinfo> list = userinfoMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			// 查询到数据，返回false
			return PlantResult.ok(false);
		}
		// 数据可以使用
		return PlantResult.ok(true);
	}

}
