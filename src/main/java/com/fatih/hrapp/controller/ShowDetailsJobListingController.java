package com.fatih.hrapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fatih.hrapp.model.JobListing;
import com.fatih.hrapp.service.JobListingService;

@Controller
public class ShowDetailsJobListingController {
	@Autowired
	private JobListingService jobListingsService;
	
	@RequestMapping(value = "/home/details/{id}", method = RequestMethod.GET)
	public ModelAndView home(@PathVariable int id) {
		ModelAndView m = new ModelAndView();
		JobListing j = jobListingsService.findJobListing(id);
		if(j.getApplicant()!=null) {
			m.addObject("jobListings", j.getApplicant());
		}
		m.setViewName("jobListDetails");
		return m;
	}
	
}
