package cust.plant.manager.pojo;

import java.io.Serializable;

/**
 * 植物参数标准信息表
 * 
 * @author u
 *
 */
public class Thresholdinfo implements Serializable {
	/**
	 * 主键ID
	 */
	private Integer id;

	/**
	 * 植物类型ID
	 */
	private Integer typeid;
	/**
	 * 参数名称
	 */
	private String paramname;
	/**
	 * 最高限度
	 */
	private Float hightlevel;
	/**
	 * 最低限度
	 */
	private Float lowlevel;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getTypeid() {
		return typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getParamname() {
		return paramname;
	}

	public void setParamname(String paramname) {
		this.paramname = paramname == null ? null : paramname.trim();
	}

	public Float getHightlevel() {
		return hightlevel;
	}

	public void setHightlevel(Float hightlevel) {
		this.hightlevel = hightlevel;
	}

	public Float getLowlevel() {
		return lowlevel;
	}

	public void setLowlevel(Float lowlevel) {
		this.lowlevel = lowlevel;
	}
}