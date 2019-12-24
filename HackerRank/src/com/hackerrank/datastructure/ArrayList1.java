package com.hackerrank.datastructure;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList1 {
	public static void main(String[] args) {
		System.out.println("enter the number of lines:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		ArrayList<ArrayList<Integer>> arrayLists=new ArrayList<ArrayList<Integer>>(n);
		ArrayList<Integer> arrayList=null;

		for(int i=1; i<=n; i++)
		{
			System.out.println("enter the number of digits in "+ i+"th line");
			int d=sc.nextInt();
			arrayList= new ArrayList<Integer>(d);
			arrayList.add(0,d);

			for(int j=1; j<=d; j++) {
				System.out.println("enter the value in "+j+"th position");
				arrayList.add(j, sc.nextInt());
			}
			System.out.println(arrayList.toString());
			arrayLists.add(arrayList);
		}
		System.out.println(arrayLists.toString());

		System.out.println("enter the number of queries:");
		int q=sc.nextInt();

		for(int i=1; i<=q; i++) {
			System.out.println("enter the line number:");
			int x=sc.nextInt();
			System.out.println("enter the position:");
			int y=sc.nextInt();

			try
			{
				System.out.println(arrayLists.get(x-1).get(y-1));
			}catch(Exception e) {
				System.err.println("error msg");
			}
		}
	}

}
