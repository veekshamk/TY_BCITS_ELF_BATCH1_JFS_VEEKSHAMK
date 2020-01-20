package org.bcits;
public class LambdaAddition 
{
		public static void main(String[] args)
		{

			// Addition using Lambda expression
			Arithmetic addition = (int a, int b) -> (a + b);
			// Arithmetic addition = (int a, int b) -> {return a + b;};

			System.out.println("Addition = " + addition.operation(6, 6));
		}
	}

interface Arithmetic {
	int operation(int a, int b);
}
