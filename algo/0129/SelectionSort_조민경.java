package com.ssafy.array;

import java.util.Arrays;

public class SelectionSort_Á¶¹Î°æ {

	public static void main(String[] args) {
		
		int[] array = {52, 10, 26, 4, 16, 12, 9, 30, 7};
		int size = array.length;
		int least = 0;
		System.out.println(Arrays.toString(array));
		
		for(int i=0; i<size-1; i++) {
			least = i;
			for(int j=i+1; j<size; j++) {
				if(array[j]<array[least]) {
					least = j;
				}
			}
			int tmp = array[least];
			array[least] = array[i];
			array[i] = tmp;
		}
		System.out.println(Arrays.toString(array));
	}

}
