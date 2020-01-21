package day2;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		/**
		 * 정수값 10개를 입력받아 
		 * 작은값에서 큰값 순으로 sort 해서 출력하세요.
		 * selection sort
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("10개의 정수를 입력하세요.");
		int[] inputAr = new int[10];
		for(int i=0; i<inputAr.length; i++) {
			inputAr[i] = s.nextInt();
		}
		
		for(int i=0; i<inputAr.length; i++) {
			for(int j=i+1; j<inputAr.length; j++) {
				if(inputAr[j] < inputAr[i]) {
					int tmp = inputAr[i];
					inputAr[i] = inputAr[j];
					inputAr[j] = tmp;
				}
			}
		}
		
		for(int i : inputAr) {
			System.out.println(i);
		}
	}
	
	
	public static void sort(int[] su) {
		int min;
		int minp;
		for(int n=0; n<su.length-1; n++) { // 기준점
			min = su[n];
			minp = n;
			
			for(int i=n+1; i<su.length; i++) { // 비교대상
				if(min > su[i]) {
					min = su[i];
					minp = i;
				}
			}
			// swap
			su[minp] = su[n];
			su[n] = min;
			
		}
		
	}
}
