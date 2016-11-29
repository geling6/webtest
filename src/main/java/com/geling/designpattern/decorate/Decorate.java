package com.geling.designpattern.decorate;
/**
 * 参考“流”部分实现
 */
interface Interfaze{
	void method();
}

class Shixian1 implements Interfaze{
	public void method(){
		System.out.println("shixian1 ---method");
	}
}
class Shixian2 implements Interfaze{
	public Interfaze interfaze;
	public Shixian2(Interfaze interfaze){
		this.interfaze = interfaze;
	}
	public void method(){
		System.out.println("shixian2 ----method");
	}
}
public class Decorate {
	public static void main(String[] args) {
		Interfaze shixian1 = new Shixian1();
		Shixian2 shixian2 = new Shixian2(shixian1);
	}
}
