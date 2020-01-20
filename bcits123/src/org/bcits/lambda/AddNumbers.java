/*WAP to add two numbers using lambda expression*/

package org.bcits.lambda;
import java.util.Scanner;
interface Arithmetic 
{
	public int add(int a,int b);
}

public class AddNumbers
{
	public static void main(String[] args) {
		Arithmetic a1 = (a,b)-> {
		return a+b;	
		};
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number1:");
		int num1 =s.nextInt();
		System.out.println("Enter the number2:");
		int num2 =s.nextInt();
		System.out.println("sum is : " + a1.add(num1, num2));
		}
}
