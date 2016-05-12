package com.wanda;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i=1;i<100;i++){
    		list.add(i);
    	}
    	
    	int limit = 13;
    	int size = list.size();
    	int start = 0;
    	int part = size/limit;
    	for(int i=0;i<part;i++){
    		List<Integer> sub = list.subList(start, start+=limit);
    		System.out.println(sub);
    	}
    	System.out.println(list.subList(start, size));
    }
}
