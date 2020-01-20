package org.bcits.methpgms;
import java.util.Scanner;
public class IceCream 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter flavour of Icecream :");
		Baby flavour = new Baby(sc.nextLine());
		System.out.println(flavour);
	}

}
