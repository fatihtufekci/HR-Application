package com.fatih.hrapp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
public class JobListing {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotEmpty(message="can't be empty value")
	private String jobTitle;

	@NotEmpty(message="can't be empty value")
	private String jobDescription;

	@Min(value = 1, message = "Incorrect value. At least 1 person should be recruited.")
	@Max(200)
	// @NotEmpty
	private int numberOfPeopleToHire;

	@NotEmpty(message="can't be empty value")
	@Pattern(regexp = "[12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01])", message = "Incorrect date value.! Must be in YYYY-MM-DD format")
	private String lastApplicationDate;

	@ManyToMany(mappedBy="jobListings", cascade=CascadeType.ALL)
	private List<Applicant> applicant;

	public JobListing() {
	}

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
