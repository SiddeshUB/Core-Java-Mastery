package com.learn.MultiThearding;
public class Treatment implements Runnable{
	@Override
	 synchronized public void run() {
		String name = Thread.currentThread().getName();
		try {
			System.out.println("Treatment is Started in ICU for "+name);
			Thread.sleep(3000);
			System.out.println("Treatment is going on ICU for "+name);
			Thread.sleep(3000);
			System.out.println("Treatment is ended on ICU for "+name);
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
