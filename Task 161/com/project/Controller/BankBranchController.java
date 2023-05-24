package com.project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.Model.BankBranch;
import com.project.Service.BankBranchService;
@RestController
public class BankBranchController {

	@Autowired
	private BankBranchService bankbranchService;

	@PostMapping("/saveBranchData")
	public ResponseEntity<BankBranch> saveEntity(@RequestBody BankBranch branch) {
		BankBranch brch = bankbranchService.SaveBranch(branch);
		return ResponseEntity.ok().body(brch);
	}
} 