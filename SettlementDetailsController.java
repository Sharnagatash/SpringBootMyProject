package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.SettlementDetails;
import com.project.service.SettlementDetailsService;

@RestController
public class SettlementDetailsController {
	@Autowired
	private SettlementDetailsService settlementDetailsService;

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") Integer id) {
		settlementDetailsService.deleteById(id);
	}

}
