package com.project.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Nominee;
import com.project.service.NomineeService;

@RestController
public class NomineeController {

	@Autowired
	private NomineeService nomineeService;

	@PostMapping("/saveNomineeData")
	public Nominee savenominee(@RequestBody Nominee nominee) {
		Nominee nomi = nomineeService.saveNominee(nominee);
		return nomi;
	}
}
