package com.bms.loanservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class LoanTypeMaster {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int loanTypeId;
	
	
	@Column
	String loanType;

	public LoanTypeMaster(int loanTypeId, String loanType) {
		super();
		this.loanTypeId = loanTypeId;
		this.loanType = loanType;
	}


	public LoanTypeMaster(String loanType) {
		// TODO Auto-generated constructor stub
		this.loanType=loanType;
	}
	public LoanTypeMaster() {}


	public int getLoanTypeId() {
		return loanTypeId;
	}


	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}


	public String getLoanType() {
		return loanType;
	}


	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	
	@Override
	public String toString() {
		return "LoanTypeMaster [loanTypeId=" + loanTypeId + ", loanType=" + loanType + "]";
	}


	
}
