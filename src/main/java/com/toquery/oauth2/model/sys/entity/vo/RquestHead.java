package com.toquery.oauth2.model.sys.entity.vo;

public class RquestHead {


    private String appId;
    private String v;
    private Integer accountId;
    private Integer deviceTypel;
    private String brand;
    private String model;
    private String systemVersion;
    private String uuid;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public Integer getDeviceTypel() {
        return deviceTypel;
    }

    public void setDeviceTypel(Integer deviceTypel) {
        this.deviceTypel = deviceTypel;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSystemVersion() {
        return systemVersion;
    }

    public void setSystemVersion(String systemVersion) {
        this.systemVersion = systemVersion;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
