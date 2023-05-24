package com.project.controller;
/*
 *task no 160 Design the resful web service  for policy schedule detail operation  
 * @Author Hitesh.
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import com.project.model.PolicySheduleDetail;
import com.project.service.PolicySheduleDetailService;



public class PolicySheduleDetailController {
	@Autowired
	private PolicySheduleDetailService policySheduleDetailService;

	

	@GetMapping("/get/Name")
	public ResponseEntity<PolicySheduleDetail> getPolicySheduleDetail (@PathVariable("Name") String Name ) {
		PolicySheduleDetail psd = policySheduleDetailService.getPolicySheduleDetailByName(Name); //calling the method
		return ResponseEntity.ok().body(psd);
}
}