package com.wande.contract;

import java.util.Date;
import java.util.List;

public class ContractVo {
	private Integer id; // Pk 主键ID
    
	private String contractNo; // 合同编号
    
	private String signingDate; // 签订日期
    
	private String startDate; // 开始日期
    
	private String endDate; // 结束日期
    //@NotBlank(message = "甲方签约人不能为空", groups = {Create.class,Update.class})
	private String partAContractor; // 甲方签约人
	private String partAName; // 甲方
	private Integer partAId; // 甲方ID

	private String partAAddr; // 甲方地址
    //@NotBlank(message = "甲方签约人电话不能为空", groups = {Create.class,Update.class})
	private String partAPhone; // 甲方签约人电话

	private String partAEmail; // 甲方签约人邮箱
	private String partBContractor; // 乙方签约人
	private String partBName; // 乙方
	private Integer partBId; // 乙方ID

	private String partBAddr; // 乙方地址
	private String partBPhone; // 乙方签约人电话

	private String partBEmail; // 乙方签约人邮箱

	private Integer contractType; // 

	private String supplement; // 补充说明
	private Integer status; // 合同状态:

	private String contactPhone; // 联系电话（账户开通使用）
    
	private String confirmationLetterPic; // 结算账户确认函

	private String otherPics; // 其它合同类附件

	private String serviceCodes; // 服务项编码集合

	private Integer groupId; // 集团Id

	private String groupName; // 集团名称

    private String brandId; // 品牌id

    private String brandName; // 品牌名称

    private Integer isCinema = 0;//是否电影合同 0:否 1:是，默认为0

	private String creatorId; // 创建人ID

    private String creatorName; // 创建人名称

	private Date createTime; // 创建时间

	private String operatorId; // 修改人ID

    private String operatorName; // 修改人名称

	private Date updateTime; // 修改时间

    private Integer bContractId;//品牌商主合同id(只有电影商户主合同有此值）

	private Integer isValid; // 是否删除 1:否 2:是
	
	private String paymentAgreementPic; //委托收款协议

    private FeeSettlementInfoVo feeSettlementInfoVo; //费用与结算

    private List<PaymentInfoVo> paymentInfoVoList;//支付信息

	private String versionName;//合同版本号名称

	private Integer renewStatus;//合同续签状态

	private Integer changeSignStatus;//合同换签状态

	private String oldEndDate;//原合同结束日期

	private String contractSerial;//合同pdf序号
	
	private String contractPdf;//合同pdf MD5
	
	private Integer contreacPdfType; // pdf类型 1 商户入驻 商户app 2 sop
	
	private Integer signingStatus; // 飞凡合同签名中状态 0 否 1是
	
	private List<ContractPdfExt> contractPdfExtList;
	
	private Integer businessType; // 业态

	public String getOldEndDate() {
		return oldEndDate;
	}

