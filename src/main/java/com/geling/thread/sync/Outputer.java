package com.geling.thread.sync;

import org.springframework.util.StringUtils;

/**
 * 实际多线程要执行的代码。一般都是单独提出来做个类
 */
public class Outputer {
	public synchronized void output(String name){
		if(!StringUtils.isEmpty(name)){
			int len = name.length();
			for(int i=0;i<len;i++){
				System.out.print(name.charAt(i) + " ");
			}
			System.out.println();
		}
	}
	
	public void output2(String name){
		synchronized(Outputer.class){//output2和output3方法达到同步效果
			if(!StringUtils.isEmpty(name)){
				int len = name.length();
				for(int i=0;i<len;i++){
					System.out.print(name.charAt(i) + " ");
				}
				System.out.println();
			}
		}
	}
	
	public static synchronized void output3(String name){
		if(!StringUtils.isEmpty(name)){
			int len = name.length();
			for(int i=0;i<len;i++){
				System.out.print(name.charAt(i) + " ");
			}
			System.out.println();
		}
	}
}
