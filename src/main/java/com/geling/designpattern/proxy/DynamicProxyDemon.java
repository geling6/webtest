package com.geling.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
interface Interface{
	void method1();
	void method2(String msg);
}
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
*/
class DynamicProxy implements InvocationHandler{
	private Interface interfaze;
	public DynamicProxy(Interface interfaze){
		this.interfaze = interfaze;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("proxy start ...");
		method.invoke(interfaze, args);
		System.out.println("proxy end ...");
		return null;
	}
}
public class DynamicProxyDemon {

	public static void main(String[] args) {
		Interface proxy = (Interface) Proxy.newProxyInstance(DynamicProxy.class.getClassLoader(),new Class[]{Interface.class},
				new DynamicProxy(new RealObject()));
		proxy.method1();
		proxy.method2("fuck");
	}

}
