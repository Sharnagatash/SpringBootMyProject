/*Task3-156- Design API to store user with multiple premium details into database*/

package com.project.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/*
 * @Author SakshiCharthal 
 */
@Entity
@Table(name="user")
public class User {
	//one user has multiple matured premiumDetails
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private String FirstName;
	private String lastName;
	private String Email;
	
	@OneToMany(mappedBy ="userId")
	private List<PremiumD> premiumDList;
	
	public List<PremiumD> getPremiumDList() {
		return premiumDList;
	}
	public void setPremiumDList(List<PremiumD> premiumDList) {
		this.premiumDList = premiumDList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	
	

}
