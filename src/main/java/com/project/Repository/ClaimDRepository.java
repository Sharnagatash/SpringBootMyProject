package com.project.Repository;


import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.project.model.ClaimDetails;

@Repository
public interface ClaimDRepository extends CrudRepository<ClaimDetails,Serializable>{

}
