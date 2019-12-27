package com.bcits.exception;

public class CheckedCustom1 {
	public static void main(String[] args) {
		Student s=new Student();
		try {
			s.clone();
			Class.forName("Student");
		} catch (CloneNotSupportedException | ClassNotFoundException e) {
			System.out.println(e.getMessage());
	}
	}
}
