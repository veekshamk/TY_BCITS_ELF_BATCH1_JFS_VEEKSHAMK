/*WAP to calculate factorial using lambda expression*/

package org.bcits.lambda;
import java.util.Scanner;
interface Fact 
{
	public int fact(int a);
}

public class Factorial 
{
	public static void main(String[] args) {
		Fact f = (a)-> {
			int res = 1;
			for (int i = a; i > 0; i--) {
				res=res * i;
			}
		return res ;	
		};
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1 =s.nextInt();
		System.out.println("Factorial of given num is : "+f.fact(num1));
		}
}

