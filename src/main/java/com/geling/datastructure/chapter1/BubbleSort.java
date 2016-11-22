package com.geling.datastructure.chapter1;

public class BubbleSort {

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
			}
		}
	}
	
	public static void main(String[] args) {
		int[] array = {49,38,65,97,76,13,27,49};
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + ",");			
		}
		System.out.println();
		BubbleSort sort = new BubbleSort();
		sort.bubbleSort2(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i] + ",");			
		}
	}

}
