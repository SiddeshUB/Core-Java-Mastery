package com.learn.CollectionFrameWorks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;
public class Program1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		ArrayList fruit = new ArrayList();
		fruit.add("Orange");
		fruit.add("Mango");
		fruit.add("Gauva");
		fruit.add("Papaya");
		fruit.add("Grapes");
		Collections.sort(fruit);
		al.addAll(fruit);
		System.out.println(al);
		for(int i=0;i<=al.size()-1;i++) {
			System.out.println(al.get(i));
		}
		ListIterator lr = al.listIterator(al.size());
		while(lr.hasPrevious()) {
			System.out.print(lr.previous()+" ");
		}
	}
}
