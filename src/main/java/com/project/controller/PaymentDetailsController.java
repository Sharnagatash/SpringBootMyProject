package com.project.controller;
/*
 *task no 152 Design the resful web service  for Nominee delete  operation  
 * @Author Hitesh.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.PaymentDetails;
import com.project.service.PaymentDetailsService;

@RestController
public class PaymentDetailsController {


	@Autowired
	private PaymentDetailsService paymentDetailsService;

	

	@PostMapping("/savePaymentDetailsData")
	public ResponseEntity<PaymentDetails> savePaymentDetails (@RequestBody PaymentDetails paymentDetails ) {
		PaymentDetails pay = paymentDetailsService.savePaymentDetails (paymentDetails ); //calling the method
		return ResponseEntity.ok().body(pay);
	}
}
