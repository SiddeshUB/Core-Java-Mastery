package com.learn.MultiThearding;
public class Compilation extends Thread {
	public void run() {
		try {
			for (; ;) {
				System.out.println("Compiling the code");
				Thread.sleep(2000);
			} 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
