package cust.plant.manager.pojo;

import java.io.Serializable;

/**
 * 植物类型表
 * 
 * @author u
 *
 */
public class Planttype implements Serializable {
	/**
	 * 类型ID
	 */
	private Integer typeid;
	/**
	 * 类型名称
	 */
	private String type;

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type == null ? null : type.trim();
	}
}