package com.fatih.hrapp.service;

import java.util.List;

import com.fatih.hrapp.exception.JobListingNotFoundException;
import com.fatih.hrapp.model.JobListing;

public interface JobListingService {
	
	void createJobListing(JobListing jobListing);
	void deleteJobListing(int id);
	List<JobListing> findAllJobListing();
	void updateJobListing(JobListing jobListing);
	JobListing findJobListing(int id) throws JobListingNotFoundException;
}
