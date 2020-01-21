package day2;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		/**
		 * 키보드로부터 10개의 정수를 입력받아 
		 * 입력 받은 수의 합계, 최소값, 최대값 을 출력
		 */
		
		Scanner s = new Scanner(System.in);
		int[] inputAr = new int[10];
		System.out.println("10개의 숫자를 입력하세요.");
		for (int i=0; i<inputAr.length; i++) {
			inputAr[i] = s.nextInt();
		}
//		System.out.println(inputAr.toString());
		
		// 합계, 최소, 최대
		int sum = 0;
		int min = inputAr[0];
		int max = inputAr[0];
		for (int a : inputAr) {
			sum += a;
			if(min > a) min = a;
			if(a > max) max = a;
		}
		System.out.println("합계는 : "+sum);
		System.out.println("최소값은 : "+min);
		System.out.println("최대값은 : "+max);
		System.out.println();
		sum(inputAr);
		max(inputAr);
		int armin = min(inputAr);
		System.out.println("최소 "+armin);
		
	}
	
	// 합계 구하는 메서드 (함수)
	public static void sum(int[] a) {
		int tot = 0;
		for(int su : a) {
			tot += su;
		}
		System.out.println("합계 "+tot);
	}
	
	// 최대값 구하는 메서드
	public static void max(int[] a) {
		int armax = a[0];
		for(int su : a) {
			if(su > armax) armax = su;
		}
		System.out.println("최대 "+armax);
	}
	
	// 최소값 구하는 메서드
	public static int min(int[] a) {
		int armin = a[0];
		for(int su : a) {
			if(armin > su) armin = su;
		}
		return armin;
//		System.out.println("최소 "+armin);
	}
}
