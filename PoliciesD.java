/*Task5-166 -Design API to download all the matured policies details into Excel file*/
package com.project.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * @Author SakshiCharthal
 */
@Entity
@Table(name="PoliciesD")
public class PoliciesD {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String policyid;
	private String policyno;
	private Date policy_Effective_Date;
	private Date policy_Expiry_Date;
	private String payment_option;
	private Double totalAmount;
	private Boolean status;
	private Date createdDate;
	private String additionInfo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyid() {
		return policyid;
	}
	public void setPolicyid(String policyid) {
		this.policyid = policyid;
	}
	public String getPolicyno() {
		return policyno;
	}
	public void setPolicyno(String policyno) {
		this.policyno = policyno;
	}
	public Date getPolicy_Effective_Date() {
		return policy_Effective_Date;
	}
	public void setPolicy_Effective_Date(Date policy_Effective_Date) {
		this.policy_Effective_Date = policy_Effective_Date;
	}
	public Date getPolicy_Expiry_Date() {
		return policy_Expiry_Date;
	}
	public void setPolicy_Expiry_Date(Date policy_Expiry_Date) {
		this.policy_Expiry_Date = policy_Expiry_Date;
	}
	public String getPayment_option() {
		return payment_option;
	}
	public void setPayment_option(String payment_option) {
		this.payment_option = payment_option;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getAdditionInfo() {
		return additionInfo;
	}
	public void setAdditionInfo(String additionInfo) {
		this.additionInfo = additionInfo;
	}
		
	
	

}
