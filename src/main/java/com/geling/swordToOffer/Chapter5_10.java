package com.geling.swordToOffer;

import java.util.Arrays;

public class Chapter5_10 {
	
	
	/**
	 * 旋转数组
	 */
	public static int[] reverseArray(int[] array){
		
		if(array == null){
			return null;
		}
		int loc = 0;
		for(int i=1;i<array.length;i++){
			if(array[i] < array[i-1]){
				loc = i;
				break;
			}
		}
		
		int[] newArray = new int[array.length];
		int i = 0;
		for(int j=loc;j<array.length;i++,j++){
			newArray[i] = array[j];
		}
		for(int k=0;k<loc;i++,k++){
			newArray[i] = array[k];
		}
		
		
		return newArray;
	}
	
	/**
	 * 整数的二进制里1的个数
	 */
	public static void sumOne(int num){
	}
	
	public static void main(String[] args) {
		int[] array = {3,4,5,6,1,2};
		int[] newArray = reverseArray(array);
		System.out.println(Arrays.toString(newArray));
	}
}
