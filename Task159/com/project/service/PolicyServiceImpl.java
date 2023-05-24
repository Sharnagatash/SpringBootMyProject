package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.PolicyRepository;
import com.project.model.Policy;

@Service
public class PolicyServiceImpl implements PolicyService {
	
@Autowired
	private PolicyRepository policyRepository;

	@Override
	public Policy savepolicy(Policy policy) {
		Policy pol=policyRepository.save(policy);
		return pol;
	}

}
