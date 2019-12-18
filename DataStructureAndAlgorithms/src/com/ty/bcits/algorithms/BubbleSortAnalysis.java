package com.ty.bcits.algorithms;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;
public class BubbleSortAnalysis 
{
	public static void main(String[] args)
	{
		/*int a[]= {100,50,80,40,70,60,90,1,2,3};
		System.out.println("Array before Sorting:");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");
		bubbleSort(a);
		System.out.println("Array after Sorting:");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.print("\n");*/
		
		countDurationBubbleSortAnalysis();
		//reverseArray(a);
		countDurationreverseArray();
	
		Random random=new Random();
		int intArray[]=new int[10];
        for(int i=0; i<intArray.length; i++)
        {
     	   intArray[i]=random.nextInt(10);
        System.out.println("No.: "+ i +intArray[i]);
		
        }
	}
	public static void countDurationreverseArray()
	{
		//int a[]= {4,1,5,2,3};
		Instant start=Instant.now();
		//System.out.println("BubbleSort:"));
		Instant end=Instant.now();
		Long duration=Duration.between(start, end).toMillis();
		double seconds=duration/10000.0;
		System.out.println("sorting took "+ seconds +" seconds");
	}
	
	public static void countDurationBubbleSortAnalysis()
	{
		Instant start=Instant.now();
		//System.out.println("BubbleSort:");
		//bubbleSort(a);
		Instant end=Instant.now();
		Long duration=Duration.between(start, end).toMillis();
		double seconds=duration/10000.0;
		System.out.println("sorting took "+ seconds +" seconds");
	}
	
	public static void countDurationBubbleSortAnalysis()
	{
		Instant start=Instant.now();
		System.out.println("BubbleSort:");
		//bubbleSort(a);
		Instant end=Instant.now();
		Long duration=Duration.between(start, end).toMillis();
		double seconds=duration/10000.0;
		System.out.println("sorting took "+ seconds +" seconds");
	}
	
	
static void reverseArray(int[] a) 
{
	System.out.println("reverse array is:");
	for(int i=a.length-1; i>0; i--)
	{
		System.out.print(a[i]+" ");
	}
	System.out.print("\n");
}

static void bubbleSort(int[] a)
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

}

}
