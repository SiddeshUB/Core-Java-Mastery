package com.learn.ExceptionHandling;

import java.util.Scanner;

public class ExceptionProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a first number");
		try {
			int a = scan.nextInt();
			System.out.println("Enter a second number");
			int b = scan.nextInt();
			System.out.println("calculation is stared");
			add(a,b);
			sub(a,b);
			mul(a,b);
			divide(a,b);
		} catch (Exception e) {
			System.out.println("Exception is handle in the main mehod");
		}finally {
			System.out.println("Calculation is ended");
		}
	}

	private static void divide(int a, int b) throws Exception{
		try {
			System.out.println("Division is started");
			int c = a / b;
			System.out.println("Division result is :" + c);
		} catch (Exception e) {
			System.out.println("Exception handle in div method");
			throw e;
		}finally {
			System.out.println("Division is ended");
		}
	}

	private static void mul(int a, int b) throws Exception{
		System.out.println("Multipication is started");
		int c = a*b;
		System.out.println("Multipication result is :"+c);
		System.out.println("Multipication is ended");
		
	}

	private static void sub(int a, int b) {
		try {
			System.out.println("Subtraction is started");
			int c = a - b;
			System.out.println("Subtraction result is :" + c);
		} catch (Exception e) {
			System.out.println("Exception is handle in sub method");
		}finally {
			System.out.println("Subtraction is ended");
		}
	}

	public static void add(int a, int b) {
		System.out.println("Addition is started");
		int c = a+b;
		System.out.println("Addition result is :"+c);
		System.out.println("Addition is ended");
	}
}
