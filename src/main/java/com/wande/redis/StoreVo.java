package com.wande.redis;

/**
 * @author houxuesong
 * @date 2017-12-08 08:53
 * @desc 店铺信息
 */
public class StoreVo {
	
    /**
     * 商铺编号
     */
    private String storeCode;
    /**
     * 商铺名称
     */
    private String storeName;
    /**
     * 所属广场id
     */
    private Integer plazaId;
    /**
     * 所属广场编码
     */
    private String plazaCode;
    /**
     * 合同编号
     */
    private String contractNo;
    /**
     * 状态:0新建,1启用,2停用
     */
    private Byte status;
    /**
     * 商铺号
     */
    private String bunkNo;
    /**
     * 所属业态
     */
    private String businessCode;
    /**
     * 所属楼层,多个以逗号分隔
     */
    private String storeFloor;
    /**
     * 面积
     */
    private Double area;
    /**
     * 联系人
     */
    private String contacts;
    /**
     * 联系人电话
     */
    private String phone;
    /**
     * 店铺手机号
     */
    private String storePhone;
    /**
     * 商铺logo
     */
    private String storeLogo;
    /**
     * 地址
     */
    private String address;
    /**
     * 商铺来源
     */
    private String datasources;
    /**
     * 外部id
     */
    private String externalId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建者id
     */
    private String creatorId;
    /**
     * 创建者
     */
    private String creator;
    
    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode == null ? null : storeCode.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public Integer getPlazaId() {
        return plazaId;
    }

    public void setPlazaId(Integer plazaId) {
        this.plazaId = plazaId;
    }

    public String getPlazaCode() {
        return plazaCode;
    }

    public void setPlazaCode(String plazaCode) {
        this.plazaCode = plazaCode == null ? null : plazaCode.trim();
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo == null ? null : contractNo.trim();
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getBunkNo() {
        return bunkNo;
    }

    public void setBunkNo(String bunkNo) {
        this.bunkNo = bunkNo == null ? null : bunkNo.trim();
    }

    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode == null ? null : businessCode.trim();
    }

    public String getStoreFloor() {
        return storeFloor;
    }

    public void setStoreFloor(String storeFloor) {
        this.storeFloor = storeFloor == null ? null : storeFloor.trim();
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getStorePhone() {
        return storePhone;
    }

    public void setStorePhone(String storePhone) {
        this.storePhone = storePhone == null ? null : storePhone.trim();
    }

    public String getStoreLogo() {
        return storeLogo;
    }

    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo == null ? null : storeLogo.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getDatasources() {
        return datasources;
    }

    public void setDatasources(String datasources) {
        this.datasources = datasources == null ? null : datasources.trim();
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId == null ? null : externalId.trim();
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }


}