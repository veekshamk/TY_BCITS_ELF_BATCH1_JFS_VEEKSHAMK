package com.ty.bcits.algorithms;
import java.util.*;
public class MergeSort 
{
  public static void main(String[] args) 
  {
	int arr[]= {4,5,0,8,9};
    System.out.println("Array before Merge Sort is: ");
    for (int i = 0; i < arr.length; i++)
    {
    	System.out.println(arr[i]);
    }
    arr = Merge_sort(arr, arr.length);
    System.out.println("Array after Merge Sort is: ");
    for (int i = 0; i < arr.length; i++)
    {
    System.out.print(arr[i]+" ");
    }
  }

  static int[] Merge_sort(int arr[], int size) 
  {
    if (size > 1) 
    {
      int mid = size / 2;
      int[] first = Arrays.copyOfRange(arr, 0, mid);
      first = Merge_sort(first, mid); // recursive call for first half array
      int[] second = Arrays.copyOfRange(arr, mid, size);
      second = Merge_sort(second, size - mid); // recursive call for second half array
      arr = Merge_arrays(first, second, mid, size - mid);
    }
    return arr;
  }

  static int[] Merge_arrays(int first[], int second[], int n, int m) // respectively
  {
    int arr[] = new int[n + m];
    int i = 0, f = 0, s = 0;
    while (f < n && s < m)
    {
      if (first[f] < second[s])
        arr[i++] = first[f++];
      else
        arr[i++] = second[s++];
    }
    while (f < n)
      arr[i++] = first[f++];
    while (s < m)
      arr[i++] = second[s++];
    return arr;
  }
}
