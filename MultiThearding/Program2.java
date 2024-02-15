package com.learn.MultiThearding;
public class Program2 {
	public static void main(String[] args) {
		NumPrinting np = new NumPrinting();
		CharPrinting cp = new CharPrinting();
		np.start();
		cp.start();
	}
}
