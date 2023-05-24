package com.project.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.UserD;
import com.project.service.UserDService;


@RestController
public class UserDController {
	private static final Logger logger = LoggerFactory.getLogger(UserDController.class);
	@Autowired
  private UserDService userDService;
	@PostMapping("/addUserData")
	public ResponseEntity<UserD>saveUserD(@RequestBody UserD userD) {
		UserD user=userDService.saveuserD(userD);
		logger.info("In Rest Controller->saveUserD, Save UserD data");
		return ResponseEntity.ok().body(user);
		
	}
}
