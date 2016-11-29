package com.geling.datastructure.chapter1;


public class Triplet {
	private Integer[] triplet = new Integer[3];
	
	//初始化
	public Integer[] initial(Integer v1,Integer v2,Integer v3){
		triplet[0] = v1;triplet[1] = v2;triplet[2] = v3;
		return triplet;
	}
	//销毁
	public void destroy(){
		triplet = null;
	}
	//获取
	public Integer get(int index){
		if(index<0 || index>3){
			throw new ArrayIndexOutOfBoundsException("位置越界");
		}
		return triplet[index-1];
	}
	//赋值
	public void put(Integer t,int index){
		if(index<0 || index>3){
			throw new ArrayIndexOutOfBoundsException("位置越界");
		}
		triplet[index-1] = t;
	}
	//最大值
	public Integer max(){
		return triplet[0]>=triplet[1]?(triplet[0]>=triplet[2]?triplet[0]:triplet[2]):(triplet[1]>=triplet[2]?triplet[1]:triplet[2]);
	}
	//最小值
	public Integer min(){
		return triplet[0]<=triplet[1]?(triplet[0]<=triplet[2]?triplet[0]:triplet[2]):(triplet[1]<=triplet[2]?triplet[1]:triplet[2]);
	}
	//是否升序
	public boolean isAscending(){
		return triplet[0]<=triplet[1] && triplet[1]<=triplet[2];
	}
	//是否降序
	public boolean isDescending(){
		return triplet[0]>=triplet[1] && triplet[1]>=triplet[2];
	}
	public static void main(String[] args) {
		Triplet t = new Triplet();
		t.initial(34, 56, 22);
		System.out.println(t.get(2));
		System.out.println(t.max());
		System.out.println(t.isAscending());
	}

}
