package com.project.service;
/*
 *task no 160 Design the resful web service  for policy schedule detail operation  
 * @Author Hitesh.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.PolicySheduleDetailRepository;
import com.project.model.PolicySheduleDetail;
@Service
public class PolicySheduleDetailServiceImpl implements PolicySheduleDetailService {
     @Autowired
	private PolicySheduleDetailRepository policySheduleDetailRepository;
	@Override
	public PolicySheduleDetail getPolicySheduleDetailByName (String Name)  {
		PolicySheduleDetail policySheduleDetail=policySheduleDetailRepository.findByName(Name);
		return policySheduleDetail;
	}

}
