package com.bcits.collection;


import java.util.Vector;

public class Vector1 {
	public static void main(String[] args) {
		Vector <Integer> v1= new Vector <Integer>();
		v1.add(88);
		v1.add(98);
		v1.add(88);
		v1.add(10);
		v1.add(72);
		v1.add(12);
		v1.add(10);
		v1.add(null);
		
		System.out.println("-----adding elements-----");
		System.out.println(v1);
		System.out.println("-------------------------");
		
		System.out.println("--remove 2nd index element--");
		System.out.println(v1.remove(2));
		System.out.println(v1);
		System.out.println("-------------------------");
		
		System.out.println("--check it is empty or not--");
		System.out.println(v1);
		System.out.println(v1.isEmpty());
		System.out.println("-------------------------");
		
		System.out.println("----------size of vector----------");
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println("--------------------------");
		
		System.out.println("-------wheck it contains value 88--------------- ");
		System.out.println(v1);
		System.out.println(v1.contains(88));
		System.out.println("-----------------------");
		
		System.out.println(v1.capacity());
		System.out.println("-----------capacity of vector------------------");
		
		System.out.println(v1);
		v1.insertElementAt(55, 5);
		System.out.println("----------insert 55 at 5th index----------------");
		
		System.out.println("------remove 10----------------");
		System.out.println(v1);
		v1.removeElement(10);
		System.out.println(v1);
		System.out.println("-------------------------------");
		
		System.out.println(v1);
		v1.setElementAt(34, 4);
		System.out.println(v1);
		System.out.println("---------set 34 at 4th index-----------");
		System.out.println("---------------------------");
		
		System.out.println(v1.capacity());
		System.out.println("-----------capacity of vector------------------");
		
		v1.ensureCapacity(7);
		v1.trimToSize();
		v1.setSize(8);
		System.out.println(v1);
		System.out.println("-------------set size-----------");
		System.out.println("--------------------------");
		
		
		System.out.println(v1);
		
	}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               

}






















