package com.fatih.hrapp.service;

import java.util.List;

import com.fatih.hrapp.model.Applicant;

public interface ApplicantService {
	
	void createApplicant(Applicant applicant);
	void deleteApplicant(int id);
	List<Applicant> findApplicant();
	void updateApplicant(Applicant applicant);
}
