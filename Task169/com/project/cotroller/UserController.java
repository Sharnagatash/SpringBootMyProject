package com.project.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.User;
import com.project.service.UserService;
@RestController
public class UserController {
	@Autowired
 private UserService userService;
	@PostMapping
	public User saveuser(@RequestBody User user) {
		User usr=userService.Saveuser(user);
		return usr;
	}
}
