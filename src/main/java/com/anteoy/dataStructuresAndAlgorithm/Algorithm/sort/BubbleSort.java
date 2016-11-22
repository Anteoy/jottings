package com.anteoy.dataStructuresAndAlgorithm.Algorithm.sort;

public class BubbleSort {

	/**
	 * 冒泡排序
	 * @param a
	 * @return
	 */
	public static int[] bubbleSort(int[] a){
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length-i-1; j++) {
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j]= a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.print(a[j2]+"");
		}
		System.out.println("\n");
		return a;
	}
}
