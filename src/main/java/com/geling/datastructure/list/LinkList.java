package com.geling.datastructure.list;

import com.geling.datastructure.ParamErrorException;


public class LinkList<T> {
	private LNode<T> head = new LNode<T>();
	//销毁
	//清空
	public void clear(){
		head = null;
	}
	//判空
	public boolean isEmpty(){
		return head == null;
	}
	//获取指定位置元素
	public T get(int i){
		LNode<T> p = head.next;
		int j = 1;
		while(p!=null && j<i){
			p = p.next;
			j++;
		}
		if(p==null)
			throw new ParamErrorException("参数错误");
		
		return p.data;
	}
	//获取元素位序
	public int location(T e){
		LNode<T> p = head;
		int i = 0;
		while(p!=null && p.data!=e){
			p = p.next;
			i++;
		}
		if(p == null) return 0;
		return i;
	}
	//获取前驱
	public T prior(T e){
		LNode<T> p = head;
		while(p!=null && p.next.data != e){
			p = p.next;
		}
		if(p == null)
			throw new ParamErrorException("参数错误");
		return p.data;
	}
	//获取后继
	public T next(T e){
		LNode<T> p = head;
		while(p!=null && p.data != e){
			p = p.next;
		}
		if(p.next == null)
			throw new ParamErrorException("没有后继");
		return p.next.data;
	}
	public int length(){
		LNode<T> p = head.next;
		int i = 0;
		while(p!=null){
			p = p.next;
			i++;
		}
		return i;
	}
	//插入
	public void insert(int i,T e){
		int length = length();
		if(i>length+1)
			throw new ParamErrorException("参数错误");
		LNode<T> p = head;
		int j = 0;
		while(p!=null && j<i-1){
			p = p.next;
			j++;
		}
		LNode<T> node = new LNode<T>(e);
		node.next = p.next;
		p.next = node;
	}
	//删除
	public T delete(int i){
		int length = length();
		if(i>length)
			throw new ParamErrorException("参数错误");
		LNode<T> p = head;
		int j = 0;
		while(p!=null && j<i){
			p = p.next;
			j++;
		}
		LNode<T> node = p.next;
		p.next = node.next;
		node.next = null;
		return node.data;
	}
	//遍历
	public void traverse(){
		LNode<T> p  = head.next;
		while(p!=null){
			System.out.print(p.data + ", ");
			p = p.next;
		}
		System.out.println();
	}
}
class LNode<T> {
	public T data;
	public LNode<T> next;
	public LNode(){
	}
	public LNode(T e){
		data = e;
	}
}
