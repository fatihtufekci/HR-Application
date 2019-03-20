package com.fatih.hrapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fatih.hrapp.model.Applicant;
import com.fatih.hrapp.model.JobListing;
import com.fatih.hrapp.service.ApplicantService;
import com.fatih.hrapp.service.JobListingService;

@Controller
public class ApplicantController {
	
	@Autowired
	private ApplicantService applicantService;
	@Autowired
	private JobListingService jobListingsService;
	
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView m = new ModelAndView();
		m.addObject("jobListings", jobListingsService.findAllJobListing());
		m.setViewName("index");
		return m;
	}
	
	@RequestMapping(value="/newJobApplication", method=RequestMethod.GET)
	public String newJobApplication() {
		return "newJobApplication";
	}
	
	@ModelAttribute
	public Applicant initModel() {
		return new Applicant();
	}
	
	@RequestMapping(value="/newJobApplication", method=RequestMethod.POST)
	public String handleFormApplicant(@ModelAttribute Applicant applicant) {
		applicantService.createApplicant(applicant);
		return "redirect:/";
	}
}