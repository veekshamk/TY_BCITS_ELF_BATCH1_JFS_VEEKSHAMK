package com.abc.myjavaapp.common;

import com.mycomp.calculator.basic.BasicCalculator;

public class MyJavaApplicationStarterProgram {
	public static void main(String[] args) {

		BasicCalculator cal=new BasicCalculator();
		int sum=cal.add(10,20);
		System.out.println("sum==>"+sum);
	}

}
