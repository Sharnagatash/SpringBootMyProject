package com.project.service.implement;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.project.Repository.NomineeRepository;
import com.project.model.Nominee;
import com.project.service.NomineeService;
@Service
public class NomineeServiceImpl implements NomineeService {
	
    @Autowired
	private NomineeRepository nomineerepository;
	
	@Override
	public Nominee saveNominee(Nominee nominee) {
		Nominee nomin=nomineerepository.save(nominee);
		return nomin ;
	}

}
