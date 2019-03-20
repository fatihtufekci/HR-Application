package com.fatih.hrapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatih.hrapp.dao.ApplicantRepository;
import com.fatih.hrapp.model.Applicant;

@Service
public class ApplicantServiceImpl implements ApplicantService{

	private ApplicantRepository applicantRepository;
	
	@Autowired
	public void setApplicantRepository(ApplicantRepository applicantRepository) {
		this.applicantRepository = applicantRepository;
	}
	
	@Override
	public void createApplicant(Applicant applicant) {
		applicantRepository.save(applicant);
	}

	@Override
	public void deleteApplicant(int id) {
		applicantRepository.deleteById(id);
	}

	@Override
	public List<Applicant> findApplicant() {
		return (List<Applicant>)applicantRepository.findAll();
	}

	@Override
	public void updateApplicant(Applicant applicant) {
		applicantRepository.save(applicant);
	}

}
