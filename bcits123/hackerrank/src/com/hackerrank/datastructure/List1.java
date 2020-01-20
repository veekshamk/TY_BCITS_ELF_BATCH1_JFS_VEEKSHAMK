package com.hackerrank.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements:");
		int n=Integer.parseInt(sc.nextLine());
		
		List<Integer> list=null;
		list=new ArrayList<Integer>(n);
		
		for(int i=0; i<n; i++) {
			System.out.println("enter the value at "+i+"th index");
			list.add(i, Integer.parseInt(sc.nextLine()));
		}
		System.out.println(list.toString());
		
		System.out.println("enter the number of queries:");
		int q=Integer.parseInt(sc.nextLine());
		for(int i=0; i<q; i++)
		{
			System.out.println("enter the String insert/delete:");
			String query=sc.nextLine();
			if(query.equalsIgnoreCase("INSERT")) {
				System.out.println("enter the index for insertion:");
				int x=Integer.parseInt(sc.nextLine());
				System.out.println("enter the value for insertion:");
				int y=Integer.parseInt(sc.nextLine());
				list.add(x,y);
				n++;
				System.out.println(list.toString());
			}
			else if(query.equalsIgnoreCase("DELETE"))
			{
				System.out.println("enter the index for deletion:");
				int x=Integer.parseInt(sc.nextLine());
				list.remove(x);
				n--;
				System.out.println(list.toString());
			}
		}
	}

}
