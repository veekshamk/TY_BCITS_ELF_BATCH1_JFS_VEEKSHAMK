package com.ty.bcits.algorithms;
public class InsertionSort 
{
	/*public static void main(String[] args)
	{
		int a[]= {3,4,1,5,2};
		System.out.println("Array before Sorting:");
		for(int i:a) {
			System.out.println(i);
		}
		insertionSort(a);
		System.out.println("Array after Sorting:");
		for(int i:a) {
			System.out.println(i);
		}
	}*/

	public static int[] insertionSort(int[] a)
	{
		int n=a.length;
		for (int j = 1; j < n; j++)
			{ 
				int key = a[j];  
				int i = j-1;  
				while ( (i > -1) && ( a [i] > key ) )
				{  
					a [i+1] = a [i];  
					i--;  
				}  
        a[i+1] = key;  
    }  
	
	return a;
}
}
