package org.bcits;
public class Lambda 
{
	    // operation is implemented using lambda expressions 
	    interface LambdaInter1 
	    { 
	        int operation(int a, int b); 
	    } 
	  
	    // sayMessage() is implemented using lambda expressions  
	    interface LambdaInter2 
	    { 
	        void sayMessage(String message); 
	    } 
	  
	    // Performs LambdaInter1's operation on 'a' and 'b' 
	    private int operate(int a, int b, LambdaInter1 l) 
	    { 
	        return l.operation(a, b); 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        // lambda expression for addition for two parameters 
	        // data type for x and y is optional. 
	        // This expression implements 'LambdaInter1' interface 
	        LambdaInter1 add = (int x, int y) -> x + y; 
	  
	        // Creating an object of Test to call operate using 
	        // different implementations using lambda Expressions 
	        Lambda l=new Lambda(); 
	  
	        // Add two numbers using lambda expression 
	        System.out.println("Addition is " + 
	                          l.operate(6, 3, add)); 
	  
	        
	    } 
	} 

