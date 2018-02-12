package com.geling;

import com.geling.datastructure.list.stack.SqStack;

class LNode<T> {
	public T data;
	public LNode<T> next;
	public LNode(){
	}
	public LNode(T e){
		data = e;
	}
}

public class Test {
	public static void main(String[] args) {
		LNode<Integer> a = new LNode<>();
		a.data = 1;
		LNode<Integer> a1 = new LNode<>();
		a1.data = 9;
		a.next = a1;
		LNode<Integer> a2 = new LNode<>();
		a2.data = 3;
		a1.next = a2;
		LNode<Integer> a3 = new LNode<>();
		a3.data = 8;
		a2.next = a3;
		
		
		LNode<Integer> b = new LNode<>();
		b.data = 6;
		LNode<Integer> b1 = new LNode<>();
		b1.data = 5;
		b.next = b1;
		LNode<Integer> b2 = new LNode<>();
		b2.data = 7;
		b1.next = b2;
		
		SqStack<LNode<Integer>> s1 = new SqStack<>();
		SqStack<LNode<Integer>> s2 = new SqStack<>();
		
		LNode<Integer> p = a, q = b;
		
		while(p != null){
			s1.push(p);
			p = p.next;
		}
		while(q != null){
			s2.push(q);
			q = q.next;
		}
		
		LNode<Integer> result = new LNode<>();
		LNode<Integer> r = result;
		boolean carry = false;
		while(s1.isNotEmpty() && s2.isNotEmpty()){
			int aInt = s1.pop().data;
			int bInt = s2.pop().data;
			int abInt = aInt + bInt;
			boolean isCarry = false;
			if(abInt > 9){
				abInt -=10;
				isCarry = true;
			}
			LNode<Integer> temp = new LNode<>();
			if(carry){
				temp.data = abInt + 1;
				carry = false;
			}else{
				temp.data = abInt;
			}
			
			if(isCarry){
				carry = true;
			}
			r.next = temp;
			r = temp;
		}
		
		while(s1.isNotEmpty()){
			
			LNode<Integer> temp = new LNode<>();
			
			if(carry){
				temp.data = s1.pop().data + 1;
				carry = false;
			}else{
				temp.data = s1.pop().data;
			}
			
			
			r.next = temp;
			r = temp;
		}
		
		while(s2.isNotEmpty()){
			LNode<Integer> temp = new LNode<>();
			if(carry){
				temp.data = s1.pop().data + 1;
				carry = false;
			}else{
				temp.data = s1.pop().data;
			}
			
			r.next = temp;
			r = temp;
		}
		
		
		while(result!=null){
			System.out.print(result.data + ", ");
			result = result.next;
		}
		System.out.println();
	}
}
