package com.geling.designpattern;

/*
 * 代理模式。
 * 一个接口，真实类和代理类都实现接口。在代理类里有真实类的对象。
 * 在代理类覆写接口方法时，就是在调用真实类的相应方法
 * 使用时实例化代理类，只调用代理类的方法就是了
 */

interface Interface{
	void method1();
	void method2(String msg);
}

//真实类
class RealObject implements Interface{
	@Override
	public void method1(){
		System.out.println("method1...");
	}
	@Override
	public void method2(String msg){
		System.out.println("method2 " + msg + "...");
	}
}

//代理类
class SimpleProxy implements Interface{
	private Interface interfaze;
	public SimpleProxy(Interface interfaze){
		this.interfaze = interfaze;
	}
	@Override
	public void method1(){
		System.out.println("proxy in merhod1 start ...");
		interfaze.method1();
		System.out.println("proxy in method1 end ...");
	}
	@Override
	public void method2(String msg){
		System.out.println("proxy in method2 start ....");
		interfaze.method2(msg);
		System.out.println("proxy in method2 end ...");
	}
}


public class SimpleProxyDemon {
	public static void main(String[] args) {
		SimpleProxy proxy = new SimpleProxy(new RealObject());
		proxy.method1();
		proxy.method2("fuck ");
	}

}
