package com.bcits.discom.tarrifcalculation;

import java.util.Scanner;

public class ResidentialTarrif {
	public static void main(String[] args) {
		System.out.println("Tarrif Calculation for Residential Consumers :");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Initial Reading:");
		double initUnits=sc.nextDouble();
		System.out.println("Enter the Final Reading:");
		double finalUnits=sc.nextDouble();
		double units=finalUnits-initUnits;
		System.out.println("Units is: "+units);
		double bill=1;

			if(units>=0 && units<=100) {
				bill=units*4;
			}else if(units>100 && units<=200){
				bill=units*5;
			}else if(units>200){
				bill=units*8;
			}
			System.out.println("Bill is "+bill);
	}
}
		