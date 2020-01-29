package com.ssafy.array;

import java.util.Arrays;

public class BubbleSort_Á¶¹Î°æ {

	public static void main(String[] args) {
		
		int[] array = {52, 10, 26, 4, 16, 12, 9, 30, 7};
		int size = array.length;
		System.out.println(Arrays.toString(array));

		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1-i; j++) {
				if(array[j]>array[j+1]) {
					int tmp = array[j];
					array[j] = array[j+1];
					array[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}

}
