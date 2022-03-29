package com.bms.loanservice.service;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;

import com.bms.loanservice.entity.LoanDetail;
import com.bms.loanservice.entity.LoanTypeMaster;
import com.bms.loanservice.pojo.ApplyLoanData;
import com.bms.loanservice.repository.LoanDetailRepository;
import com.bms.loanservice.repository.LoanTypeRepository;

import java.text.ParseException;

public class LoanServiceJpa {
	
	@Autowired
	LoanDetailRepository loanDetailRepository;
	
	@Autowired
	LoanTypeRepository loanTypeRepository;
	
	
public void loandatainsertion(ApplyLoanData obj) throws ParseException {
		
		LoanTypeMaster lm= new LoanTypeMaster(obj.getLoanType());
		LoanDetail ld= new LoanDetail(lm,obj.getCustomerId(),obj.getLoanAmount(),(Date) new SimpleDateFormat("dd/MM/yyyy").parse(obj.getLoanDate()),obj.getIntrestRate(),obj.getLoanDuration()); 
		
		
        loanDetailRepository.save(ld);
        loanTypeRepository.save(lm);	
	}

}
