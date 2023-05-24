package com.project.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.model.PolicySchedule;

@Repository
public interface PolicyScheduleRepository extends CrudRepository<PolicySchedule, Serializable> {
	
	

}
