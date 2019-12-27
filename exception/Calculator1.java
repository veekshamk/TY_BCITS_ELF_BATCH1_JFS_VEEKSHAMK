package com.bcits.exception;

public class Calculator1 {
	void division(int a, int b) throws ClassNotFoundException {
		try {
		Class.forName("Person");
		}catch(ClassNotFoundException c) {
			System.out.println("Class Not Found");
		}
	}

}
