package com.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Policy;
import com.project.service.PolicyService;

@RestController
public class policyController {
	
	@Autowired
    private PolicyService policyService;
     
	@PostMapping("/addPolicyData")
	public ResponseEntity<Policy>saveUserD(@RequestBody Policy policy) {
		Policy pol =policyService.savepolicy(policy);
		return ResponseEntity.ok().body(pol);
	}
}
