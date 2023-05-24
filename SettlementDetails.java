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
@Table(name = "settlementdetails")
public class SettlementDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String settelementid;
	private String date;
	private String amount;
	private String claimid;
	private String status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSettelementid() {
		return settelementid;
	}

	public void setSettelementid(String settelementid) {
		this.settelementid = settelementid;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getClaimid() {
		return claimid;
	}

	public void setClaimid(String claimid) {
		this.claimid = claimid;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
