package com.wande.contract;

import java.util.Date;

public class ContractPdfExt {
	
	private Integer id;	
	private Integer contractId;	// 主合同Id
	private String contractSerial;	// 合同pdf序号
	private String contractPdf;	
	private Integer contractPdfType;
	private String contractNumber; 
	private Date submitDate; 
	private String submitDateStr; 
	private Integer status; // 0 未签名 1 已签名
	private Date createTime;	//	创建时间
	private Date updateTime;	//	创建时间
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getContractId() {
		return contractId;
	}
	public void setContractId(Integer contractId) {
		this.contractId = contractId;
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
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Integer getContractPdfType() {
		return contractPdfType;
	}
	public void setContractPdfType(Integer contractPdfType) {
		this.contractPdfType = contractPdfType;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public Date getSubmitDate() {
		return submitDate;
	}
	public void setSubmitDate(Date submitDate) {
		this.submitDate = submitDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getSubmitDateStr() {
		return submitDateStr;
	}
	public void setSubmitDateStr(String submitDateStr) {
		this.submitDateStr = submitDateStr;
	}
}
