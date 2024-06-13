package com.learn.MultiThearding;
public class Program4 implements Runnable {
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("Number")) {
			numPrinting();
		}
		else {
			charPrinting();
		}
	}

	private void charPrinting() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void numPrinting() {
		try {
			for (char i = 'a'; i <= 'e'; i++) {
				System.out.println(i);
				Thread.sleep(2000);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
