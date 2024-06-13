package com.learn.MultiThearding;

public class Baker implements Runnable {
	PizzaHouse ph;
	int num=0;
	public Baker(PizzaHouse ph) {
		this.ph = ph;
	}
	@Override
	public void run() {
		while(true) {
			ph.bake(num++);
		}
	}

}
