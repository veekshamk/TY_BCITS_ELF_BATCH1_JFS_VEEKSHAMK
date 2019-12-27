package com.bcits.threads;

public class ThreadTest3 {
	public static void main(String[] args) {
		System.out.println("main started");
		Thread3 t1=new Thread3();
		Thread3 t2=new Thread3();
		Thread3 t3=new Thread3();
		Thread3 t4=new Thread3();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println("main ended");
		
	}

}
