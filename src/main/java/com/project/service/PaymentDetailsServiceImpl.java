package com.project.service;
/*
 *task no 152 Design the resful web service  for Nominee delete  operation  
 * @Author Hitesh.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.PaymentDetailsRepository;
import com.project.model.PaymentDetails;

@Service
public class PaymentDetailsServiceImpl implements PaymentDetailsService {

	
	@Autowired
	private PaymentDetailsRepository paymentDetailsRepository;
     @Override
	public PaymentDetails savePaymentDetails (PaymentDetails paymentDetails ) {
		PaymentDetails pay = paymentDetailsRepository.save(paymentDetails);
		return pay;
	}

}
