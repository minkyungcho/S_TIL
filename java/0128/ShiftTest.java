package com.ssafy;

public class ShiftTest {

	public static void main(String[] args) {
		
		int a = 15;
		// 2������ ���
		System.out.println(Integer.toBinaryString(a));
//		a = a<<33; // 11110 : �����ϱ� ���� %32�� ���� ó���Ѵ�.
		a = a<<3;
		
		System.out.println(Integer.toBinaryString(a));
		System.out.println(a);
		a = a>>4;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(a);
		
		
	}

}
