package com.learn.MultiThearding;
public class ProgramThreadingApp {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		ProgramThreading p  = new ProgramThreading();
		p.setName("ProgramThread");
		p.run();
	}
}
