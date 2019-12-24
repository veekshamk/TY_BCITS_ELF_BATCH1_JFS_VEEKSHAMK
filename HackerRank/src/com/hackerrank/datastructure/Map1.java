package com.hackerrank.datastructure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the entries:");
		int n=Integer.parseInt(sc.nextLine());

		Map<String, Long> map=new HashMap<String, Long>(n);

		for(int i=0; i<n; i++) {
			System.out.println("enter the Person's name:");
			String name=sc.nextLine();
			System.out.println("enter the phone number:");
			long number=Long.parseLong(sc.nextLine());
			map.put(name, number);
		}
		System.out.println(map);

		System.out.println("enter the number of queries:");
		int q=Integer.parseInt(sc.nextLine());
		for(int i=1; i<=q; i++)
		{
			System.out.println("enter the name of person:");
			String name=sc.nextLine();
			Long number=map.get(name);
			
			if(number!=null) {
				System.out.println(name+" "+number);
			}
			else {
				System.out.println("not found");
			}
		}

		
	}



}