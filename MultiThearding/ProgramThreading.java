package com.learn.MultiThearding;
public class ProgramThreading extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}
