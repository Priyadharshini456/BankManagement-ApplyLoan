package com.bms.loanservice.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotBlank;

import org.springframework.beans.factory.annotation.Autowired;

import com.bms.loanservice.entity.LoanTypeMaster;

public class ApplyLoanData {
	

	@NotBlank(message = "customerId cannot be empty..")
	long customerId;
	
	@NotBlank(message = "Loan Amount cannot be empty..")
	double loanAmount;
	
	Date loanDate;
	
	@NotBlank(message = "Interest Rate cannot be empty..")
	double intrestRate;
	
	@NotBlank(message = "Loan Duration cannot be empty..")
	int loanDuration;
	
	//LoanTypeMaster loanTypeMaster;
	
	String loanType;

	public ApplyLoanData(long customerId, double loanAmount, Date loanDate, double intrestRate, int loanDuration,String loanType) {
		super();
		//this.loanTypeMaster=loanTypeMaster;
		this.customerId = customerId;
		this.loanAmount = loanAmount;
		this.loanDate = loanDate;
		this.intrestRate = intrestRate;
		this.loanDuration = loanDuration;
		this.loanType=loanType;
		
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public Date getLoanDate() {
		return loanDate;
	}

	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	public double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public String getLoanType() {
		return loanType;
	}

	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	
	
	

	
}
