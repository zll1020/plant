package cust.plant.manager.pojo;

import java.io.Serializable;
/**
 * 商品表
 * @author u
 *
 */
public class Goodinfo implements Serializable {
	/**
	 * 商品ID
	 */
	private Integer id;

	/**
	 * 植物ID
	 */
	private Integer plantid;

	/**
	 * 库存
	 */
	private Integer count;

	/**
	 * 价格
	 */
	private Integer price;

	/**
	 * 详细信息
	 */
	private String description;

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

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}
}