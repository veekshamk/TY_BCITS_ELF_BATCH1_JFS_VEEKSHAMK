package com.bcits.collection;

import java.util.TreeSet;

public class TreeSet1 {
	public static void main(String[] args) {
		TreeSet <Person, Integer> t1=new TreeSet <Person, Integer>();
		t1.put(new Person(20, "Veeksha"));
		t1.put(new Person(15, "Likhith"));
		t1.put(new Person(18, "Sampreeth"));
		System.out.println(t1);
			
			
		
	}

}
