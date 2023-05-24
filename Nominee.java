package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*@author - Prathamesh
 * 
 */
@Entity
@Table(name = "nominee")
public class Nominee {

	// id, first name, last name, nominee id;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int nomineeid;
	private String firstname;
	private String lastname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNomineeid() {
		return nomineeid;
	}

	public void setNomineeid(int nomineeid) {
		this.nomineeid = nomineeid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

}
