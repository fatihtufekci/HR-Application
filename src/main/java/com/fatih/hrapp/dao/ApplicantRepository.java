package com.fatih.hrapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fatih.hrapp.model.Applicant;

@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Integer> {

}
