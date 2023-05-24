package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.PoliciesD;
import com.project.repository.PDRepository;
import com.project.service.PDService;

@Service
public class PDSImpl implements PDService{
	
	@Autowired 
	private PDRepository pDRepository;

	@Override
	public PoliciesD getPoliciesDById(PoliciesD policiesD) {
	PoliciesD pd=pDRepository.getPoliciesDById(policiesD);
		return pd;
	}

	
}
