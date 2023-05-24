package com.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/* @author - prathamesh
 * 
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.BankDetailsService;

@RestController
public class BankDetailsController {

	private static final Logger logger = LoggerFactory.getLogger(BankDetailsController.class);
	@Autowired
	private BankDetailsService bankDetailsService;

	@DeleteMapping("/delete/{id}")
	void deleteById(@PathVariable("id") Integer id) {
		logger.info("at bankdetails controller");
		bankDetailsService.deleteById(id);

	}

}
