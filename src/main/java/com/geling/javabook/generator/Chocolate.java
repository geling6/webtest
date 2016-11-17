package com.geling.javabook.generator;

public abstract class Chocolate {
	private final int id = count++;
	private static int count = 0;
	public String toString(){
		return "id = " + id;
	}
}
