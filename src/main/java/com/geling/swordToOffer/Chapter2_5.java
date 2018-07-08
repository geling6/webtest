package com.geling.swordToOffer;

import com.geling.datastructure.list.stack.SqStack;


public class Chapter2_5{
	
	/**
	 * 从行列都递增的二维数组查找key是否存在
	 * 从右上角开始
	 */
	public static String searchArray(int[][] intArray, int key){
		
		if(intArray == null){
			return "error";
		}
		int i = intArray.length-1, j = intArray[0].length-1;
		
		int p = 0;
		while(p<=i && j>=0 && intArray[i][j]>=key){
			
			if(intArray[p][j] == key){
				return p + "," + j; 
			}
			
			if(intArray[p][j] < key){
				p++;
			}
			
			if(intArray[p][j] > key){
				j--;
			}
		}
		
		return "null";
	}
	
	/**
	 * 替换字符串里的空格
	 */
	public static String replaceBlank(String str){
		
		if(str==null || str.length() <=0){
			return "error";
		}
		char[] strChar = str.toCharArray();
		
		int strLength = strChar.length, blankNum = 0;
		for(int i=0;i<=strLength-1;i++){
			if(strChar[i] == ' '){
				blankNum++;
			}
		}
		if(blankNum > 0){
			char[] newChar = new char[strLength + blankNum*2];
			int i = 0, j=0;
			while(i<=strLength-1&& j<=newChar.length-1){
				if(strChar[i] == ' '){
					newChar[j++] = '%';
					newChar[j++] = '2';
					newChar[j++] = '0';
					i++;
				}else{
					newChar[j++] = strChar[i++];					
				}
				
			}
				
			
			return String.valueOf(newChar);
		}
		
		
		return String.valueOf(strChar);
	}
	
	//反向打印单链表
	public static void reverseLink(Node<Integer> root){
		if(root == null){
			return;
		}
		SqStack<Node<Integer>> stack = new SqStack<>();
		Node<Integer> p = root;
		while(p != null){
			stack.push(p);
			p = p.next;
		}
		while(stack.isNotEmpty()){
			System.out.println(stack.pop().data);
		}
	}
	
	
	
	public static void main(String[] args){
		
		//1
		int[][] intArray = {{1,3,10,24,30},
							{4,8,19,25,32},
							{9,12,20,31,40},
							{10,15,24,33,45},
							{11,20,30,40,50}
							};
		String result = searchArray(intArray, 28);
		
		//System.out.println(result);
		
		//2
		String str = replaceBlank("fuck Yang yandi de bi! ");
		//System.out.println(str);
		
		//3
		Node<Integer> root = new Node<>(0);
		Node<Integer> node1 = new Node<>(9);
		root.next = node1;
		Node<Integer> node2 = new Node<>(13);
		node1.next = node2;
		Node<Integer> node3 = new Node<>(12);
		node2.next = node3;
		Node<Integer> node4 = new Node<>(8);
		node3.next = node4;
		Node<Integer> node5 = new Node<>(6);
		node4.next = node5;
		//reverseLink(root);
		
		//4
		QueueStack<Integer> queue = new QueueStack<>();
		queue.appendTail(4);
		queue.appendTail(13);
		queue.appendTail(5);
		Integer i = queue.deleteHead();
		queue.appendTail(8);
		Integer j = queue.deleteHead();
		Integer k = queue.deleteHead();
		System.out.println(i);
		System.out.println(j);
		int p = queue.deleteHead();
		System.out.println(p);
		
	}
}
class Node<T>{
	T data;
	Node<T> next;
	Node(T data){
		this.data = data;
	}
}


/**
 * 两个栈实现队列
 */
class QueueStack<T>{
	private SqStack<T> stack1 = new SqStack<>();
	private SqStack<T> stack2 = new SqStack<>();
	
	public void appendTail(T data){
		stack1.push(data);				
	}
	public T deleteHead(){
		if(stack1.isNotEmpty() && stack2.isEmpty()){
			while(stack1.isNotEmpty()){
				stack2.push(stack1.pop());
			}
		}
		
		return stack2.pop();
	}
}