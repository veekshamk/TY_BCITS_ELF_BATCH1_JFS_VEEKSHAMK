package org.bcits.patterns;
import java.util.Scanner;
public class Pattern7 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of n:");
	int n=sc.nextInt();
	
	for (int i = 1; i <= n; i++)
    {
        for (int j = n; j > i; j--)
        {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++)
        {
            if( j== 1 || j == i )
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
    for (int i = 1; i <= n-1; i++)
    {
        for (int j = 1; j <= i; j++)
        {
            System.out.print(" ");
        }
        for (int j = n-1; j >= i; j--)
        {
            if( j == n-1 || j == i )
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
    }
}
}
