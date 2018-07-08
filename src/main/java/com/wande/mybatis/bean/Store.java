package com.wande.mybatis.bean;

import java.util.Date;

public class Store {
	
	private Integer storeId;
    private String no;
    /**
     * 门店餐饮排队映射编号
     */
    private String storeCateMapNo;
    /**
     * 餐饮排队合作商编号
     */
    private String storeCatePartnerNo;

    private String storeName;
    private String storePinyin;
    private String storeInitials;
    private String storeAddress;
    private String storePhone;
    private String storePicsrc;
    /**
     * 门店背景图片
     */
    private String bgPic;
    private String storeFloor;
    private String storeBunkNo;
    private String storeDesc;
    private Integer cityId;
    private Integer plazaId;
    private String plazaName;
    private Integer merchantId;
    private String merchantName;
    private String thirdStoreId;
    private Date createTime;
    private Date updateTime;
    private Integer version;
    private Integer isValid;
    private Integer type;
    private Integer businessType;
    private Integer isPhysicalStore;

    private Integer avgPerPerson;
    private Integer isTakeout;
    private Integer isOrder;
    private String takeoutPhone;

    private Integer provinceId;
    private Integer countyId;

    private Integer supportWifi;

    /**
     * 订单通知电话，多个用逗号分隔
     */
    private String orderNotifyPhones;
    /**
     * 创建人ID
     */
    private String creatorId;

    private String storeEnglishName;
    private String storeEnglishInitials;
    private String storeRelatedName;
    private String label;

    /**
     * 集团ID
     */
    private Long entGroupId;
    /**
     * 集团名称
     */
    private String entGroupName;
    /**
     * 商户来源  1：飞凡商户/一卡通飞凡商户，2：一卡通商户
     */
    private Integer merchantSource;
    /**
     *一卡通编号
     */
    private String cardNo;

    private String md5;
    
    /**
     * 门店状态 1 启用 2 禁用  3 作废 4 删除
     */
    private Integer status;
    
    /**
     * 门店经纬 
     */
    private Double longitude;
    /**
     * 门店纬度 
     */
    private Double latitude;
    
    /**
     * 门店修改类型
     */
    private String changeType;

