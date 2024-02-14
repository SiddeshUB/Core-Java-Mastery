package com.learn.ExceptionHandling;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to withdrawn");
		int amt = scan.nextInt();
		withdraw(amt);
		
		} catch (InsufficientBalanceException ibe) {
			ibe.printStackTrace();
		}

	}

	private static void withdraw(int amt) throws InsufficientBalanceException {
		int balance = 5000;
		if(amt <=balance) {
			System.out.println("Amount is withdrawn");
		}
		else {
			throw new InsufficientBalanceException();
		}
	}
}
