package cust.plant.manager.pojo;

import java.io.Serializable;

/**
 * 植物状态表
 * 
 * @author u
 *
 */
public class Plantstatus implements Serializable {
	/**
	 * 状态ID
	 */
	private Integer statusid;
	/**
	 * 状态名称
	 */
	private String name;

	public Integer getStatusid() {
		return statusid;
	}

	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}
}