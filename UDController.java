package com.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.UserDetails;
import com.project.service.UDService;

@RestController
public class UDController {
	
	private static final Logger logger = LoggerFactory.getLogger(UDController.class);
	@Autowired
	private UDService uDService;
	
	@PostMapping("/saveUserDetails")
	public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetails userdetails){
		UserDetails user1= uDService.saveUserDetails(userdetails);
		logger.info("In RestController->update UserDetails-save UserDetails");
		return ResponseEntity.ok().body(user1);
	}

}
