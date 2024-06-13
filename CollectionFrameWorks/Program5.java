package com.learn.CollectionFrameWorks;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Program5 {
	public static void main(String[] args) {
		TreeSet<Integer> ad = new TreeSet<Integer>();
		ad.add(50);
		ad.add(60);
		ad.add(30);
		ad.add(40);
		ad.add(50);
		ad.add(40);
		ad.add(40);
		ad.add(40);
		System.out.println(ad);
		for(int i=0;i<=ad.size()-1;i++) {
			System.out.println(ad.getClass());
		}
	}
}
