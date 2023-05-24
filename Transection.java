package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/*@ author name - prathamesh
 * 
 */
@Entity
@Table(name = "transection")
public class Transection {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int transectionid;
	private String amount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTransectionid() {
		return transectionid;
	}

	public void setTransectionid(int transectionid) {
		this.transectionid = transectionid;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

}
