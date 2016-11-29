package com.geling.datastructure.list;

public class SqList<T> {
	
	private static int LIST_INIT_SIZE = 100;
	private static int LISTINCREMENT = 10;
	public int length = 0;
	//初始化
	private T[] list = (T[]) new Object[LIST_INIT_SIZE];
	//销毁
	public void destroy(){
		
	}
	//清空
	public void clear(){
		
	}
	//判空
	public boolean isEmpty(){
		return false;
	}
	//返回长度
	public int length(){
		return 0;
	}
	//获取指定位置元素
	public T get(int i){
		return null;
	}
	//获取元素位序
	public int location(T e){
		return 0;
	}
	//获取前驱
	public T prior(T e){
		return null;
	}
	//获取后继
	public T next(T e){
		return null;
	}
	//插入
	public T insert(int i,T e){
		return null;
	}
	//删除
	public T delete(int i){
		return null;
	}
	//遍历
	public void traverse(){
		
	}
}
