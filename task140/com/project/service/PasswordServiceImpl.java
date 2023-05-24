package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.PasswordRepository;
import com.project.model.Password;
@Service
public class PasswordServiceImpl implements PasswordService {
	@Autowired
private PasswordRepository passwordRepository;
	
	@Override
	public Password savePassword(Password password) {
		Password pawrd=passwordRepository.save(password);
		return pawrd;
	}

}
