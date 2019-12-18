package com.ty.bcits.algorithms;
import java.util.Scanner;
public class SortMain {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size of array:");
	int size=s.nextInt();
	int[] a=RandomArrayCreation.array(size);
	Duration.unsortedArrayDuration(a);
	Duration.bubbleSortDuration(a);
	Duration.selectionSortDuration(a);
	
}
}
