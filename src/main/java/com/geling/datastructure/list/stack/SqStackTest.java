package com.geling.datastructure.list.stack;

public class SqStackTest {
	
	public static void conversion(int num,int div){
		SqStack<Integer> stack = new SqStack<>();
		while(num != 0){
			stack.push(num%div);
			num /= div;
		}
		while(!stack.isEmpty()){
			System.out.print(stack.pop() + ",");
		}
	}
	public static void main(String[] args) {
		SqStack<Integer> stack = new SqStack<>();
		conversion(1348,8);
		stack.traverse();
	}

}
