package com.fatih.hrapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.fatih.hrapp.model.JobListing;
import com.fatih.hrapp.service.JobListingService;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("dev")
@Transactional
public class JobListingServiceTests {
	
	@Autowired
	private JobListingService jobListingService;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Test(expected=PersistenceException.class)
	public void testCreateJobListing() {
		
		JobListing j = new JobListing();
		j.setJobTitle(null);
		j.setJobDescription(null);
		j.setLastApplicationDate(null);
		
		jobListingService.createJobListing(j);
		
		entityManager.flush();
		
	}
	
}
