package com.bcits.exception;

public class ATMSimulator  {
	int balance=40000;
	void withDraw(int amount) throws InsufficientBalance {
		if(amount<=balance) {
		System.out.println("withdraw successfull");
	}else {
		throw new InsufficientBalance();
	}
	}
}
