package com.learn.ExceptionHandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numerator");
		try {
			int a = scan.nextInt();
			System.out.println("Enter Denominator");
			int b = scan.nextInt();
			int c = a/b;
			System.out.println("Division result is " + c);
			System.out.println("Enter the size of an array");
			int size = scan.nextInt();
			int arr[] = new int[size];
			System.out.println("Array is created");
			System.out.println("Enter an index at which element has to be stored");
			int index = scan.nextInt();
			System.out.println("Enter the Element to be stored");
			int element = scan.nextInt();
			arr[index] = element;
			System.out.println("Element is storesd successfully in the array");
			}catch (ArithmeticException ar) {
				System.out.println("Do not enter denominator as 0");
			}catch (NegativeArraySizeException nase) {
				System.out.println("Do not provide negativeArray size ");
			}catch (InputMismatchException ip) {
				System.out.println("Enter the correct input");
			}
			catch (Exception e) {
					e.printStackTrace();
			}
			finally {
				System.out.println("Program Execution is ended");
				scan.close();
			}
	}
}
