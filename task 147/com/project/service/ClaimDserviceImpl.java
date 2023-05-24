package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.ClaimDRepository;
import com.project.model.ClaimD;
@ Service
public class ClaimDserviceImpl implements ClaimDservice {
	@Autowired 
 private ClaimDRepository claimDRepository;
	

	@Override
	public ClaimD getClaimDById(Integer id) {
		ClaimD claim=claimDRepository.getById(id);
		return claim;
	}

}
