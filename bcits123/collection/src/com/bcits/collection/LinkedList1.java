package com.bcits.collection;

import java.util.LinkedList;

public class LinkedList1 {
	public static void main(String[] args) {
		LinkedList <Integer> l1= new LinkedList <Integer>();
		l1.add(88);
		l1.add(98);
		l1.add(10);
		l1.add(72);
		
		System.out.println("-----adding elements-----");
		System.out.println(l1);
		System.out.println("-------------------------");
		
		System.out.println("--remove 2nd index element--");
		System.out.println(l1.remove(2));
		System.out.println(l1);
		System.out.println("-------------------------");
		
		System.out.println("----check it contains element 72 or not----");
		System.out.println(l1.contains(72));
		System.out.println(l1);
		System.out.println("------------------------------");
		
		System.out.println("----------check it is empty or not----------");
		System.out.println(l1.isEmpty());
		System.out.println(l1);
		System.out.println("--------------------------------");
		
		System.out.println("-----------size-----------");
		System.out.println(l1);
		System.out.println(l1.size());
		
		LinkedList <Integer> l2= new LinkedList <Integer>();
		l2.add(18);
		l2.add(93);
		l2.add(10);
		l2.add(56);
		System.out.println(l2);
		
		l2.addAll(l1);
		System.out.println(l2);
	}

}
