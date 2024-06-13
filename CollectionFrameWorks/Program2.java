package com.learn.CollectionFrameWorks;

import java.util.LinkedList;

public class Program2 {
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add("Mango");
		ll.add(55.5f);
		ll.add(true);
		System.out.println(ll);
		ll.set(1,99);
		System.out.println(ll);
	}
}
