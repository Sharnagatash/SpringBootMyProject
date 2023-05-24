package com.project.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.UserRepository;
import com.project.model.User;
import com.project.service.UserService;

@Service
public class UserServiceImpl implements UserService  {
	
	@Autowired
private UserRepository userrepository;
	
	@Override
	public User Saveuser(User user) {
		User usr=userrepository.save(user);
		return usr;
	}

}
