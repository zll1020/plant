package cust.plant.manager.pojo;

import java.io.Serializable;

/**
 * 用户信息表
 * 
 * @author u
 *
 */
public class Userinfo implements Serializable {
	/**
	 * 用户ID
	 */
	private Integer userid;
	/**
	 * 用户名称
	 */
	private String username;
	/**
	 * 用户密码
	 */
	private String password;
	/**
	 * 用户角色
	 */
	private String role;
	/**
	 * 用户账户
	 */
	private Integer count;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role == null ? null : role.trim();
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}