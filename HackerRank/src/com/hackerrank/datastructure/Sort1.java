package com.hackerrank.datastructure;

import java.util.Scanner;

public class Sort1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of students:");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("enter the student id:");
			int id=sc.nextInt();
			System.out.println("enter the student name:");
			String name=sc.next();
			System.out.println("enter the CGPA:");
			double cgpa=sc.nextDouble();
			System.out.println(id+" "+name+" "+cgpa);
		}
	}
	
}
