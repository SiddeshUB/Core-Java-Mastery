package com.learn.ExceptionHandling;

public class UnderAgeException extends Exception {

	public UnderAgeException() {
		super("Age is under 18");
	}
}
