package com.bcits.threads;

public class ThreadTest4  {
	public static void main(String[] args) {
		System.out.println("main started");
		Thread4 t1= new Thread4();
		Thread4 t2= new Thread4();
		t1.start();
		t2.start();
		t1.leaveMe();
		t2.leaveMe();
		System.out.println("main ended");
	}

}
