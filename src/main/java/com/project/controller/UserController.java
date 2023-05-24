package com.project.controller;
/*
 *task no 138 Design API to delete the user detail from data base  
 * @Author Hitesh.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.UserService;

@RestController
public class UserController {

	// inject the service
	@Autowired
	private UserService userService;

	// Design Restful Web services to delete the data based on id

	@DeleteMapping("/delete/{id}")
	public void deleteUserById(@PathVariable("id") Integer id) { 
		// calling the method
		userService.deleteById(id); 
	}

}
	
	
	

