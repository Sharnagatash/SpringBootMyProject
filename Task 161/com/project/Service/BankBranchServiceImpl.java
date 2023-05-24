package com.project.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Model.BankBranch;
import com.project.Repository.BankBranchRepository;
@Service
public class BankBranchServiceImpl implements BankBranchService {
	
	@Autowired
 private BankBranchRepository branchrepository;
	
	@Override
	public BankBranch SaveBranch(BankBranch branch) {
		BankBranch brnch=branchrepository.save(branch);
		return brnch;
	}

}
