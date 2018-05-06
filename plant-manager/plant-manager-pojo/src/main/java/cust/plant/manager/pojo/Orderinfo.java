package cust.plant.manager.pojo;

import java.io.Serializable;

public class Orderinfo implements Serializable{
    private Integer id;

    private Integer goodid;

    private Integer buyuserid;

    private Integer selluserid;

    private String address;

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
}