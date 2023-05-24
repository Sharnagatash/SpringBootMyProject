package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DetailsClaim")
public class ClaimD {
	@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String PolicyId;
	private String Policystatus;
	private String Claimamount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyId() {
		return PolicyId;
	}
	public void setPolicyId(String policyId) {
		PolicyId = policyId;
	}
	public String getPolicystatus() {
		return Policystatus;
	}
	public void setPolicystatus(String policystatus) {
		Policystatus = policystatus;
	}
	public String getClaimamount() {
		return Claimamount;
	}
	public void setClaimamount(String claimamount) {
		Claimamount = claimamount;
	}
	

}
