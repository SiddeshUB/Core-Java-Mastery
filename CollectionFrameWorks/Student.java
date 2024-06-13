package com.learn.CollectionFrameWorks;
public class Student {
		int rollNo;
		String name;
		float percentage;
	public Student(int rollNo,String name,float percentage) {
		this.rollNo = rollNo;
		this.name = name;
		this.percentage = percentage;
	}
	public String toString() {
	return "student[rollNo="+ rollNo +"name="+ name +" percentage+="+percentage+"]";
	}
}
