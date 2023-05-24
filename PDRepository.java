package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.PoliciesD;

@Repository
public interface PDRepository extends JpaRepository<PoliciesD,Integer>{

	PoliciesD getPoliciesDById(PoliciesD policiesD);

}
