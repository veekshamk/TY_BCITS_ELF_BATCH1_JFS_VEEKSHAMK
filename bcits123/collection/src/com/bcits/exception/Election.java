package com.bcits.exception;

public class Election {
	void vote(int age) {
		if(age>18) {
			System.out.println("Allow him to vote");
		}else {
			throw new AgeLimitException();
		}
	}

}
