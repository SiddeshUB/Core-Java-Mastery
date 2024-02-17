package com.learn.CollectionFrameWorks;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
public class Program3 {
	public static void main(String[] args) {
		ArrayDeque ad = new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add("Mango");
		ad.add(55.5f);
		ad.add(true);
		System.out.println(ad);	
		ad.addFirst("First");
		ad.addLast("Last");
		System.out.println(ad);	
		
		
		for(Object x:ad) {
			System.out.println(x+ " ");
		}
		
		Iterator itr = ad.descendingIterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
	}
}
