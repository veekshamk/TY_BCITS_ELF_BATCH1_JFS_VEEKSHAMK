package org.bcits.patterns;
import java.util.Scanner;
public class Pattern9b
{
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n:");
	int n=sc.nextInt();
	for (int i=1; i<=(n*2)-1; i++)
	{
		for(int j=1; j<=n; j++)
		{
			if(j==i||j==n-i+1)
			{
				System.out.print("*");
			}
			System.out.print(" ");
		}
		System.out.println();
	}
}
}