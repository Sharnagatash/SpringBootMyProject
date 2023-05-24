package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.User;
import com.project.repository.UserRepository;
import com.project.service.UserService;

@Service
public class UserSImpl implements UserService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
	User user2= userRepository.save(user);
		return user2;
	}

}
