package com.fatih.hrapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.fatih.hrapp.service.JobListingService;

@Controller
public class DeleteJobListingController {
	@Autowired
	private JobListingService jobListingsService;
	
	@RequestMapping(value="/home/delete/{id}")
	public String delete(@PathVariable int id, RedirectAttributes redirectAttributes) {
		jobListingsService.deleteJobListing(id);
		redirectAttributes.addFlashAttribute("message", "Job Listing deleted with id: " + id);
		return "redirect:/home";
	}
}
