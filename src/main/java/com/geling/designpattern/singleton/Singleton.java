package com.geling.designpattern.singleton;

public class Singleton {
	private static Singleton instance = null;//= new Singleton()饱汉式
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		
		return instance;
	}
	
	/**
	 * 若要同步需要在getInstacne()方法上加synchronized
	 * 使用ThreadLocal实现
	 */
	static ThreadLocal<Singleton> map = new ThreadLocal<Singleton>();
	public static Singleton getIntance1(){
		Singleton instance = map.get();
		if(instance == null){
			instance = new Singleton();
			map.set(instance);
		}
		
		return instance;
	}
}
