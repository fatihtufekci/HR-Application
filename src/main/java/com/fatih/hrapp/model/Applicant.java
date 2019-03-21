package com.fatih.hrapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class Applicant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotEmpty(message="can't be empty value")
	private String name;
	
	@NotEmpty(message="can't be empty value")
	@Email(message = "incorrect email")
	private String email;
	
	@NotEmpty(message="can't be empty value")
	@Pattern(regexp ="[0-9\\s]{12}", message="Incorrect Phone")
	private String phone;
	
	@NotEmpty(message="can't be empty value")
	private String thoughtsOnJob;
	
	@ManyToMany
	private List<JobListing> jobListings; 
	
	public Applicant() { }
	
	public void addJobListing(JobListing jobListings) {
		this.jobListings.add(jobListings);
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
	public List<JobListing> getJobListings() {
		return jobListings;
	}
	public void setJobListings(List<JobListing> jobListings) {
		this.jobListings = jobListings;
	}
	
}
