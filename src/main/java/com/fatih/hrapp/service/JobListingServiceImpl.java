package com.fatih.hrapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatih.hrapp.dao.JobListingRepository;
import com.fatih.hrapp.model.JobListing;

@Service
public class JobListingServiceImpl implements JobListingService{

	private JobListingRepository jobListingRepository;
	
	@Autowired
	public void setJobListingRepository(JobListingRepository jobListingRepository) {
		this.jobListingRepository = jobListingRepository;
	}
	
	@Override
	public void createJobListing(JobListing jobListing) {
		jobListingRepository.save(jobListing);
	}

	@Override
	public void deleteJobListing(int id) {
		jobListingRepository.deleteById(id);
	}

	@Override
	public List<JobListing> findAllJobListing() {
		return (List<JobListing>)jobListingRepository.findAll();
	}

	@Override
	public void updateJobListing(JobListing jobListing) {
		jobListingRepository.save(jobListing);
	}

	@Override
	public JobListing findJobListing(int id) {
		return jobListingRepository.findById(id).get();
	}

}
