package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/* @author - Prathamesh
 * 
 */
@Entity
@Table(name = "policyschedule")
public class PolicySchedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int effectivedate;
	private int renewaldate;
	private String policyname;
	private String planname;
	private String username;
	private String premiumamount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyname() {
		return policyname;
	}

	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}

	public String getPlanname() {
		return planname;
	}

	public void setPlanname(String planname) {
		this.planname = planname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPremiumamount() {
		return premiumamount;
	}

	public void setPremiumamount(String premiumamount) {
		this.premiumamount = premiumamount;
	}

	public int getEffectivedate() {
		return effectivedate;
	}

	public void setEffectivedate(int effectivedate) {
		this.effectivedate = effectivedate;
	}

	public int getRenewaldate() {
		return renewaldate;
	}

	public void setRenewaldate(int renewaldate) {
		this.renewaldate = renewaldate;
	}

}
