package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.BranchDetails;
import com.project.service.BDService;

@RestController
public class BDController {

	@Autowired 
	private BDService bDService;
	
	@PostMapping("/saveBranchDetails/{id}")
	public ResponseEntity<BranchDetails> saveBranchDetails(@RequestBody BranchDetails branchDetails){
		BranchDetails bd=bDService.saveBranchDetails(branchDetails);
		return ResponseEntity.ok().body(bd);
}
}