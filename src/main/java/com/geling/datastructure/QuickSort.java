package com.geling.datastructure;

import java.util.Arrays;


public class QuickSort {
	private static int partition(int[] array, int low, int high){
		int pivotKey = array[low];
		while(low<high){
			//必须先从后边开始
			while(low<high && array[high]>=pivotKey){
				--high;
			}
			int temp = array[high];
			array[high] = array[low];
			array[low] = temp;
			
			while(low<high && array[low]<=pivotKey){
				++low;
			}
			int temp1 = array[high];
			array[high] = array[low];
			array[low] = temp1;
		}
		
		return high;
	}
	
	public static void quickSort(int[] array, int low, int high){
		if(low < high){
			int pivotLoc = partition(array, low, high);
			quickSort(array, low, pivotLoc-1);
			quickSort(array, pivotLoc+1, high);
			
		}
	}
	
	
	public static void main(String[] args) {
		int[] array = {49,38,65,97,76,13,27,7};
		System.out.println(Arrays.toString(array));
		System.out.println();
		quickSort(array, 0, array.length-1);
		System.out.println(Arrays.toString(array));
	}
}
