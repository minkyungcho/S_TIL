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
		
		int mask = 255; // 8�ڸ� 11111111 
		System.out.printf("%32s\n", Integer.toBinaryString(mask));
		
		int day = a & mask; // and ������ ���� ������ 8�ڸ� ���ڸ� �����´�.
		System.out.printf("%32s\n", Integer.toBinaryString(day));
		System.out.println(day);
		a = a>>8; // 8�ڸ��� ���������� �ٽ� �ڷ� 8�� �б�
		System.out.printf("%32s\n", Integer.toBinaryString(a));
		int month = a & mask;
		System.out.printf("%32s\n", Integer.toBinaryString(month));
		System.out.println(month);
		a = a>>8; // 8�ڸ��� ���������� �ٽ� �ڷ� 8�� �б�
		System.out.printf("%32s\n", Integer.toBinaryString(a));
		System.out.println(a);
		
	}

}
