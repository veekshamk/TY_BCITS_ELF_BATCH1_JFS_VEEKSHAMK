package com.bcits.collection;
import java.util.*;

public class PriorityQueue1 {
	public static void main(String[] args) {
		PriorityQueue <Integer> p1=new PriorityQueue<Integer>();
		p1.add(12);
		p1.add(90);
		p1.add(55);
		p1.add(67);
		p1.add(16);
		p1.add(2);
		p1.add(2);
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		p1.add(null);
		System.out.println(p1);
	}

}
