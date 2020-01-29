package com.ssafy.day4;

public class StringTest2 {

	public static void main(String[] args) {
		
		int i=10;
		int j=10;
		
		String s1 = new String("hello");
		String s2 = new String("Hello");
		String s3 = "hello";
		String s4 = "hello";
		
		System.out.println(i==j); // 값 비교
		System.out.println(s1==s2); // 레퍼런스 비교
		System.out.println(s3==s4); // 레퍼런스 비교
		
		System.out.println(s1.equals(s2)); // 값 비교
		System.out.println(s1.equalsIgnoreCase(s2)); // 대소문자 상관없이 값 비교
		System.out.println(s2.equals(s3)); // 값 비교
		System.out.println(s3.equals(s4)); // 값 비교
		
		
	}

}
