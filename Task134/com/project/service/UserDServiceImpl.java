package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.UserDRepository;
import com.project.model.UserD;

@Service
public class UserDServiceImpl implements UserDService {
	@Autowired
	private UserDRepository userDRepository;

	@Override
	public UserD saveuserD(UserD userD) {
		UserD  user=userDRepository.save(userD);
		return user;
	}
	

}
