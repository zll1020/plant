package cust.plant.manager.pojo;

import java.io.Serializable;

/**
 * 用户植物信息表
 * 
 * @author u
 *
 */
public class Userplantinfo implements Serializable {
	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 用户ID
	 */
	private Integer userid;
	/**
	 * 植物ID
	 */
	private Integer plantid;
	/**
	 * 售卖状态
	 */
	private Integer sellstatus;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getPlantid() {
		return plantid;
	}

	public void setPlantid(Integer plantid) {
		this.plantid = plantid;
	}

	public Integer getSellstatus() {
		return sellstatus;
	}

	public void setSellstatus(Integer sellstatus) {
		this.sellstatus = sellstatus;
	}
}