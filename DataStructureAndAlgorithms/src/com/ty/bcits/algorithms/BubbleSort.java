package com.ty.bcits.algorithms;
public class BubbleSort 
{
	/*public static void main(String[] args)
	{
		int a[]= {100,90,80,70,60,50};
		System.out.println("Array before Sorting:");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		bubbleSort(a);
		System.out.println("Array after Sorting:");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}*/
	
public static int[] bubbleSort(int[] a)
{
	int n=a.length;
	int temp=0;
	for(int i=0; i<n; i++)
	{
		for(int j=1; j<n-i; j++)
		{
			if(a[j-1]>a[j])
			{
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
		}
	}
return a;
}
}
