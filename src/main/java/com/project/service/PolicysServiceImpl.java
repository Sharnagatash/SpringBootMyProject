package com.project.service;
/*
 *task no 161 Design API to add branch detail into system  
 * @Author Hitesh.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.PolicysRepository;
import com.project.model.Policys;
@Service
public class PolicysServiceImpl implements PolicysService{
	
	@Autowired
	private PolicysRepository policysRepository;

		@Override
		public Policys updatePolicys(Policys policys) {
			Policys pol =policysRepository.save(policys);
			return pol;
		}
}
