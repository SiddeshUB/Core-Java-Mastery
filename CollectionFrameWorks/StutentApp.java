package com.learn.CollectionFrameWorks;

import java.util.ArrayList;

public class StutentApp {
	public static void main(String[] args) {
		Student st1 = new Student(11,"Ajay",76.3f);
		Student st2 = new Student(12,"Roshan",79.3f);
		Student st3 = new Student(13,"Suraj",98.7f);
		
		ArrayList al = new ArrayList();
		al.add(st1);
		al.add(st2);
		al.add(st3);
		System.out.println(al);
	}
}
