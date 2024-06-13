package com.learn.MultiThearding;
public class Program1 {
	public static void main(String[] args) {
		printNum();
		printChar();
	}

	private static void printNum() {
		
			try {
				for(int i=1;i<=5;i++) {
					System.out.println(i);
				Thread.sleep(3000);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}

	private static void printChar() {
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
