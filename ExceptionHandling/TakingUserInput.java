package com.learn.ExceptionHandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TakingUserInput {
	public static void main(String[] args) {
		try {
			System.out.println("Enter a String");
			String str = takeInput();
			System.out.println("Enter String is " + str);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static String takeInput() throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String str = br.readLine();
		return str;
	}

}
