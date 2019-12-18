package com.ty.bcits.algorithms;

import java.time.Duration;
import java.time.Instant;

public class Duration 
{
	public static void bubbleSortDuration(int[] a)
	{
		Instant s=Instant.now();
		int b[]=BubbleSort.bubbleSort(a);
		ArrayDisplay.display(b);
		Instant e=Instant.now();
		Long duration=Duration.between(s, e).toMillis();
		double seconds=duration/10000.0;
		System.out.println("sorting took "+ seconds +" seconds");
		System.out.println();
	}
	
	public static void selectionSortDuration(int[] a)
	{
		Instant s=Instant.now();
		int b[]=SelectionSort.selectionSort(a);
		ArrayDisplay.display(b);
		Instant e=Instant.now();
		Long duration=Duration.between(s, e).toMillis();
		double seconds=duration/10000.0;
		System.out.println("sorting took "+ seconds +" seconds");
		System.out.println();
	}
	
	public static void reverseArrayDuration(int[] a)
	{
		Instant s=Instant.now();
		int b[]=ReverseArray.bubbleSort(a);
		ArrayDisplay.display(b);
		Instant e=Instant.now();
		Long duration=Duration.between(s, e).toMillis();
		double seconds=duration/10000.0;
		System.out.println();
		System.out.println("reverse array took "+ seconds +" seconds");
		System.out.println();
	}
	
	public static void unsortedArrayDuration(int[] a)
	{
		Instant s=Instant.now();
		System.out.println();
		ArrayDisplay.display(a);
		Instant e=Instant.now();
		Long duration=Duration.between(s, e).toMillis();
		double seconds=duration/10000.0;
		System.out.println();
		System.out.println("sorting took "+ seconds +" seconds");
		System.out.println();
	}
}
