package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.ClaimDService;

@RestController
public class ClaimDController  {
	
	@Autowired 
	private ClaimDService claimDService;
	
	@DeleteMapping("/delete/{id}")
	public void deleteClaimDetailsById(@PathVariable("id")Integer id){
     claimDService.deleteById(id);
		
	}

}
