package com.ssafy;

public class ShiftTest2 {

	public static void main(String[] args) {
		
		int a = 2020;
		System.out.printf("%32s\n", Integer.toBinaryString(a));
		a = a<<8;
		System.out.printf("%32s\n", Integer.toBinaryString(a));
		a = a+1;
		System.out.printf("%32s\n", Integer.toBinaryString(a));
		a = a<<8;
		System.out.printf("%32s\n", Integer.toBinaryString(a));
		a = a+28;
		System.out.printf("%32s\n", Integer.toBinaryString(a));
		
		int mask = 255; // 8자리 11111111 
		System.out.printf("%32s\n", Integer.toBinaryString(mask));
		
		int day = a & mask; // and 연산을 통해 마지막 8자리 숫자만 꺼내온다.
		System.out.printf("%32s\n", Integer.toBinaryString(day));
		System.out.println(day);
		a = a>>8; // 8자리를 빼내었으니 다시 뒤로 8번 밀기
		System.out.printf("%32s\n", Integer.toBinaryString(a));
		int month = a & mask;
		System.out.printf("%32s\n", Integer.toBinaryString(month));
		System.out.println(month);
		a = a>>8; // 8자리를 빼내었으니 다시 뒤로 8번 밀기
		System.out.printf("%32s\n", Integer.toBinaryString(a));
		System.out.println(a);
		
	}

}
