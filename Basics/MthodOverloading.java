package com.learn.Basics;
public class MthodOverloading {
	public static void getmaggi() {
		System.out.println("Bill for normal maggi is 30rs");
	}
	public static void getmaggi(int chesse) {
		System.out.println("Bill for chesse maggi is "+(chesse+30)+"rs");
	}
	public static void getmaggi(int pepper,int chesse) {
		System.out.println("Bill for chesse maggi is "+(chesse+pepper+30)+"rs");
	}
	public static void getmaggi(int chesse,String type) {
		System.out.println("Bill for chesse maggi of "+type+" is "+(chesse+30)+"rs");
	}
	
	public static void main(String args[]) {
		getmaggi();
		getmaggi(40);
		getmaggi(20,40);
		getmaggi(40,"veg");
	}
}
