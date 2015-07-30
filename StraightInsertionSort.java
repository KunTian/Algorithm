package com.algorithm.sort;

import java.util.Arrays;

public class StraightInsertionSort {
	//插入排序
	public void insertionSort(int[] arr) { 

	      int i, j, newValue; 

	      for (i = 1; i < arr.length; i++) { 

	            newValue = arr[i]; 

	            j = i; 

	            while (j > 0 && arr[j - 1] > newValue) { 

	                  arr[j] = arr[j - 1]; 

	                  j--; 

	            } 

	            arr[j] = newValue; 

	      } 

	}
	
	/**
	 * 遍历数组的两种方式：
	 * 1.java.util.Arrays.toString(arr_name);
	 * 2.for循环遍历数组
	 * 
	 * @param args
	 */
	 
	public static void main(String[] args) {
		
		int[] arr = {49,38,65,97,76,13,27,49};
		
		StraightInsertionSort object = new StraightInsertionSort();
		
		System.out.println("Before sorting:" + Arrays.toString(arr));
		
		object.insertionSort(arr);
		
		System.out.println("After  sorting:" + Arrays.toString(arr));
		
/*		for(int i=0;i<arr.length;i++){
			
			System.out.print(arr[i] + " ");
			
		}*/
		
	}

}
