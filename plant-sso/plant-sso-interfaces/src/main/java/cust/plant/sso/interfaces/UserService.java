package cust.plant.sso.interfaces;

import cust.plant.common.pojo.PlantResult;
import cust.plant.manager.pojo.Userinfo;

public interface UserService {
	/**
	 * 注册
	 * @param user
	 * @return
	 */
	public PlantResult register(Userinfo user);
	/**
	 * 登录
	 * @param username 用户名
	 * @param password 密码
	 * @return
	 */
	public PlantResult login(String username,String password);
	/**
	 * 根据token获取用户
	 * @param token
	 * @return
	 */
	public PlantResult getUserByToken(String token);
	
	/**
	 * 检查用户名和手机号
	 * @param data
	 * @param type
	 * @return
	 */
	public PlantResult checkData(String data,int type);

}
