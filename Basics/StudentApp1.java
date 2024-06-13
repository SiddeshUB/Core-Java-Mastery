package com.learn.Basics;
public class StudentApp1 {
	public static void main(String[] args) {
		Student1 s1 = new Student1();
		s1.name = "Manoj";
		s1.age = 24;
		s1.rollNo=101;
		s1.introduce();
		new Student1().name="Siddesh";
		new Student1().study();
		}
}
