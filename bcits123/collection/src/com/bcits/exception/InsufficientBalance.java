package com.bcits.exception;

public class InsufficientBalance extends Exception {
	String msg="insufficient balance";
	public InsufficientBalance() {
		super();
	}
	InsufficientBalance(String msg){
		this.msg=msg;
	}
	@Override
	public String getMessage() {
		return this.msg;
	}

}
