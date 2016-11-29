package com.geling.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test{
	public static void main(String[] args) {
		List<Integer> aa = new ArrayList<>();
		aa.add(1);
		aa.add(2);
		aa.add(3);
		aa.add(4);
		aa.add(5);
		aa.add(6);
		aa.add(7);
		aa.add(8);
		aa.add(9);
		aa.add(10);
		aa.add(11);
		Iterator<Integer> iterator = aa.iterator();
		aa.add(99);
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println(aa);
	}
}