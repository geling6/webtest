package com.geling.javabook.generator;

import java.util.Random;

import scala.actors.threadpool.Arrays;

public class ChocolateGenerator implements Generator<Chocolate> {

	private Class[] types = {DarkChocolate.class,FilledChocolate.class,MilkChocolate.class,UnflavouredChocolate.class};
	private static Random random = new Random(47);
	@Override
	public Chocolate next(){
		int index = random.nextInt(4);
		Chocolate chocolate = null;
		try{
			chocolate = (Chocolate)types[index].newInstance();			
		}catch(Exception e){
			e.printStackTrace();
		}
		return chocolate;
	}
	
	public static void main(String[] args) {
		ChocolateGenerator chocolateGenerator = new ChocolateGenerator();
		Chocolate[] chocolates = new Chocolate[5];
		for(int i=0;i<5;i++){
			chocolates[i] = chocolateGenerator.next();
		}
		System.out.println(Arrays.toString(chocolates));
	}
}
