package com.geling.datastructure.list.queue;

import com.geling.datastructure.ParamErrorException;

public class LinkedQueue<T> {
	
	QNode<T> qNode = null;//头结点
	QNode<T> front = null,rear = null;//头,尾指针
	//初始化
	public void initQueue(){
		qNode = new QNode<>();//头结点
		front = rear = qNode;
		
	}
	//销毁
	public void desctoryQueue(){
		qNode = null;
		front = null;
		rear = null;
	}
	//清空
	public void clear(){
		rear = front;
	}
	//判空
	public boolean isEmpty(){
		return front == rear;
	}
	//长度
	public int length(){
		QNode<T> p = front;
		int length = 0;
		while(p != rear){
			p = p.next;
			length++;
		}
		return length;
	}
	//获取队头元素
	public T getHead(){
		if(isEmpty()) return null;
		return front.next.data;
	}
	//入队
	public void enQuequ(T e){
		QNode<T> p = new QNode<>();
		p.data = e;
		rear.next = p;
		rear = p;
	}
	//出队
	public T deQueue(){
		if(isEmpty())
			throw new ParamErrorException("参数错误");
		T e = front.data;
		QNode<T> p = front.next;
		front.next = p.next;
		if(rear == p) rear = front;//若只有一个结点，删除后rear就丢失了
		return e;
	}
	//遍历
	public void traverse(){
		if(rear == front) return;
		QNode<T> p = front.next;
		while(p!=rear && p!=null){
			System.out.print(p.data + ",");
			p = p.next;
		}
		System.out.print(rear.data);
		System.out.println();
	}
}
class QNode<T>{
	T data;
	QNode<T> next;
}