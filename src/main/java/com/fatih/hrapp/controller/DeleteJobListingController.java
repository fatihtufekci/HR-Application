package com.fatih.hrapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fatih.hrapp.service.JobListingService;

@Controller
public class DeleteJobListingController {
	@Autowired
	private JobListingService jobListingsService;
	
	@RequestMapping(value="/home/delete/{id}")
	public String delete(@PathVariable int id) {
		jobListingsService.deleteJobListing(id);
		return "redirect:/home";
	}
}
