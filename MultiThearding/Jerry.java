package com.learn.MultiThearding;

public class Jerry  implements Runnable{
	Hospital h;
	public Jerry(Hospital h) {
		this.h=h;
	}

	@Override
	public void run() {
		h.JerryTreatment();
	}

}
