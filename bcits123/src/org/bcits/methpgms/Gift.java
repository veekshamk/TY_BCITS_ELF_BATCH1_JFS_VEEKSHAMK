package org.bcits.methpgms;
import java.util.Scanner;
public class Gift 
{
	public static void main(String[] args) 
	{
		String gift;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a gift name : ");
		Friend f =new Friend(sc.nextLine());
		System.out.println(f);
	}
}
