package com.hackerrank.datastructure;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class HashSet1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of pairs of set:");
	int n=Integer.parseInt(sc.nextLine());
	ArrayList<Integer> list=new ArrayList<Integer>();
	HashSet<String> set=new HashSet<String>();
	
	for(int i=1; i<=n; i++) {
		System.out.println("enter the pair "+i);
		set.add(sc.nextLine());
		list.add(set.size());
	}
	System.out.println("\n"+"all the unique pairs");
	for(int pair: list) {
		System.out.println(pair);
		
	}
	
}
}
