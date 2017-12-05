package com.wande.contract;

import java.io.Serializable;

public class FeeSettlementInfoVo  implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7425738483864292474L;
	private Double technicalServiceFee; // 平台技术服务费
	private Double cooperationMargin; // 平台合作保证金

	private String settlementPeriod; // 结算周期 0:T+1 1:T+15 2:M(按月结算) 3:Q(按季度结算)

	private String serviceUniformRate; //手续费比例

	private String commissionRatio; // 佣金比例

    private  Double ticketFee;//取票机使用费

    private Integer  contractId;//主合同id

    public Double getTechnicalServiceFee() {
        return technicalServiceFee;
    }

    public void setTechnicalServiceFee(Double technicalServiceFee) {
        this.technicalServiceFee = technicalServiceFee;
    }

    public Double getCooperationMargin() {
        return cooperationMargin;
    }

    public void setCooperationMargin(Double cooperationMargin) {
        this.cooperationMargin = cooperationMargin;
    }

    public String getSettlementPeriod() {
        return settlementPeriod;
    }

    public void setSettlementPeriod(String settlementPeriod) {
        this.settlementPeriod = settlementPeriod;
    }

    public String getServiceUniformRate() {
        return serviceUniformRate;
    }

    public void setServiceUniformRate(String serviceUniformRate) {
        this.serviceUniformRate = serviceUniformRate;
    }

    public String getCommissionRatio() {
        return commissionRatio;
    }

    public void setCommissionRatio(String commissionRatio) {
        this.commissionRatio = commissionRatio;
    }

    public Double getTicketFee() {
        return ticketFee;
    }

    public void setTicketFee(Double ticketFee) {
        this.ticketFee = ticketFee;
    }

    public Integer getContractId() {
        return contractId;
    }

    public void setContractId(Integer contractId) {
        this.contractId = contractId;
    }

    @Override
	public String toString() {
		return "FeeSettlementInfo [ technicalServiceFee="
				+ technicalServiceFee + ", cooperationMargin="
				+ cooperationMargin + ", settlementPeriod=" + settlementPeriod
				+ ", serviceUniformRate=" + serviceUniformRate
				+ ", commissionRatio=" + commissionRatio  + "]";
	}
}