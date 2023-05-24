package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="policydetails")
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
 private int id;
 private String policyname;
 private String policyholder;
 private int term;
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
public String getPolicyholder() {
	return policyholder;
}
public void setPolicyholder(String policyholder) {
	this.policyholder = policyholder;
}
public int getTerm() {
	return term;
}
public void setTerm(int term) {
	this.term = term;
}
 
}
