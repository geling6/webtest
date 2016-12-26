package com.geling.datastructure.list.stack;

public class SqStack<T> {
	
	//初始化
	@SuppressWarnings("unchecked")
	private T[] stack = (T[]) new Object[100];
	private int base = 0, top;
	private int STACK_INIT_SIZE = 100;
	private int INCREMENT = 10;
	
	//销毁
	public void destroyStack(){
		stack = null;
	}
	//清空
	public void clear(){
		top = base;
	}
	//判空
	public boolean isEmpty(){
		return base == top;
	}
	//获取长度
	public int length(){
		return top-base;
	}
	//返回栈顶元素
	public T getElem(){
		if(top == base) return null;
		return stack[top-1];
	}
	//入栈
	public void push(T e){
		if(top - base >= 100){
			@SuppressWarnings("unchecked")
			T[] tempStack = (T[]) new Object[STACK_INIT_SIZE += INCREMENT];
			for(int i=base;i<top;i++){
				tempStack[i] = stack[i];
			}
			stack = tempStack;
		}
		stack[top] = e;
		top++;
	}
	//出栈
	public T pop(){
		if(base == top) return null;
		T e = stack[top -1];
		top--;
		return e;
	}
	//遍历
	public void traverse(){
		for(int i=base;i<top;i++){
			System.out.print(stack[i] + ",");			
		}
	}
}
