package com.learn.MultiThearding;
public class Program {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		t.setName("mythread");
		t.setPriority(3);
		System.out.println(t);
	}
}
