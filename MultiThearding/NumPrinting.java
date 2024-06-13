package com.learn.MultiThearding;

public class NumPrinting extends Thread{

	public void run() {
		try {
			for(int i=1;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
