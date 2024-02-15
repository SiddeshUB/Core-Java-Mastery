package com.learn.MultiThearding;
public class PizzaHouseApp {
	public static void main(String[] args) {
		PizzaHouse ph = new PizzaHouse();
		Baker br = new Baker(ph);
		Customer ch = new Customer(ph);
		Thread t1 = new Thread(br);
		Thread t2 = new Thread(ch);
		t1.start();
		t2.start();
	}
}
