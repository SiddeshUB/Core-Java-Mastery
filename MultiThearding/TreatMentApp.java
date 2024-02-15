package com.learn.MultiThearding;
public class TreatMentApp {
	public static void main(String[] args) {
		Treatment tr = new Treatment();
		Thread t1 = new Thread(tr);
		Thread t2 = new Thread(tr);
		
		t1.setName("Tom");
		t2.setName("Jeery");
		
		t1.start();
		t2.start();
	}
}
