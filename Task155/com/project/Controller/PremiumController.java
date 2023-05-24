package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Service.PremiumService;
import com.project.model.Premium;
@RestController
public class PremiumController {
	@Autowired
	private PremiumService premiumService;
	
	
	@DeleteMapping("/delete/{Id}")
	public void deleteById(@PathVariable("Id")Integer Id) {
	premiumService.deleteById(Id);
	}
	@PostMapping("/savePremiumData")
	public ResponseEntity<Premium> saveEmployee(@RequestBody Premium premium) {
		Premium prm = premiumService.savepremium(premium); //calling the method
		return ResponseEntity.ok().body(prm);

	}
}
