package com.learn.ObjectOrientationProgramming;
public class FoodPlate implements MainCourse, Dessert{
	@Override
	public void eatDessert() {
		System.out.println("Food plate contains biryani as main course");
	}
	@Override
	public void eatMainCourse() {
		System.out.println("Food plate contains ice cream as course");
	}

}
