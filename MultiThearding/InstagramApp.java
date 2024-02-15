package com.learn.MultiThearding;
public class InstagramApp {
	public static void main(String[] args) {
		System.out.println("Instagram is started");
		Chatting ch = new Chatting();
		Reel r = new Reel();
	
		try {
			ch.start();
			r.start();
			ch.join();
			r.join();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Instagram is ended");
	}
}
