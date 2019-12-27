package com.bcits.exception;

public class TestB {
	public static void main(String[] args) {
		String name=null;

		System.out.println("main started");
		try {
			System.out.println(100/0);
			System.out.println(name.length());
		}catch(ArithmeticException a) {
			System.out.println(a.getMessage());
		}catch(NullPointerException n) {
			System.out.println(n.getMessage());
		}
		System.out.println("main ended");
	}
}
