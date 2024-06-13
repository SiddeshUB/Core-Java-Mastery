package com.learn.MultiThearding;
public class CharPrinting1 implements Runnable {
	@Override
	public void run() {
		try {
			for(char i='a';i<='e';i++) {
				System.out.println(i);
				Thread.sleep(3000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
