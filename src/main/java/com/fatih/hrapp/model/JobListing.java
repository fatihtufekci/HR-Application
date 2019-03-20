package com.fatih.hrapp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotEmpty;

@Entity
public class JobListing {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotEmpty
	private String jobTitle;
	
	@NotEmpty
	private String jobDescription;
	
	private int numberOfPeopleToHire;
	
	@NotEmpty
	private String lastApplicationDate;
	
	//@ManyToMany(mappedBy="jobListings", cascade=CascadeType.ALL)
	@ManyToMany(mappedBy="jobListings")
	private List<Applicant> applicant; 
	
	public JobListing() { }
	
	public void addApplicant(Applicant applicant) {
		this.applicant.add(applicant);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public int getNumberOfPeopleToHire() {
		return numberOfPeopleToHire;
	}

	public void setNumberOfPeopleToHire(int numberOfPeopleToHire) {
		this.numberOfPeopleToHire = numberOfPeopleToHire;
	}

	public String getLastApplicationDate() {
		return lastApplicationDate;
	}

	public void setLastApplicationDate(String lastApplicationDate) {
		this.lastApplicationDate = lastApplicationDate;
	}

	public List<Applicant> getApplicant() {
		return applicant;
	}

	public void setApplicant(List<Applicant> applicant) {
		this.applicant = applicant;
	}
}
