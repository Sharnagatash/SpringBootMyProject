package com.project.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/* @author - Prathamesh
 * 
 * 
 */
@Entity
@Table(name = "user")
public class User {

	// id, firstname, lastname, policy name, policy status
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fistname;
	private String lastname;
	private String policyname;
	private String policystatus;

	@OneToMany(mappedBy = "nomineeid")
	private List<Nominee> nomineelist;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFistname() {
		return fistname;
	}

	public void setFistname(String fistname) {
		this.fistname = fistname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPolicyname() {
		return policyname;
	}

	public void setPolicyname(String policyname) {
		this.policyname = policyname;
	}

	public String getPolicystatus() {
		return policystatus;
	}

	public void setPolicystatus(String policystatus) {
		this.policystatus = policystatus;
	}

	public List<Nominee> getNomineelist() {
		return nomineelist;
	}

	public void setNomineelist(List<Nominee> nomineelist) {
		this.nomineelist = nomineelist;
	}

}
