package com.fatih.hrapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fatih.hrapp.model.JobListing;
import com.fatih.hrapp.service.JobListingService;

@Controller
public class AddJobListingController {
	
	@Autowired
	private JobListingService jobListingsService;
	
	@RequestMapping(value="/newJobListing", method=RequestMethod.GET)
	public String newJobApplication() {
		return "newJobListing";
	}
	
	@ModelAttribute
	public JobListing initModel() {
		return new JobListing();
	}
	
	@RequestMapping(value="/newJobListing", method=RequestMethod.POST)
	public String handleFormJobListing(@ModelAttribute @Valid JobListing jobListing, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return "newJobListing";
		}
		jobListingsService.createJobListing(jobListing);
		return "redirect:/home";
	}
}
