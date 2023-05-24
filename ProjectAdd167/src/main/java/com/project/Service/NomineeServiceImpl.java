package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.NomineeRepository;
import com.project.model.Nominee;
@Service
public class NomineeServiceImpl implements NomineeService {

	@Autowired
	private NomineeRepository nomineerepository;
	@Override
	public Nominee saveNominee(Nominee nominee) {
		return nominee;
		
		
	}

}
