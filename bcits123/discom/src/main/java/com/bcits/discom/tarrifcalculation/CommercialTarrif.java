package com.bcits.discom.tarrifcalculation;

import java.util.Scanner;

public class CommercialTarrif {
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

			if(units>=0 && units<=1000) {
				bill=units*10;
			}else if(units>1000 && units<=2000){
				bill=units*15;
			}else if(units>2000){
				bill=units*18;
			}
			System.out.println("Bill is "+bill);
	}
}
		