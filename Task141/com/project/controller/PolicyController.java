package com.project.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Policy;
import com.project.service.PolicyService;

@RestController
public class PolicyController {
	private static final Logger logger = LoggerFactory.getLogger(PolicyController.class);
	@Autowired
 private  PolicyService policyService;
	@PostMapping("/addPolicyData")
	public ResponseEntity<Policy>savePolicy(@RequestBody Policy policy) {
		Policy polic=policyService.savepolicy(policy);
		logger.info("In Rest Controller->savPolicy, Save  Policy data");
		return ResponseEntity.ok().body(polic);
	}
  
}
