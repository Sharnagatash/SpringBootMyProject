package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.PolicySchedule;
import com.project.repository.PolicyScheduleRepository;

@Service
public class PolicyScheduleServiceImpl implements PolicyScheduleService {
	@Autowired
	private PolicyScheduleRepository policyScheduleRepository;

	@Override
	public PolicySchedule savePolicySchedule(PolicySchedule policySchedule) {
		PolicySchedule schedule = policyScheduleRepository.save(policySchedule);
		return schedule;
	}

}
