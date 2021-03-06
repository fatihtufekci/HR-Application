package com.fatih.hrapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.fatih.hrapp.model.JobListing;
import com.fatih.hrapp.service.JobListingService;

@Controller
public class HRManagerLoginAndHomeController {
	
	@Autowired
	private JobListingService jobListingsService;
	
	@RequestMapping("/home")
	public ModelAndView home() {
		ModelAndView m = new ModelAndView();
		m.addObject("jobListings", jobListingsService.findAllJobListing());
		m.setViewName("home");
		return m;
	}
	
	@RequestMapping("/login.html")
	public ModelAndView login() {
		ModelAndView m = new ModelAndView();
		m.setViewName("login");
		return m;
	}
}
