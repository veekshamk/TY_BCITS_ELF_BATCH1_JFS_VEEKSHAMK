package org.bcits;
public class Lambda1
{
public static void main(String[] args) 
{
	Addition add=(int a, int b)->(a+b);
	System.out.println("Addition="+add.operation(5, 6));
}
}

interface Addition{
	int operation(int a, int b);
}