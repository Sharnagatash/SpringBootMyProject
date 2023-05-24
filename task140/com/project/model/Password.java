//

package com.project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table(name="Password")
public class Password {
//Design Restful API to send forgot password link
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Currentpassword;
	private String newpassword;
	private String passwordlink;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCurrentpassword() {
		return Currentpassword;
	}
	public void setCurrentpassword(String currentpassword) {
		Currentpassword = currentpassword;
	}
	public String getNewpassword() {
		return newpassword;
	}
	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	public String getPasswordlink() {
		return passwordlink;
	}
	public void setPasswordlink(String passwordlink) {
		this.passwordlink = passwordlink;
	}
	

}
