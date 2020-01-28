package com.ssafy;

public class ShiftTest {

	public static void main(String[] args) {
		
		int a = 15;
		// 2진수로 찍기
		System.out.println(Integer.toBinaryString(a));
//		a = a<<33; // 11110 : 연산하기 전에 %32를 먼저 처리한다.
		a = a<<3;
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(a);
		a = a>>4;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(a);
		
		
	}

}
