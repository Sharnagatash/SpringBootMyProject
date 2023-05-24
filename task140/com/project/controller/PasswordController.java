package com.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Password;
import com.project.service.PasswordService;
@RestController
public class PasswordController {
	private static final Logger logger = LoggerFactory.getLogger(PasswordController.class);
	@Autowired
 private PasswordService passwordService;
	@PostMapping("/addPolicyData")
	public ResponseEntity<Password >saveUserD(@RequestBody Password password) {
		Password paswrd =passwordService.savePassword(password);
		return ResponseEntity.ok().body(paswrd);
	}
 
}

