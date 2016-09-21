package com.zhixing101.wechat.api.entity;

import java.sql.Timestamp;

/**
 * Created by adam on 10/9/16.
 */
public class BookStoragePlace extends BaseEntity {

    private Integer id;                 //id
    private String name;                //存放点名称
    private String description;         //存放点描述
    private String longtitude;          //经度
    private String latitude;            //纬度
    private String province;            //省份
    private String city;                //城市
    private String district;            //区县
    private String street;              //街道
    private String address;             //地址
    private String phone;               //电话
    private String mobile;              //手机
    private User ownUser;               //所有人
    private String openTime;            //开放时间
    private String traffic;             //交通路线
    private User creator;               //创建人
    private Timestamp createTime;       //创建时间
    private User updateUser;            //更新人
    private Timestamp updateTime;       //更新时间
    private boolean isDetele;           //删除

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public User getOwnUser() {
        return ownUser;
    }

    public void setOwnUser(User ownUser) {
        this.ownUser = ownUser;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime;
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic;
    }

    public User getCreator() {
        return creator;
    }

    public void setCreator(User creator) {
        this.creator = creator;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public User getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(User updateUser) {
        this.updateUser = updateUser;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public boolean isDetele() {
        return isDetele;
    }

    public void setDetele(boolean detele) {
        isDetele = detele;
    }
}