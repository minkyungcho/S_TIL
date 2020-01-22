package day2;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		/**
		 * 키보드를 통해 10개의 양의 정수를 입력받아
		 * 가장 큰 값이 있는 곳의 위치를 구하시오.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("10개의 양의 정수를 입력하세요.");
		int[] inputAr = new int[10];
		for(int i=0; i<inputAr.length; i++) {
			inputAr[i] = s.nextInt();
		}
		
		int max = inputAr[0];
		int maxidx = 0;
		
		for(int i=1; i<inputAr.length; i++) {
			if(inputAr[i] > max) {
				max = inputAr[i]; 
				maxidx = i;
			}
		}
		System.out.println("가장 큰 값의 위치 : "+maxidx);
	}

}
