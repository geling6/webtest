package com.geling.datastructure.chapter1;

import java.util.Arrays;

public class BubbleSort {
	
	
	/**
	 * 自己理解实现的冒泡
	 */
	public void selfBubbleSort(int [] array) {
		//System.out.println(Arrays.toString(array));
		//System.out.println();
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
					//System.out.println("i=" + i + ",j=" + j + Arrays.toString(array));
				}
			}
		}
		
		//System.out.println(Arrays.toString(array));
	}

	public void bubbleSort(int[] array){
		boolean change = true;
		for(int i=array.length-1;i>0&change;i--){
			change = false;
			for(int j=0;j<i;j++){//往最后冒泡
				if(array[j]<array[j+1]){ //最小的排到最后
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					change = true;
				}
				System.out.println("i=" + i + ",j=" + j + Arrays.toString(array));
			}
		}
	}
	
	public void bubbleSort1(int[] array){
		boolean change = true;
		for(int i=array.length-1;i>0&change;i--){
			change = false;
			for(int j=0;j<i;j++){//往最后冒泡
				if(array[j]>array[j+1]){//最大的排到最后
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					change = true;
				}
			}
		}
	}
	public void bubbleSort2(int[] array){
		boolean change = true;
		for(int i=array.length-1;i>0&change;i--){
			change = false;
			for(int j=i;j>0;j--){//往最前冒泡
				if(array[j]>array[j-1]){//最大的排到最前
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
					change = true;
				}
				System.out.println("i=" + i + ",j=" + j + Arrays.toString(array));
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {49,38,65,97,76,13,27,49};
		System.out.println(Arrays.toString(array));
		System.out.println();
		BubbleSort sort = new BubbleSort();
		sort.selfBubbleSort(array);
		System.out.println(Arrays.toString(array));
	}

}
