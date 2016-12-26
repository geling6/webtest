package com.geling.datastructure.list.queue;

import com.geling.datastructure.ParamErrorException;

public class SqQueue<T> {
	private int MAXQSIZE = 10 + 1;//空出一个空间来，区别空和满
	private T[] queue = null;
	private int front,rear;
	//初始化
	@SuppressWarnings("unchecked")
	public void initQueue(){
		queue = (T[]) new Object[MAXQSIZE];
		front = rear = 0;
	}
	//销毁
	public void destroyQueue(){
		queue = null;
		front = 0;
		rear = 0;
	}
	//清空
	public void clear(){
		front = rear;
	}
	//判空
	public boolean isEmpty(){
		return rear == front;  //空是两指针指到同一地方
	}
	//长度
	public int length(){
		return (rear - front + MAXQSIZE) % MAXQSIZE;
	}
	//获取头元素
	public T getHead(){
		if(isEmpty())
			return null;
		return queue[front];
	}
	//入队
	public void enQueue(T e){
		if((rear+1)%MAXQSIZE == front) //判满是队尾指针下一个位置就是头了
			throw new ParamErrorException("队列满");
		queue[rear] = e;
		rear = rear++ % MAXQSIZE;
	}
	//出队
	public T deQueue(){
		if(isEmpty())
			return null;
		T e = queue[front];
		front = front++ % MAXQSIZE;
		return e;
	}
	//遍历
	public void traverse(){
		if(front<=rear){
			for(int i=front;i<rear;i++){
				System.out.print(queue[i] + ",");
			}
			System.out.println();
		}else{
			for(int i=front;i<length();i++){
				System.out.print(queue[i] + ",");
			}
			for(int i=0;i<rear;i++){
				System.out.print(queue[i] + ",");
			}
			System.out.println();
		}
	}
}
