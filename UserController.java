package com.project.controller;

/*@author - prathemsh
 * 
 */
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Nominee;
import com.project.model.User;
import com.project.service.NomineeService;
import com.project.service.UserService;

@RestController
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;
	@Autowired
	private NomineeService nomineeService;

	// design a api to save user and multiple nominee

	@PostMapping("/save")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		logger.info("at UserController");
		User use = userService.saveUser(user);

		List<Nominee> nominee = use.getNomineelist();
		for (Nominee nomi : nominee) {
			nomi.setNomineeid(user.getId());
			nomineeService.saveNominee(nomi);

		}

		return ResponseEntity.ok().body(use);

	}

}
