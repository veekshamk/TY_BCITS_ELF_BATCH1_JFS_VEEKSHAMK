package com.bcits.threads;

public class Thread5 extends Thread {
	public synchronized void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
