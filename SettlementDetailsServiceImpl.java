package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.SettlementDetails;
import com.project.repository.SettlmentDetailsRepository;

@Service
public class SettlementDetailsServiceImpl implements SettlementDetailsService {
	@Autowired
	private SettlmentDetailsRepository settlementDetailsRepository;

	@Override
	public void deleteById(Integer id) {
		 settlementDetailsRepository.deleteById(id);

	}

}
