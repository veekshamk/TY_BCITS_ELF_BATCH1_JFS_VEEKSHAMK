package com.bcits.collection;

import java.util.LinkedHashSet;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		LinkedHashSet<Integer> l1= new LinkedHashSet <Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(10);
		l1.add(90);
		l1.add(30);
		l1.add(null);
		l1.add(null);
		l1.add(20);
		System.out.println(l1);
		l1.remove(20);
		System.out.println(l1);

}
}
