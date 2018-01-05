package com.wande.contract;

import java.io.Serializable;
public class PaymentInfoVo implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = -1907394396522570740L;

    //@NotNull(message = "开户行类型id不能为空", groups = {Create.class,Update.class})
	private Integer depositBankId; // 开户行类型id
    //@NotNull(message = "开户行省份不能为空", groups = {Create.class,Update.class})
	private Integer provinceId; // 开户行省份id
    //@NotNull(message = "户行城市不能为空", groups = {Create.class,Update.class})
	private Integer cityId; // 开户行城市id
    //@NotBlank(message = "开户银行不能为空", groups = {Create.class,Update.class})
	private String bankName; // 开户银行
    //@NotBlank(message = "银行开户名不能为空", groups = {Create.class,Update.class})
	private String accountName; // 银行开户名
    //@NotBlank(message = "银行账号不能为空", groups = {Create.class,Update.class})
	private String bankAccount; // 银行账号
	private String kqAccount; // 快钱账号
	private String financialContacts; // 财务联系人
	private String financialContactPhone; // 财务联系人手机号
	private Integer contractId; // 主合同id

    //@NotBlank(message = "开户行类型名称不能为空", groups = {Create.class,Update.class})
    private String depositBankName; // 开户行类型名称
    //@NotBlank(message = "开户行省份名称不能为空", groups = {Create.class,Update.class})
    private String provinceName; //开户行省份名称
    //@NotBlank(message = "开户行城市名称不能为空", groups = {Create.class,Update.class})
    private String cityName; // 开户行城市名称

	private Integer ownerType;	//合同所属方：1:乙方 2：丙方
    
    private String depositBankCode; // 开户行类型编码

    public Integer getDepositBankId() {
        return depositBankId;
    }

    public void setDepositBankId(Integer depositBankId) {
        this.depositBankId = depositBankId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getKqAccount() {
        return kqAccount;
    }

    public void setKqAccount(String kqAccount) {
        this.kqAccount = kqAccount;
    }

    public String getFinancialContacts() {
        return financialContacts;
    }

    public void setFinancialContacts(String financialContacts) {
        this.financialContacts = financialContacts;
    }

    public String getFinancialContactPhone() {
        return financialContactPhone;
    }

    public void setFinancialContactPhone(String financialContactPhone) {
        this.financialContactPhone = financialContactPhone;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    public Integer getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(Integer ownerType) {
        this.ownerType = ownerType;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDepositBankName() {
        return depositBankName;
    }

    public void setDepositBankName(String depositBankName) {
        this.depositBankName = depositBankName;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getDepositBankCode() {
		return depositBankCode;
	}

	public void setDepositBankCode(String depositBankCode) {
		this.depositBankCode = depositBankCode;
	}

	@Override
	public String toString() {
		return "PaymentInfoVo [depositBankId=" + depositBankId
				+ ", provinceId=" + provinceId + ", cityId=" + cityId
				+ ", bankName=" + bankName + ", accountName=" + accountName
				+ ", bankAccount=" + bankAccount + ", kqAccount=" + kqAccount
				+ ", financialContacts=" + financialContacts
				+ ", financialContactPhone=" + financialContactPhone
				+ ", contractId=" + contractId + ", depositBankName="
				+ depositBankName + ", provinceName=" + provinceName
				+ ", cityName=" + cityName + ", ownerType=" + ownerType
				+ ", depositBankCode=" + depositBankCode + "]";
	}
}
