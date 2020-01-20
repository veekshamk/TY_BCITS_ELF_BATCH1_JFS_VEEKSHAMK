package org.bcits.methpgms;
public class Baby 
{
	String iceCream;
	public Baby(String iceCream) {
		super();
		this.iceCream = iceCream;
	}
	@Override
	public String toString() {
		return "Baby is receiving " + iceCream + " flavoured IceCream" ;
	}
}
