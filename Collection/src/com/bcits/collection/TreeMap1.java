package com.bcits.collection;

import java.util.TreeMap;


public class TreeMap1 {
	public static void main(String[] args) {
		TreeMap <Student, Integer> t1=new TreeMap<Student, Integer>();
		t1.put(new Student(20, "Veeksha"),45);
		t1.put(new Student(15, "Likhith"),41);
		t1.put(new Student(18, "Sampreeth"),40);
		System.out.println(t1);
		
	}

}
