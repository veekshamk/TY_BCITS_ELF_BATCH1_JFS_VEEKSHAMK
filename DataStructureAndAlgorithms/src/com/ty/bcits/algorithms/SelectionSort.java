package com.ty.bcits.algorithms;
public class SelectionSort 
{
/*	public static void main(String[] args) 
	{
		int a[]= {3,6,9,1,2};
		System.out.println("Array before Sorting:");
		for(int i:a)
		{
			System.out.println(i);
		}
		selectionSort(a);
		System.out.println("Array after Sorting:");
		for(int i:a)
		{
			System.out.println(i);
		}
	}*/
static void selectionSort(int[] a)
{
	for (int i = 0; i < a.length - 1; i++)  
    {  
        int index = i;  
        for (int j = i + 1; j < a.length; j++){  
            if (a[j] < a[index]){  
                index = j;//searching for lowest index  
            }  
        }  
        int smallerNumber = a[index];   
        a[index] = a[i];  
        a[i] = smallerNumber;  
    }  
}
}
