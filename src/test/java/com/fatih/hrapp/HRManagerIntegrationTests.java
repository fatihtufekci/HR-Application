package com.fatih.hrapp;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.fatih.hrapp.model.JobListing;
import com.fatih.hrapp.service.JobListingService;

@RunWith(SpringRunner.class)
@SpringBootTest(properties= {"spring.profiles.active=dev"})
public class HRManagerIntegrationTests {

	@Autowired
	private JobListingService jobListingService;

	@Test
	public void testFindJobListing() {
		List<JobListing> jobListingList = jobListingService.findAllJobListing();
		MatcherAssert.assertThat(jobListingList.size(), Matchers.equalTo(0));
	}
	
}

