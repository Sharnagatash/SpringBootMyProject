package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.ClaimD;
import com.project.service.ClaimDservice;

@RestController
public class ClaimDController {
	@Autowired
	private ClaimDservice claimDservice;

	@GetMapping("/fetch/{id}")
	public ResponseEntity<ClaimD> getEmployeeById(@PathVariable("id") Integer id) { // id contain 2
		// calling method
		ClaimD claim = claimDservice.getClaimDById(id);
		return ResponseEntity.ok().body(claim);
	}
}
