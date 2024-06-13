package com.learn.MultiThearding;
public class NumPrinting1 implements Runnable {
	@Override
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
