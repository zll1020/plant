package cust.plant.manager.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 植物详细信息表
 * 
 * @author u
 *
 */
public class Plantinfo implements Serializable {
	/**
	 * 主键ID
	 */
	private Integer id;
	/**
	 * 植物ID
	 */
	private Integer plantid;
	/**
	 * 当前时间
	 */
	private Date time;
	/**
	 * 土壤温度
	 */
	private Float soiltemp;
	/**
	 * 土壤湿度
	 */
	private Float soilhum;
	/**
	 * 空气温度
	 */
	private Float airtemp;
	/**
	 * 空气湿度
	 */
	private Float airhum;
	/**
	 * 光照强度
	 */
	private Float light;
	/**
	 * 二氧化碳浓度
	 */
	private Float co2;
	/**
	 * 照片
	 */
	private String picture;
	/**
	 * 视频
	 */
	private String video;
	/**
	 * 当前生长状态
	 */
	private Integer growstatusid;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPlantid() {
		return plantid;
	}

	public void setPlantid(Integer plantid) {
		this.plantid = plantid;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public Float getSoiltemp() {
		return soiltemp;
	}

	public void setSoiltemp(Float soiltemp) {
		this.soiltemp = soiltemp;
	}

	public Float getSoilhum() {
		return soilhum;
	}

	public void setSoilhum(Float soilhum) {
		this.soilhum = soilhum;
	}

	public Float getAirtemp() {
		return airtemp;
	}

	public void setAirtemp(Float airtemp) {
		this.airtemp = airtemp;
	}

	public Float getAirhum() {
		return airhum;
	}

	public void setAirhum(Float airhum) {
		this.airhum = airhum;
	}

	public Float getLight() {
		return light;
	}

	public void setLight(Float light) {
		this.light = light;
	}

	public Float getCo2() {
		return co2;
	}

	public void setCo2(Float co2) {
		this.co2 = co2;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture == null ? null : picture.trim();
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video == null ? null : video.trim();
	}

	public Integer getGrowstatusid() {
		return growstatusid;
	}

	public void setGrowstatusid(Integer growstatusid) {
		this.growstatusid = growstatusid;
	}
}