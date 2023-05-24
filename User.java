package com.project.model;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/*@author name - prathamesh
 * 
 */

@Entity
@Table(name="user1")
public class User {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY )
	private int id;
	private String name;
	private String city;
	
	@OneToOne(targetEntity = Transection.class, cascade = CascadeType.ALL)
	private Transection transection;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Transection getTransection() {
		return transection;
	}

	public void setTransection(Transection transection) {
		this.transection = transection;
	}
	
	

}
