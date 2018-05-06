package cust.plant.sso.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cust.plant.common.pojo.PlantResult;
import cust.plant.common.utils.CookieUtils;
import cust.plant.manager.pojo.Userinfo;
import cust.plant.sso.interfaces.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Value("${TOKEN_KEY}")
	private String TOKEN_KEY;
	
	@RequestMapping("/user/check/{param}/{type}")
	@ResponseBody
	public PlantResult checkUserData(@PathVariable String param, @PathVariable Integer type) {
		PlantResult result = userService.checkData(param, type);
		return result;
	}
	
	@RequestMapping("/user/login")
	@ResponseBody
	public PlantResult login(String username ,String password ,HttpServletRequest request,HttpServletResponse response){
		PlantResult result = userService.login(username, password);
		//登录成功后写cookie
		if (result.getStatus() == 200) {
			//把token写入cookie
			CookieUtils.setCookie(request, response, TOKEN_KEY, result.getData().toString());
		}
		return result;
		
	}
	
	@RequestMapping(value="/user/register")
	@ResponseBody
	public PlantResult regitster(Userinfo userinfo) {
		PlantResult result = userService.register(userinfo);
		return result;
	}
	
	@RequestMapping(value="/user/token/{token}")
	@ResponseBody
	public Object getUserByToken(@PathVariable String token, String callback) {
		PlantResult result = userService.getUserByToken(token);
		//判断是否为jsonp请求
		if (StringUtils.isNotEmpty(callback)) {
			MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(result);
			//设置回调方法
			mappingJacksonValue.setJsonpFunction(callback);
			return mappingJacksonValue;
		}
		return result;
	}
}