	public void setOldEndDate(String oldEndDate) {
		this.oldEndDate = oldEndDate;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public Integer getRenewStatus() {
		return renewStatus;
	}

	public void setRenewStatus(Integer renewStatus) {
		this.renewStatus = renewStatus;
	}

	public Integer getChangeSignStatus() {
		return changeSignStatus;
	}

	public void setChangeSignStatus(Integer changeSignStatus) {
		this.changeSignStatus = changeSignStatus;
	}

	public List<PaymentInfoVo> getPaymentInfoVoList() {
        return paymentInfoVoList;
    }

    public void setPaymentInfoVoList(List<PaymentInfoVo> paymentInfoVoList) {
        this.paymentInfoVoList = paymentInfoVoList;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public FeeSettlementInfoVo getFeeSettlementInfoVo() {
        return feeSettlementInfoVo;
    }

    public void setFeeSettlementInfoVo(FeeSettlementInfoVo feeSettlementInfoVo) {
        this.feeSettlementInfoVo = feeSettlementInfoVo;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getContractNo() {
		return this.contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getSigningDate() {
		return this.signingDate;
	}

	public void setSigningDate(String signingDate) {
		this.signingDate = signingDate;
	}

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getPartAContractor() {
		return this.partAContractor;
	}

	public void setPartAContractor(String partAContractor) {
		this.partAContractor = partAContractor;
	}

	public String getPartAName() {
		return this.partAName;
	}

	public void setPartAName(String partAName) {
		this.partAName = partAName;
	}

	public Integer getPartAId() {
		return this.partAId;
	}

	public void setPartAId(Integer partAId) {
		this.partAId = partAId;
	}

	public String getPartAAddr() {
		return this.partAAddr;
	}

	public void setPartAAddr(String partAAddr) {
		this.partAAddr = partAAddr;
	}

	public String getPartAPhone() {
		return this.partAPhone;
	}

	public void setPartAPhone(String partAPhone) {
		this.partAPhone = partAPhone;
	}

	public String getPartAEmail() {
		return this.partAEmail;
	}

	public void setPartAEmail(String partAEmail) {
		this.partAEmail = partAEmail;
	}

	public String getPartBContractor() {
		return this.partBContractor;
	}

	public void setPartBContractor(String partBContractor) {
		this.partBContractor = partBContractor;
	}

	public String getPartBName() {
		return this.partBName;
	}

	public void setPartBName(String partBName) {
		this.partBName = partBName;
	}

	public Integer getPartBId() {
		return this.partBId;
	}

	public void setPartBId(Integer partBId) {
		this.partBId = partBId;
	}

	public String getPartBAddr() {
		return this.partBAddr;
	}

	public void setPartBAddr(String partBAddr) {
		this.partBAddr = partBAddr;
	}

	public String getPartBPhone() {
		return this.partBPhone;
	}

	public void setPartBPhone(String partBPhone) {
		this.partBPhone = partBPhone;
	}

	public String getPartBEmail() {
		return this.partBEmail;
	}

	public void setPartBEmail(String partBEmail) {
		this.partBEmail = partBEmail;
	}

	public String getSupplement() {
		return this.supplement;
	}

	public void setSupplement(String supplement) {
		this.supplement = supplement;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public String getConfirmationLetterPic() {
		return this.confirmationLetterPic;
	}

	public void setConfirmationLetterPic(String confirmationLetterPic) {
		this.confirmationLetterPic = confirmationLetterPic;
	}

	public String getOtherPics() {
		return this.otherPics;
	}

	public void setOtherPics(String otherPics) {
		this.otherPics = otherPics;
	}

	public String getServiceCodes() {
		return this.serviceCodes;
	}

	public void setServiceCodes(String serviceCodes) {
		this.serviceCodes = serviceCodes;
	}

	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getCreatorId() {
		return this.creatorId;
	}

	public void setCreatorId(String creatorId) {
		this.creatorId = creatorId;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}


	public Integer getIsValid() {
		return this.isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

    public Integer getIsCinema() {
        return isCinema;
    }

    public void setIsCinema(Integer isCinema) {
        this.isCinema = isCinema;
    }

    public Integer getContractType() {
        return contractType;
    }

    public void setContractType(Integer contractType) {
        this.contractType = contractType;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getbContractId() {
        return bContractId;
    }

    public void setbContractId(Integer bContractId) {
        this.bContractId = bContractId;
    }

    public String getPaymentAgreementPic() {
		return paymentAgreementPic;
	}

	public void setPaymentAgreementPic(String paymentAgreementPic) {
		this.paymentAgreementPic = paymentAgreementPic;
	}
	
	public String getContractSerial() {
		return contractSerial;
	}

	public void setContractSerial(String contractSerial) {
		this.contractSerial = contractSerial;
	}

	public String getContractPdf() {
		return contractPdf;
	}

	public void setContractPdf(String contractPdf) {
		this.contractPdf = contractPdf;
	}

	public List<ContractPdfExt> getContractPdfExtList() {
		return contractPdfExtList;
	}

	public void setContractPdfExtList(List<ContractPdfExt> contractPdfExtList) {
		this.contractPdfExtList = contractPdfExtList;
	}

	public Integer getContreacPdfType() {
		return contreacPdfType;
	}

	public void setContreacPdfType(Integer contreacPdfType) {
		this.contreacPdfType = contreacPdfType;
	}

	public Integer getSigningStatus() {
		return signingStatus;
	}

	public void setSigningStatus(Integer signingStatus) {
		this.signingStatus = signingStatus;
	}

	public Integer getBusinessType() {
		return businessType;
	}

	public void setBusinessType(Integer businessType) {
		this.businessType = businessType;
	}

}