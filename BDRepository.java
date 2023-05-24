package com.project.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.model.BranchDetails;

@Repository
public interface BDRepository extends CrudRepository<BranchDetails,Integer>{

}
