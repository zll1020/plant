package cust.plant.manager.pojo;

import java.io.Serializable;
/**
 * 订单表
 * @author u
 *
 */
public class Orderinfo implements Serializable{
	/**
	 * 订单ID
	 */
    private Integer id;

    /**
     * 商品ID
     */
    private Integer goodid;

    /**
     * 买方用户ID
     */
    private Integer buyuserid;

    /**
     * 卖方用户ID
     */
    private Integer selluserid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodid() {
        return goodid;
    }

    public void setGoodid(Integer goodid) {
        this.goodid = goodid;
    }

    public Integer getBuyuserid() {
        return buyuserid;
    }

    public void setBuyuserid(Integer buyuserid) {
        this.buyuserid = buyuserid;
    }

    public Integer getSelluserid() {
        return selluserid;
    }

    public void setSelluserid(Integer selluserid) {
        this.selluserid = selluserid;
    }
}