package com.learn.ExceptionHandling;

import java.util.Scanner;

public class ShoppingApp {
	public static void main(String[] args) {
		shop();
	}

	public static  void shop() {
		try {
			pay();
			System.out.println("Thank you for shopping");
		} catch (Exception e) {
			System.out.println("Exception is handle in the shop method");
			System.out.println("Shopping is ended");
		}
	}

	private static void pay() throws Exception{
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Please enter a amount");
			int amount = scan.nextInt();
			System.out.println("Payment is successfull of amount " + amount);
		} catch (Exception e) {
			System.out.println("Exception is handle in the pay method");
			throw e;
		}
	}
	
}
