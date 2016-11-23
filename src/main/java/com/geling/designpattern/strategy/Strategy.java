package com.geling.designpattern.strategy;

/**
 * @date 2016年11月23日
 * @desc 一个接口，有不同的实现。策略类里的方法，接收接口类型。在使用时，传参不同的实现类实现不同的行为
 */
interface Interface{
	void printf();
}

class Shixian1 implements Interface{
	public void printf(){
		System.out.println("shixian 1");
	}
}

class Shixian2 implements Interface{
	public void printf(){
		System.out.println("sihxian 2");
	}
}
//策略类
public class Strategy{
	public void shuchu(Interface interfaze){
		interfaze.printf();
	}
	public static void main(String[] args){
		Strategy strategy = new Strategy();
		strategy.shuchu(new Shixian1());//传入不同的策略(子类)有不同的行为
		strategy.shuchu(new Shixian2());
	}
}