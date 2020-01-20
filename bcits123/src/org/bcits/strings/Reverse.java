package org.bcits.strings;
import java.util.Scanner;
public class Reverse
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the String:");
	String str=sc.nextLine();
	String revstr="";
	char[] ch=str.toCharArray();
	for(int i=ch.length-1; i>=0; i--)
	{
		revstr=revstr+ch[i];
	}
	System.out.println(revstr);
}
}
