package com.ty.bcits.algorithms;
import java.time.Duration;
import java.time.Instant;

public class Durations 
{
	public static void bubbleSortDuration(int[] a)
	{
		Instant s=Instant.now();
		int b[]=BubbleSort.bubbleSort(a);
		ArrayDisplay.display(b);
		Instant e=Instant.now();
		Long duration=Duration.between(s,e).toMillis();
		double seconds=duration/10000.0;
		System.out.println("bubble sorting took "+ seconds +" seconds");
		System.out.println();
	}
	
	public static void insertionSortDuration(int[] a)
	{
		Instant s=Instant.now();
		int b[]=InsertionSort.insertionSort(a);
		ArrayDisplay.display(b);
		Instant e=Instant.now();
		Long duration=Duration.between(s,e).toMillis();
		double seconds=duration/10000.0;
		System.out.println("insertion sorting took "+ seconds +" seconds");
		System.out.println();
	}
	
	public static void mergeSortDuration(int[] a)
	{
		int f=0;
		int l=a.length-1;
		Instant s=Instant.now();
		int b[]=MergeSort.sort(a, f, l);
		ArrayDisplay.display(b);
		Instant e=Instant.now();
		Long duration=Duration.between(s,e).toMillis();
		double seconds=duration/10000.0;
		System.out.println("merge sorting took "+ seconds +" seconds");
		System.out.println();
	}
	
	/*public static void quickSortDuration(int[] a)
	{
		Instant s=Instant.now();
		int b[]=QuickSort.quickSort(arr, 1, 2);
		ArrayDisplay.display(b);
		Instant e=Instant.now();
		Long duration=Duration.between(s,e).toMillis();
		double seconds=duration/10000.0;
		System.out.println("bubble sorting took "+ seconds +" seconds");
		System.out.println();
	}*/
	
	public static void selectionSortDuration(int[] a)
	{
		Instant s=Instant.now();
		int b[]=SelectionSort.selectionSort(a);
		ArrayDisplay.display(b);
		Instant e=Instant.now();
		Long duration=Duration.between(s,e).toMillis();
		double seconds=duration/10000.0;
		System.out.println("selection sorting took "+ seconds +" seconds");
		System.out.println();
	}
	
/*	public static void binarySearchDuration(int[] a)
	{
		Instant s=Instant.now();
		int b[]=BinarySearch.binarySearch(b, 0, 0, 0);
		ArrayDisplay.display(b);
		Instant e=Instant.now();
		Long duration=Duration.between(s,e).toMillis();
		double seconds=duration/10000.0;
		System.out.println("binary search took "+ seconds +" seconds");
		System.out.println();
	}*/
	
	public static void reverseArrayDuration(int[] a)
	{
		Instant s=Instant.now();
		int b[]=ReverseArray.reverseArray(a);
		ArrayDisplay.display(b);
		Instant e=Instant.now();
		Long duration=Duration.between(s, e).toMillis();
		double seconds=duration/10000.0;
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
		System.out.println("unsorted array sorting took "+ seconds +" seconds");
		System.out.println();
	}
}
