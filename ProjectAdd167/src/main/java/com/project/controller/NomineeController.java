package com.project.controller;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.NomineeService;
import com.project.model.Nominee;


@RestController
public class NomineeController {
	private static final Logger logger = LoggerFactory.getLogger(NomineeController.class);
	@Autowired
	  private NomineeService nomineeService;
	 @PostMapping("/saveNomineeData")
	  public ResponseEntity<Nominee>saveNominee(@RequestBody Nominee nominee){
		  Nominee nom=nomineeService.saveNominee(nominee);
		return ResponseEntity.ok().body(nom);
		  
	  }
	  
}
