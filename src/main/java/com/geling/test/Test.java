package com.geling.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		MapThread thread = new MapThread();
		System.out.println(thread.getClass().getClassLoader());
		
		List<String> list = new ArrayList<String>();
		System.out.println(list.getClass().getClassLoader());
	}

}
