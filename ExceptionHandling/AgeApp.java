package com.learn.ExceptionHandling;
import java.util.Scanner;
public class AgeApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a age");
		int age = scan.nextInt();
		try {
			eligibleDL(age);
		} catch (Exception e) {
			System.out.println("Exception is handled");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private static void eligibleDL(int age) throws Exception {
		if(age>=18 && age<=65) {
			System.out.println("Take the driving license");
		}
		else if(age<18) {
			throw new UnderAgeException();
		}
		else {
			throw new OverAge();
		}
		
	}
}
