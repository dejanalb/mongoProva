package com.rjcsoft.mongoprova.model;


import org.springframework.data.mongodb.core.mapping.Document;

@Document (collection="anagrafica")
public class Anagrafica {
	private String name;
	private String email;
	private String birthday;
	private String nation;
	
	public Anagrafica( String name, String email, String birthday, String nation) {
		
		this.name=name;
		this.email=email;
		this.birthday=birthday;
		this.nation=nation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	

}