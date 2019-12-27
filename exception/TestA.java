package com.bcits.exception;

public class TestA {
	public static void main(String[] args) throws ClassNotFoundException {
		Calculator1 c1=new Calculator1();
		System.out.println("main started");
		c1.division(100, 0);
		System.out.println("main ended");
	}

}
