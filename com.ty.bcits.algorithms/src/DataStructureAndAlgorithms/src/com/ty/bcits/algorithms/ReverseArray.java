package com.ty.bcits.algorithms;

public class ReverseArray {
	public static int[] reverseArray(int[] a) 
	{
		System.out.println("reverse array is:");
		for(int i=a.length-1; i>0; i--)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
		return a;
		
	}

}
