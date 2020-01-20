package com.bcits.collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {
	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(22);
		a1.add(43);
		a1.add(65);
		System.out.println(a1);
		System.out.println("---------------");
		
		a1.add(2, 56);
		System.out.println(a1);
		System.out.println("-------------------");
		
		a1.remove(3);
		System.out.println(a1);
		System.out.println("-------------------");
		
		System.out.println(a1);
		a1.set(0, 99);
		System.out.println("--------------------");
		
		System.out.println(a1.indexOf(99));
		System.out.println(a1);
		System.out.println("--------------------");
		
		a1.add(3, 99);
		System.out.println(a1.lastIndexOf(99));
		System.out.println(a1);
		System.out.println("------------------");
		
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println(a1.remove(new Integer(99)));
		System.out.println(a1);
		
		ArrayList<Integer> a2= new ArrayList<Integer>();
		a2.add(22);
		a2.add(43);
		a2.add(65);
		a2.add(10);
		a2.add(61);
		System.out.println(a2);
		System.out.println("---------------");
		
		List l=(List) a2.subList(1, 3);
		for(int i=0; i<a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println(a2);
	}

}
