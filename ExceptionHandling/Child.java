package com.learn.ExceptionHandling;

import java.io.IOException;
import java.util.InputMismatchException;

public class Child extends Parent {
	@Override
	void display() throws Exception{
		System.out.println("child class display method");
	}
}
