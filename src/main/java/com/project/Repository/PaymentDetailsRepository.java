package com.project.Repository;
/*
 *task no 152 Design the resful web service  for Nominee delete  operation  
 * @Author Hitesh.
 */
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.PaymentDetails;

@Repository
public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Integer> {

}
