package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policy")
public class Policy {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int PolicId;
	private String PolicyNumber;
	private int PolicyExpiryDate;
	private String Payment_Option;
	private Double TotalAmount;
	private Boolean Status;
	private int CreatedDate;
	private String AdditionalInfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPolicId() {
		return PolicId;
	}
	public void setPolicId(int policId) {
		PolicId = policId;
	}
	public String getPolicyNumber() {
		return PolicyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		PolicyNumber = policyNumber;
	}
	public int getPolicyExpiryDate() {
		return PolicyExpiryDate;
	}
	public void setPolicyExpiryDate(int policyExpiryDate) {
		PolicyExpiryDate = policyExpiryDate;
	}
	public String getPayment_Option() {
		return Payment_Option;
	}
	public void setPayment_Option(String payment_Option) {
		Payment_Option = payment_Option;
	}
	public Double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		TotalAmount = totalAmount;
	}
	public Boolean getStatus() {
		return Status;
	}
	public void setStatus(Boolean status) {
		Status = status;
	}
	public int getCreatedDate() {
		return CreatedDate;
	}
	public void setCreatedDate(int createdDate) {
		CreatedDate = createdDate;
	}
	public String getAdditionalInfo() {
		return AdditionalInfo;
	}
	public void setAdditionalInfo(String additionalInfo) {
		AdditionalInfo = additionalInfo;
	}
	

}
