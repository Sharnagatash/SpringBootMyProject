package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.PoliciesD;
import com.project.repository.PDRepository;

@RestController
public class PDController {
	
	@Autowired
	private PDRepository pDRepository;
	
	@GetMapping("/GetPolicies details")
	public ResponseEntity<PoliciesD> getPoliciesDById(@RequestBody PoliciesD policiesD){
		
		PoliciesD pd=pDRepository.getPoliciesDById(policiesD);
		return ResponseEntity.ok().body(pd);
	}

}
