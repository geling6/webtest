package com.geling.datastructure.chapter1;


public class Triplet<T> {
	@SuppressWarnings("unchecked")
	private T[] triplet = (T[]) new Object[3];
	
	//初始化
	public T[] initialTriple(T v1,T v2,T v3){
		triplet[0] = v1;triplet[1] = v2;triplet[2] = v3;
		return triplet;
	}
	//获取
	public T get(int index){
		if(index<0 || index>3){
			throw new ArrayIndexOutOfBoundsException("位置越界");
		}
		return triplet[index-1];
	}
	//赋值
	public void put(T t,int index){
		if(index<0 || index>3){
			throw new ArrayIndexOutOfBoundsException("位置越界");
		}
		triplet[index-1] = t;
	}
	//删除
	public void remove(int index){
		if(index<0 || index>3){
			throw new ArrayIndexOutOfBoundsException("位置越界");
		}
		triplet[index-1] = null;
	}
	//最大值
	/*public T max(){
		return triplet[0]>=triplet[1]?(triplet[0>triplet[2]]?triplet[0]:triplet[2]):(triplet[1]>triplet[2]?triplet[1]:triplet[2]);
	}*/
	//最小值
	//是否为空
	//是否升序
	//是否降序
	public static void main(String[] args) {
	}

}
