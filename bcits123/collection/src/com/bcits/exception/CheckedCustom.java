package com.bcits.exception;

public class CheckedCustom {
	public static void main(String[] args) {
		Person p=new Person();
		System.out.println("main started");
		try {
		p.clone();
		System.out.println("object cloned");
		}catch(CloneNotSupportedException c) {
			System.out.println(c.getMessage());
		}
		System.out.println("main ended");
	}

}
