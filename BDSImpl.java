package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.BranchDetails;
import com.project.repository.BDRepository;
import com.project.service.BDService;

@Service
public class BDSImpl implements BDService{

	@Autowired
	private BDRepository bDRepository;

	@Override
	public BranchDetails saveBranchDetails(BranchDetails branchDetails) {
		BranchDetails bd=bDRepository.save(branchDetails);
		return bd;
	}
	
	
}
