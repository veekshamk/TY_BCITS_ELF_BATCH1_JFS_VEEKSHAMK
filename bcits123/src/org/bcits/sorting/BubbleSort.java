package org.bcits.sorting;
public class BubbleSort 
{
	public static void main(String[] args)
	{
		int a[]= {4,1,5,2,3};
		System.out.println("Array before Sorting:");
		for(int i=1; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
		bubbleSort(a);
		System.out.println("array after Sorting:");
		for(int i=1; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}

static void bubbleSort(int[] a)
{
	int n=a.length;
	int temp=0;
	for(int i=0; i<=n; i++)
	{
		for(int j=1; j<=n-i; j++)
		{
			if(a[j-1]>a[j])
			{
				temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}
		}
	}
}