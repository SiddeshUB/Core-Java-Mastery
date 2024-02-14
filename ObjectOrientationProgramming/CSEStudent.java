package com.learn.ObjectOrientationProgramming;
public class CSEStudent implements StudentActivites {
	@Override
	public void study() {
		System.out.println("CSEStudent is studying");
	}
	@Override
	public void project() {
		System.out.println("CSEStudent is doing project");
	}
}
