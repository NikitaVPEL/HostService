package com.vst.host.dto;

/**
* to validate the model class and do not expose the sensitive information
*
* @author Nikita Chakole <nikita.chakole@vpel.in>
* @since  21/12/2022
*/

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class SettlementDto {
	
	@Id
	private String settlementId;
	
	@NotNull
	@NotBlank
	private String settlementTransactionAmount;
	
	@NotNull
	@NotBlank
	private String settlementPayerId;
	
	@NotNull
	@NotBlank
	private String settlementPayeeId;
	
	@NotNull
	@NotBlank
	private String settlementDate;
	
	@NotNull
	@NotBlank
	private String settlementAmount;
	
	@NotNull
	@NotBlank
	private String settlementFees;
	
	@NotNull
	@NotBlank
	private String settlementTax;
	
	@NotNull
	@NotBlank
	private String settlementUTR;
	
	@NotNull
	@NotBlank
	private String settlementCurrency;
	
	private Date createdDate;
	private Date modifiedDate;
	private String createdBy;
	private String modifiedBy;
	private boolean isActive;
	
	public String getSettlementId() {
		return settlementId;
	}
	public void setSettlementId(String settlementId) {
		this.settlementId = settlementId;
	}
	public String getSettlementTransactionAmount() {
		return settlementTransactionAmount;
	}
	public void setSettlementTransactionAmount(String settlementTransactionAmount) {
		this.settlementTransactionAmount = settlementTransactionAmount;
	}
	public String getSettlementPayerId() {
		return settlementPayerId;
	}
	public void setSettlementPayerId(String settlementPayerId) {
		this.settlementPayerId = settlementPayerId;
	}
	public String getSettlementPayeeId() {
		return settlementPayeeId;
	}
	public void setSettlementPayeeId(String settlementPayeeId) {
		this.settlementPayeeId = settlementPayeeId;
	}
	public String getSettlementDate() {
		return settlementDate;
	}
	public void setSettlementDate(String settlementDate) {
		this.settlementDate = settlementDate;
	}
	public String getSettlementAmount() {
		return settlementAmount;
	}
	public void setSettlementAmount(String settlementAmount) {
		this.settlementAmount = settlementAmount;
	}
	public String getSettlementFees() {
		return settlementFees;
	}
	public void setSettlementFees(String settlementFees) {
		this.settlementFees = settlementFees;
	}
	public String getSettlementTax() {
		return settlementTax;
	}
	public void setSettlementTax(String settlementTax) {
		this.settlementTax = settlementTax;
	}
	public String getSettlementUTR() {
		return settlementUTR;
	}
	public void setSettlementUTR(String settlementUTR) {
		this.settlementUTR = settlementUTR;
	}
	public String getSettlementCurrency() {
		return settlementCurrency;
	}
	public void setSettlementCurrency(String settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		return "Settlement [settlementId=" + settlementId + ", settlementTransactionAmount="
				+ settlementTransactionAmount + ", settlementPayerId=" + settlementPayerId + ", settlementPayeeId="
				+ settlementPayeeId + ", settlementDate=" + settlementDate + ", settlementAmount=" + settlementAmount
				+ ", settlementFees=" + settlementFees + ", settlementTax=" + settlementTax + ", settlementUTR="
				+ settlementUTR + ", settlementCurrency=" + settlementCurrency + ", createdDate=" + createdDate
				+ ", modifiedDate=" + modifiedDate + ", createdBy=" + createdBy + ", modifiedBy=" + modifiedBy
				+ ", isActive=" + isActive + "]";
	}
	
	public SettlementDto() {
		super();
	}
	
	public SettlementDto(String settlementId, String settlementTransactionAmount, String settlementPayerId,
			String settlementPayeeId, String settlementDate, String settlementAmount, String settlementFees,
			String settlementTax, String settlementUTR, String settlementCurrency, Date createdDate,
			Date modifiedDate, String createdBy, String modifiedBy, boolean isActive) {
		super();
		this.settlementId = settlementId;
		this.settlementTransactionAmount = settlementTransactionAmount;
		this.settlementPayerId = settlementPayerId;
		this.settlementPayeeId = settlementPayeeId;
		this.settlementDate = settlementDate;
		this.settlementAmount = settlementAmount;
		this.settlementFees = settlementFees;
		this.settlementTax = settlementTax;
		this.settlementUTR = settlementUTR;
		this.settlementCurrency = settlementCurrency;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.createdBy = createdBy;
		this.modifiedBy = modifiedBy;
		this.isActive = isActive;
	}
	

}