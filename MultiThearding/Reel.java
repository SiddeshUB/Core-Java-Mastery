package com.learn.MultiThearding;
public class Reel extends Thread {
	public void run() {
		try {
		System.out.println("Reel is started");
		Thread.sleep(2000);
		System.out.println("Reel is happening");
		Thread.sleep(2000);
		System.out.println("Reel is ended");
		Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
