package com.ty.bcits.algorithms;
import java.util.Random;
public class RandomArrayCreation 
{
	public int[] randomArrayCreation(int size)
	{
		Random random=new Random();
		int intArray[]=new int[10];
        for(int i=0; i<intArray.length; i++)
        {
     	   intArray[i]=random.nextInt(10);
        System.out.println("No.: "+ i +intArray[i]);
	}
  return intArray;
	}
}

/*public static void main(String[] args) 
{
	//new RandomArrayCreation().randomArrayCreation(100);
	int[] a=RandomArrayCreation.array(100);
}
}*/
