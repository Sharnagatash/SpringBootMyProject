package com.project.model;
/*
 *task no 177 Designe web service to get the settelment detail   
 * @Author Hitesh.
 */
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "image")

public class Image {

	// to take the int id , name,type

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String type;
	@Lob
	private byte[] imagedetail;

	
	

	public Image(String name, String type, byte[] imagedetail) {
		super();
		this.name = name;
		this.type = type;
		this.imagedetail = imagedetail;
	}

	public byte[] getImagedetail() {
		return imagedetail;
	}

	public void setImagedetail(byte[] imagedetail) {
		this.imagedetail = imagedetail;
	}

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
