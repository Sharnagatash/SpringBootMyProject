package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.PremiumD;

@Repository
public interface PDRepository extends JpaRepository<PremiumD,Integer>{

}
