package com.bms.loanservice.service;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.bms.loanservice.pojo.ApplyLoanData;
import com.bms.loanservice.pojo.ResponseData;

@Service
public class LoanService {

	public ResponseData validationcheck(@Valid ApplyLoanData applyLoanData) {
		
		
		return null;
	}

}
