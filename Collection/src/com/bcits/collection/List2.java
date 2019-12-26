package com.bcits.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List2 {
	public static void main(String[] args) {
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		
		System.out.println(a1);
		
		System.out.println("---iteration using for loop---");
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("---iteration using forEach loop---");
		for (Integer integer : a1) {
			System.out.println(integer);
		}
		
		System.out.println("---iteration using forward direction---");
		ListIterator<Integer> itr=a1.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---iteration using backward direction---");
		ListIterator<Integer> itr1=a1.listIterator(a1.size());
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
		
		System.out.println("---iteration using forward direction---");
		ListIterator<Integer> itr3=a1.listIterator();
		while(itr3.hasNext()) {
			System.out.println(itr3.next());
			a1.add(10);
		}
	}

}
