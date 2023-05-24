package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Repository.PremiumRepository;
import com.project.model.Premium;
@Service
public class PremiumServiceImpl implements PremiumService {

	@Autowired
	private PremiumRepository premiumrepository;
	@Override
	public void deleteById(Integer Id) {
		premiumrepository.deleteById(Id);
	}	
	
	@Override
	public Premium savepremium(Premium premium) {
		Premium prm=premiumrepository.save(premium);
		return prm;
	}

}
