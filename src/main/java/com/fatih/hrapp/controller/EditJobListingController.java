package com.fatih.hrapp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fatih.hrapp.model.JobListing;
import com.fatih.hrapp.service.JobListingService;

@Controller
public class EditJobListingController {
	@Autowired
	private JobListingService jobListingsService;
	
	@RequestMapping(value="/home/update/{id}", method=RequestMethod.GET)
	public String loadJobListing(@PathVariable int id, ModelMap modelMap) {
		JobListing jobListing = jobListingsService.findJobListing(id);
		modelMap.put("jobListing", jobListing);
		return "editJobListing";
	}
	
	@RequestMapping(value="/home/update/{id}", method=RequestMethod.POST)
	public String handleFromSubmit(@ModelAttribute @Valid JobListing jobListing, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
		if(bindingResult.hasErrors()) {
			return "editJobListing";
		}
		jobListingsService.updateJobListing(jobListing);
		redirectAttributes.addFlashAttribute("message", "Job Listing updated with id: " + jobListing.getId());
		return "redirect:/home";
	}
	
}
