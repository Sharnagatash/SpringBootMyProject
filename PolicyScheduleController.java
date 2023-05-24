package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.PolicySchedule;
import com.project.service.PolicyScheduleService;

@RestController
public class PolicyScheduleController {
	@Autowired
	private PolicyScheduleService policyScheduleService;

	@PostMapping("/add")
	public ResponseEntity<PolicySchedule> addPolicySchedule(@RequestBody PolicySchedule policySchedule) {
		PolicySchedule schedule = policyScheduleService.savePolicySchedule(policySchedule);
		return ResponseEntity.ok().body(schedule);

	}

}
