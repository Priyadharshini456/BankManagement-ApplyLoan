package com.bms.loanservice.pojo;

public class ResponseData {
	
	
	long loanId;
	
	String status;
	
	int code;
	
	String message;

	public ResponseData(long loanId, String status, int code, String message) {
		super();
		this.loanId = loanId;
		this.status = status;
		this.code = code;
		this.message = message;
	}

	public ResponseData() {
		// TODO Auto-generated constructor stub
	}

	public long getLoanId() {
		return loanId;
	}

	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}
