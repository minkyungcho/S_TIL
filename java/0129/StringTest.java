package com.ssafy.day4;

public class StringTest {

	public static void main(String[] args) {
		
		String s = new String("Hello"); // java.lang에 있어서 import 안해도 됨
		String ss = "Hello"; // new 하는 것처럼 취급해주기로 약속했다.
		
		System.out.println(ss.charAt(3)); // 지정 위치의 문자 하나
		System.out.println(ss.length()); // 문자열의 길이
		System.out.println(ss.indexOf("l")); // 지정 문자열의 위치
		System.out.println(ss.startsWith("He")); // true/false
		System.out.println(ss.substring(1,3));  //1부터 4위치 전까지
		System.out.println(ss.substring(3)); // 3위치부터 끝까지
		System.out.println(ss.toLowerCase()); // 모두 소문자
		System.out.println(ss.toUpperCase()); // 모두 대문자
		System.out.println(ss.trim()); // 양쪽 공백을 제거
		String[] result = ss.split(""); // 지정된 문자열로 분리
		for(String re : result) {
			System.out.println(re);
		}
	
	}

}
