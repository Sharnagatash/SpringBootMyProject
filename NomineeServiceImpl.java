package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Nominee;
import com.project.repository.NomineeRepository;

@Service
public class NomineeServiceImpl implements NomineeService {
	@Autowired
	private NomineeRepository nomineeRepository;

	@Override
	public Nominee saveNominee(Nominee nominee) {
		Nominee nomee = nomineeRepository.save(nominee);
		return nomee;
	}

}
