package com.fatih.hrapp.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fatih.hrapp.model.JobListing;

@Repository
public interface JobListingRepository extends CrudRepository<JobListing, Integer>{

}
