package com.ty.bcits.algorithms;
import java.util.Scanner;
public class SortMain {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.print("enter the size of array:");
	int size=s.nextInt();
	int[] a=RandomArrayCreation.randomArrayCreation(size);
	Durations.unsortedArrayDuration(a);
	Durations.bubbleSortDuration(a);
	Durations.selectionSortDuration(a);
	Durations.reverseArrayDuration(a);
	Durations.insertionSortDuration(a);
	Durations.mergeSortDuration(a);
	//Durations.binarySearch(arr,0,last,key);
}
}
