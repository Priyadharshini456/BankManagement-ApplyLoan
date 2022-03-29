package com.bms.loanservice.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bms.loanservice.pojo.ApplyLoanData;
import com.bms.loanservice.pojo.ResponseData;
import com.bms.loanservice.service.LoanService;

@RestController
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	//@PostMapping("/applyloan")
	//public <ResponseEntity>ResponseData registerNewUser(@Valid @RequestBody ApplyLoanData applyLoanData, BindingResult bindingResult) throws BindException, ParseException {
		
//		if(bindingResult.hasErrors()) {
//			System.out.println(applyLoanData.getContact());
//			return new ResponseData(applyLoanData.getUsername(),"failure",404,"fields cannot be empty");
//		}
//		
//		ResponseData response = loanService.validationcheck(applyLoanData);
//		if(response.getStstus()=="success") {
//			LoanService.registrationdatainsertion(applyLoanData);
//		}
//		return response;
//	}

}
