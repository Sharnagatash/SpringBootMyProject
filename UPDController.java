package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.PremiumD;
import com.project.model.User;
import com.project.service.PDService;
import com.project.service.UserService;

@RestController
public class UPDController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private PDService pDService;
	
	@PostMapping("/userPremium")
	public User saveUPD(@RequestBody User user) {
		User user2=userService.saveUser(user);
		List<PremiumD> pre =user.getPremiumDList();
		for(PremiumD premiumD : pre) {
			premiumD.setUserId(user.getId());
			pDService.savePremiumD(premiumD);
	}
return user2;
}
}