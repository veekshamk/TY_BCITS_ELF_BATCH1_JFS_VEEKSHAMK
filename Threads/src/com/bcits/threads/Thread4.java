package com.bcits.threads;

public class Thread4 extends Thread {
	public synchronized void run() {
		System.out.println("Thread is called");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
			synchronized void leaveMe() {
				System.out.println("notify called");
				notifyAll();
				
		
	}

}
