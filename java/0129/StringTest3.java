package com.ssafy.day4;

public class StringTest3 {

	public static void main(String[] args) {
		
		String s = "hello";
		String s2 = s+"a"; // stringbuilder가 생성된다
		String ss = s.concat("a");
		System.out.println(s); // hello 
		System.out.println(ss); // helloa 
		if(s==s2) {
			System.out.println(true);
		}
		
		StringBuilder sb = new StringBuilder("Hello"); // new 로 생성해 줘야한다.
		sb.append("a"); // 객체를 새로 만들지 않고 자기자신한테 더함
		System.out.println(sb);
//		sb.insert(offset, b); // offset 위치에 삽입하기
//		sb.indexOf(str);
		sb.length();
		sb.reverse();
//		sb.setCharAt(index, ch); // 그 위치에 값을 넣어라
//		sb.setLength(newLength); // 글자 길이 설정하기.
		
	}

}
