package cust.plant.manager.pojo;

import java.io.Serializable;
/**
 * 植物表
 * @author u
 *
 */
public class Plant implements Serializable {
	/**
	 * 植物ID
	 */
	private Integer plantid;
	/**
	 * 植物名称
	 */
	private String plantname;
	/**
	 * 植物类型
	 */
	private Integer typeid;

	public Integer getPlantid() {
		return plantid;
	}

	public void setPlantid(Integer plantid) {
		this.plantid = plantid;
	}

	public String getPlantname() {
		return plantname;
	}

	public void setPlantname(String plantname) {
		this.plantname = plantname == null ? null : plantname.trim();
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}
}