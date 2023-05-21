package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Premium")
public class Premium {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int InstallmentAmount;
	private String PolicyHolderName;
	private String PremiumId;
	private String policycommencementdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getInstallmentAmount() {
		return InstallmentAmount;
	}
	public void setInstallmentAmount(int installmentAmount) {
		InstallmentAmount = installmentAmount;
	}
	public String getPolicyHolderName() {
		return PolicyHolderName;
	}
	public void setPolicyHolderName(String policyHolderName) {
		PolicyHolderName = policyHolderName;
	}
	public String getPremiumId() {
		return PremiumId;
	}
	public void setPremiumId(String premiumId) {
		PremiumId = premiumId;
	}
	public String getPolicycommencementdate() {
		return policycommencementdate;
	}
	public void setPolicycommencementdate(String policycommencementdate) {
		this.policycommencementdate = policycommencementdate;
	}
	
} 
