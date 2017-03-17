package com.geling.datastructure.search;

/**
 * @author geling
 * @date 2017年1月10日
 * @desc 查找
 */
public class SeqSearch {
	public static void main(String[] args) {
		int[] array = {13,38,65,97,76,13,27,49};
		int i = array.length-1;
		for(;array[i]!=array[0];i--);
		System.out.println(i);
		
		int[] array1 = {05,13,19,21,37,56,64,75,80,88,92};
		int index = binarySearch(array1,92);
		System.out.println(index);
		
	}
	//折半查找
	public static int binarySearch(int[] array,int num){
		int low = 0,high = array.length-1;
		int mid = 0;
		while(low <= high){
			mid = (low+high)/2;
			if(num > array[mid]){
				low = mid+1;
			}else if(num < array[mid]){
				high = mid-1;
			}else{
				return mid;
			}
		}
		return 0;
	}
}
