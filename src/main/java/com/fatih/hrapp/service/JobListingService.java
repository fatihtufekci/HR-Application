package com.fatih.hrapp.service;

import java.util.List;

import com.fatih.hrapp.model.JobListing;

public interface JobListingService {
	
	void createJobListing(JobListing jobListing);
	void deleteJobListing(int id);
	List<JobListing> findJobListing();
	void updateJobListing(JobListing jobListing);
}