    private String storeType	;
    private String storeFontSize	;
    private String storeFontBrandId	;
    private String 	branchName		;
    private String 	serivceTag		;
    private String 	storeHandler		;
    private String 	storeHandlerPhone	;
    private String 	businessHours		;
    private String 	sourceId		;
    private String 	lastUpdateSourceId	;
    private String 	operationDepartmentId;
    /**
     * 操作人ID
     */
    private String operatorId;
	public Integer getStoreId() {
		return storeId;
	}
	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getStoreCateMapNo() {
		return storeCateMapNo;
	}
	public void setStoreCateMapNo(String storeCateMapNo) {
		this.storeCateMapNo = storeCateMapNo;
	}
	public String getStoreCatePartnerNo() {
		return storeCatePartnerNo;
	}
	public void setStoreCatePartnerNo(String storeCatePartnerNo) {
		this.storeCatePartnerNo = storeCatePartnerNo;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStorePinyin() {
		return storePinyin;
	}
	public void setStorePinyin(String storePinyin) {
		this.storePinyin = storePinyin;
	}
	public String getStoreInitials() {
		return storeInitials;
	}
	public void setStoreInitials(String storeInitials) {
		this.storeInitials = storeInitials;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public String getStorePhone() {
		return storePhone;
	}
	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}
	public String getStorePicsrc() {
		return storePicsrc;
	}
	public void setStorePicsrc(String storePicsrc) {
		this.storePicsrc = storePicsrc;
	}
	public String getBgPic() {
		return bgPic;
	}
	public void setBgPic(String bgPic) {
		this.bgPic = bgPic;
	}
	public String getStoreFloor() {
		return storeFloor;
	}
	public void setStoreFloor(String storeFloor) {
		this.storeFloor = storeFloor;
	}
	public String getStoreBunkNo() {
		return storeBunkNo;
	}
	public void setStoreBunkNo(String storeBunkNo) {
		this.storeBunkNo = storeBunkNo;
	}
	public String getStoreDesc() {
		return storeDesc;
	}
	public void setStoreDesc(String storeDesc) {
		this.storeDesc = storeDesc;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public Integer getPlazaId() {
		return plazaId;
	}
	public void setPlazaId(Integer plazaId) {
		this.plazaId = plazaId;
	}
	public String getPlazaName() {
		return plazaName;
	}
	public void setPlazaName(String plazaName) {
		this.plazaName = plazaName;
	}
	public Integer getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Integer merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getThirdStoreId() {
		return thirdStoreId;
	}
	public void setThirdStoreId(String thirdStoreId) {
		this.thirdStoreId = thirdStoreId;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Integer getIsValid() {
		return isValid;
	}
	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getBusinessType() {
		return businessType;
	}
	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}
	public Integer getIsPhysicalStore() {
		return isPhysicalStore;
	}
	public void setIsPhysicalStore(Integer isPhysicalStore) {
		this.isPhysicalStore = isPhysicalStore;
	}
	public Integer getAvgPerPerson() {
		return avgPerPerson;
	}
	public void setAvgPerPerson(Integer avgPerPerson) {
		this.avgPerPerson = avgPerPerson;
	}
	public Integer getIsTakeout() {
		return isTakeout;
	}
	public void setIsTakeout(Integer isTakeout) {
		this.isTakeout = isTakeout;
	}
	public Integer getIsOrder() {
		return isOrder;
	}
	public void setIsOrder(Integer isOrder) {
		this.isOrder = isOrder;
	}
	public String getTakeoutPhone() {
		return takeoutPhone;
	}
	public void setTakeoutPhone(String takeoutPhone) {
		this.takeoutPhone = takeoutPhone;
	}
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	public Integer getCountyId() {
		return countyId;
	}
	public void setCountyId(Integer countyId) {
		this.countyId = countyId;
	}
	public Integer getSupportWifi() {
		return supportWifi;
	}
	public void setSupportWifi(Integer supportWifi) {
		this.supportWifi = supportWifi;
	}
	public String getOrderNotifyPhones() {
		return orderNotifyPhones;
	}
	public void setOrderNotifyPhones(String orderNotifyPhones) {
		this.orderNotifyPhones = orderNotifyPhones;
	}
	public String getCreatorId() {
		return creatorId;
	}
	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}
	public String getStoreEnglishName() {
		return storeEnglishName;
	}
	public void setStoreEnglishName(String storeEnglishName) {
		this.storeEnglishName = storeEnglishName;
	}
	public String getStoreEnglishInitials() {
		return storeEnglishInitials;
	}
	public void setStoreEnglishInitials(String storeEnglishInitials) {
		this.storeEnglishInitials = storeEnglishInitials;
	}
	public String getStoreRelatedName() {
		return storeRelatedName;
	}
	public void setStoreRelatedName(String storeRelatedName) {
		this.storeRelatedName = storeRelatedName;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Long getEntGroupId() {
		return entGroupId;
	}
	public void setEntGroupId(Long entGroupId) {
		this.entGroupId = entGroupId;
	}
	public String getEntGroupName() {
		return entGroupName;
	}
	public void setEntGroupName(String entGroupName) {
		this.entGroupName = entGroupName;
	}
	public Integer getMerchantSource() {
		return merchantSource;
	}
	public void setMerchantSource(Integer merchantSource) {
		this.merchantSource = merchantSource;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Double getLongitude() {
		return longitude;
	}
	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}
	public Double getLatitude() {
		return latitude;
	}
	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}
	public String getChangeType() {
		return changeType;
	}
	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}
	public String getStoreType() {
		return storeType;
	}
	public void setStoreType(String storeType) {
		this.storeType = storeType;
	}
	public String getStoreFontSize() {
		return storeFontSize;
	}
	public void setStoreFontSize(String storeFontSize) {
		this.storeFontSize = storeFontSize;
	}
	public String getStoreFontBrandId() {
		return storeFontBrandId;
	}
	public void setStoreFontBrandId(String storeFontBrandId) {
		this.storeFontBrandId = storeFontBrandId;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getSerivceTag() {
		return serivceTag;
	}
	public void setSerivceTag(String serivceTag) {
		this.serivceTag = serivceTag;
	}
	public String getStoreHandler() {
		return storeHandler;
	}
	public void setStoreHandler(String storeHandler) {
		this.storeHandler = storeHandler;
	}
	public String getStoreHandlerPhone() {
		return storeHandlerPhone;
	}
	public void setStoreHandlerPhone(String storeHandlerPhone) {
		this.storeHandlerPhone = storeHandlerPhone;
	}
	public String getBusinessHours() {
		return businessHours;
	}
	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}
	public String getSourceId() {
		return sourceId;
	}
	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}
	public String getLastUpdateSourceId() {
		return lastUpdateSourceId;
	}
	public void setLastUpdateSourceId(String lastUpdateSourceId) {
		this.lastUpdateSourceId = lastUpdateSourceId;
	}
	public String getOperationDepartmentId() {
		return operationDepartmentId;
	}
	public void setOperationDepartmentId(String operationDepartmentId) {
		this.operationDepartmentId = operationDepartmentId;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
    
}
