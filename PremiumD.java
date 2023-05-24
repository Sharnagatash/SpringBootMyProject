/*Task3-156- Design API to store user with multiple premium details into database*/
package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*
 * @Author SakshiCharthal
 */
@Entity
@Table(name="PremiumD")
public class PremiumD {
//id,PolicyNumber ,date PolicyEffectiveDate,Date policyExpiryDate,
//Payment_Option,Double TotalAmount,Boolean Status,Date Created Date,String AdditionalInfo
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String PolicyNumber;
	private String Policy_Effective_Date;
	private String Policy_ExiryDate;
	private String Payment_Option;
	private Double Total_Amount;
	private Boolean Status;
	private String Created_date;
	private String Addition_Info;
	private Integer userId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPolicyNumber() {
		return PolicyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		PolicyNumber = policyNumber;
	}
	public String getPolicy_Effective_Date() {
		return Policy_Effective_Date;
	}
	public void setPolicy_Effective_Date(String policy_Effective_Date) {
		Policy_Effective_Date = policy_Effective_Date;
	}
	public String getPolicy_ExiryDate() {
		return Policy_ExiryDate;
	}
	public void setPolicy_ExiryDate(String policy_ExiryDate) {
		Policy_ExiryDate = policy_ExiryDate;
	}
	public String getPayment_Option() {
		return Payment_Option;
	}
	public void setPayment_Option(String payment_Option) {
		Payment_Option = payment_Option;
	}
	public Double getTotal_Amount() {
		return Total_Amount;
	}
	public void setTotal_Amount(Double total_Amount) {
		Total_Amount = total_Amount;
	}
	public Boolean getStatus() {
		return Status;
	}
	public void setStatus(Boolean status) {
		Status = status;
	}
	public String getCreated_date() {
		return Created_date;
	}
	public void setCreated_date(String created_date) {
		Created_date = created_date;
	}
	public String getAddition_Info() {
		return Addition_Info;
	}
	public void setAddition_Info(String addition_Info) {
		Addition_Info = addition_Info;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
}
