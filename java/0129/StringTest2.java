package com.ssafy.day4;

public class StringTest2 {

	public static void main(String[] args) {
		
		int i=10;
		int j=10;
		
		String s1 = new String("hello");
		String s2 = new String("Hello");
		String s3 = "hello";
		String s4 = "hello";
		
		System.out.println(i==j); // �� ��
		System.out.println(s1==s2); // ���۷��� ��
		System.out.println(s3==s4); // ���۷��� ��
		
		System.out.println(s1.equals(s2)); // �� ��
		System.out.println(s1.equalsIgnoreCase(s2)); // ��ҹ��� ������� �� ��
		System.out.println(s2.equals(s3)); // �� ��
		System.out.println(s3.equals(s4)); // �� ��
		
		
	}

}
