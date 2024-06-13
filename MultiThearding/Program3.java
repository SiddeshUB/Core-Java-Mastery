package com.learn.MultiThearding;
public class Program3 {
	public static void main(String[] args) {
		NumPrinting1 np = new NumPrinting1();
		CharPrinting1 cp = new CharPrinting1();
		Thread t1 = new Thread(np);
		Thread t2 = new Thread(cp);
		t1.start();
		t2.start();
	}
}
