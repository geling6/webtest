package com.geling.thread.sync;

import org.springframework.util.StringUtils;

/**
 * ʵ�ʶ��߳�Ҫִ�еĴ��롣һ�㶼�ǵ��������������
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
		synchronized(Outputer.class){//output2��output3�����ﵽͬ��Ч��
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
