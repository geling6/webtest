package com.geling.javabook.generator;

public class CountingGenerator {
	//生成boolean值
	public static class Boolean implements Generator<java.lang.Boolean>{
		private java.lang.Boolean flag = false;
		@Override
		public java.lang.Boolean next(){
			flag = !flag;
			return flag;
		}
	}
	//生成byte值
	public static class Byte implements Generator<java.lang.Byte>{
		private byte value = 0;
		@Override
		public java.lang.Byte next(){
			return  value++;
		}
	}
	//
}
