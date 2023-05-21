package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.PremiumRepository;
@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	private PremiumRepository premiumrepository;
	@Override
	public void deleteById(Integer id) {
		premiumrepository.deleteById(id);
		
	}

}
