package com.learn.ExceptionHandling;

import java.util.Scanner;

public class ProgramException {
	public static void main(String[] args) {
		try {
			System.out.println("Calculation is started");
			divide();
		} catch (Exception e) {
			System.out.println("Exception is handle in main method");
		}
		System.out.println("Calculation is ended");
	}

	public static void divide() throws Exception{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the numerator");
			int a = scan.nextInt();
			System.out.println("Enter a denominator");
			int b = scan.nextInt();
			int c = a / b;
			System.out.println("Division result is " + c);
		} catch (Exception e) {
			System.out.println("Exception is handled in divide method");
			throw e;
		}
		finally {
			System.out.println("Division is ended");
		}
	}
}
