package com.learn.ExceptionHandling;
public class OverAge extends Exception {
	public OverAge() {
		super("Age is over 60");
	}
}
