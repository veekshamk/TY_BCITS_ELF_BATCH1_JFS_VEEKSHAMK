package org.bcits.methpgms;
public class Friend 
{
	String gift;
	public Friend(String gift) {
		super();
		this.gift = gift;
	}
	@Override
	public String toString() {
		return  "friend got the "+gift;
	}
}
