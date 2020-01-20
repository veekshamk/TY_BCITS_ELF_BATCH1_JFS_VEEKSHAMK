/*WAP to print the numbers of given range using lambda expression*/

package org.bcits.lambda;
import java.util.Scanner;
interface Range
{
	public String range(int a,int b);
}

public class RangeOfNumber {

	public static void main(String[] args) {
		Range a1 = (a,b)-> {
			String res = " ";
			for (int i = a; i <= b; i++) {
				res = res + i +" ";
			}
		return res;	
		};
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the start number:");
		int start =s.nextInt();
		System.out.println("Enter the end number:");
		int end =s.nextInt();
		System.out.println("Numbers between the given range is : " + a1.range(start,end));
		}
}
