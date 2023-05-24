/*Task1-148- Built a restful web service to delete claim details */
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
@Table(name="ClaimDetails")
public class ClaimDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String claim_id;
	private String Policy_id;
	private String claim_status;
	private String claim_amount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getClaim_id() {
		return claim_id;
	}
	public void setClaim_id(String claim_id) {
		this.claim_id = claim_id;
	}
	public String getPolicy_id() {
		return Policy_id;
	}
	public void setPolicy_id(String policy_id) {
		Policy_id = policy_id;
	}
	public String getClaim_status() {
		return claim_status;
	}
	public void setClaim_status(String claim_status) {
		this.claim_status = claim_status;
	}
	public String getClaim_amount() {
		return claim_amount;
	}
	public void setClaim_amount(String claim_amount) {
		this.claim_amount = claim_amount;
	}
	
	

}
