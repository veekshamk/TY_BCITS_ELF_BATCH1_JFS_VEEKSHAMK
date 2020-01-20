package com.bcits.exception;

public class AgeLimitException extends RuntimeException {
	String msg="Age is less than 18";
	
	AgeLimitException(){
		super();
	}
	AgeLimitException(String msg){
		this.msg=msg;
	}
	public String getMessage() {
		return this.msg;
	}

}
