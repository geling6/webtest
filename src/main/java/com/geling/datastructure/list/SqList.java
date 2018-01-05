package com.geling.datastructure.list;

import com.geling.datastructure.ParamErrorException;

public class SqList<T> {
	
	private static int LIST_INIT_SIZE = 100;
	private static int LISTINCREMENT = 10;
	private int size = LIST_INIT_SIZE;
	public int length = 0;
	//初始化
	@SuppressWarnings("unchecked")
	private T[] list = (T[]) new Object[LIST_INIT_SIZE];
	//销毁
	public void destroy(){
		list = null;
	}
	//清空
	public void clear(){
		for(int i=0;i<length;i++){
			list[i] = null;
		}
	}
	//判空
	public boolean isEmpty(){
		return list == null;
	}
	//获取指定位置元素
	public T get(int i){
		if(i<1 || i>length){
			throw new ArrayIndexOutOfBoundsException("数组越界");
		}
		return list[i-1];
	}
	//获取元素位序
	public int location(T e){
		for(int i=0;i<length;i++){
			if(e.equals(list[i])){
				return i+1;
			}
		}
		return 0;
	}
	//获取前驱
	public T prior(T e){
		if(e == null){
			throw new ParamErrorException("参数错误");
		}
		for(int i=1;i<length;i++){
			if(e.equals(list[i])){
				return list[i+1];
			}
		}
		return null;
	}
	//获取后继
	public T next(T e){
		if(e == null){
			throw new ParamErrorException("参数错误");
		}
		for(int i=0;i<length-1;i++){
			if(e.equals(list[i])){
				return list[i-1];
			}
		}
		return null;
	}
	//插入
	public T insert(int i,T e){
		if(i<1 || i>length+1){
			throw new ArrayIndexOutOfBoundsException("数组越界");
		}
		T origin = list[i-1];
		if(length >= size){ //存储空间已满
			@SuppressWarnings("unchecked")
			T[] temp = (T[])new Object[size += LISTINCREMENT];
			for(int j=0;j<length;j++){
				temp[j] = list[j];
			}
			list = temp;
		}
		for(int j=length-1;j>=i-1;j--){
			list[j+1] = list[j];
		}
		list[i-1] = e;
		length++;
		return origin;
	}
	//删除
	public T delete(int i){
		if(i<1 || i>length){
			throw new ArrayIndexOutOfBoundsException("数组越界");
		}
		T origin = list[i-1];
		for(int j=i-1;j<length-1;j++){
			list[j] = list[j+1];
		}
		length--;
		return origin;
	}
	//遍历
	public void traverse(){
		for(int i=0;i<length;i++){
			System.out.print(list[i] + ",");
		}
	}
}
