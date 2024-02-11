package com.learn.ExceptionHandling;

import java.util.Scanner;

public class Calculator1 {

	public static void main(String[] args) {
		System.out.println("Calculation is started");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = scan.nextInt();
		System.out.println("Enter second number");
		int b = scan.nextInt();
		multiply(a,b);
		division(a,b);
		System.out.println("Calculation is ended");
	}

	public  static void division(int a, int b) {
	try {
				System.out.println("Divison is started");
		int c = a/b;
		System.out.println("Divison result is "+c);
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception is handle in division method");
		}
			System.out.println("Divison is ended");
		
	}

	public static void multiply(int a, int b) {
		System.out.println("Multipication is started");
		int c = a*b;
		System.out.println("Multiplication result is "+c);
		System.out.println("Multipication is ended");
		}
}
