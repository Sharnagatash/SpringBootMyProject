//@Author Ashwini sharnagat
 
package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nominee details")
public class Nominee {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id;
	private int Aadharcard;
	private String Name;
	private int DOB;
	private String Gender;
	private String Bankaccount;
	private String Gaurdian;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAadharcard() {
		return Aadharcard;
	}

	public void setAadharcard(int aadharcard) {
		Aadharcard = aadharcard;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getDOB() {
		return DOB;
	}

	public void setDOB(int dOB) {
		DOB = dOB;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getBankaccount() {
		return Bankaccount;
	}

	public void setBankaccount(String bankaccount) {
		Bankaccount = bankaccount;
	}

	public String getGaurdian() {
		return Gaurdian;
	}

	public void setGaurdian(String gaurdian) {
		Gaurdian = gaurdian;
	}
}