package com.learn.Basics;
public class MOImplicit {
	public static void main(String[] args) {
		int a=10,b=20;
		float p=10.5f,q=20.5f;
		double m=100.5,n=200.5;
		System.out.println(add(p,q));
		System.out.println(add(a,n));
	}

	public static double add(float p, double q) {
		return p+q;
	}
	public static double add(double p, float q) {
		return p+q;
	}
}
