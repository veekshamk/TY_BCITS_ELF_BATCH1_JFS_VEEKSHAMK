package com.bcits.exception;

public class TestC {
	public static void main(String[] args) {
		String name=null;

		System.out.println("main started");
		try {
			System.out.println(100/0);
			System.out.println(name.length());
		}catch(ArithmeticException | NullPointerException a ) {
			System.out.println(a.getMessage());
		}
		System.out.println("main ended");
	}

}