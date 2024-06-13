package com.learn.MultiThearding;
public class ProgramApp4 {
	public static void main(String[] args) {
		Program4 p = new Program4();
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		
		t1.setName("Number");
		t2.setName("Character");
		
		t1.start();
		t2.start();
	}
}
