package com.fatih.hrapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Applicant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private String email;
	
	@NotEmpty
	private String phone;
	
	@NotEmpty
	private String thoughtsOnJob;
	
	public Applicant() { }
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getThoughtsOnJob() {
		return thoughtsOnJob;
	}
	public void setThoughtsOnJob(String thoughtsOnJob) {
		this.thoughtsOnJob = thoughtsOnJob;
	}
	
}
