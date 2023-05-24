package com.project.controller;
/*
 *task no 161 Design API to add branch detail into system  
 * @Author Hitesh.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Policys;
import com.project.service.PolicysService;

@RestController
public class PolicysController {
	@Autowired
	private PolicysService policysService ;

	public Policys updatePolicys(@PathVariable int id, @RequestBody Policys policys ) {
		policys.setId(id);
		return policysService.updatePolicys(policys);
	}
	
	}

