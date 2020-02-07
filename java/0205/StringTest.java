package com.ssafy;

public class StringTest {

	public static void main(String[] args) {
		String str = "JavaProgramming";
		// 			  012345678901234
		String c1 = str.concat("Ssafy"); // 문자열 연결 '+'와 같다
		System.out.println("c1="+c1);
//		str.replace(char oldChar, char newChar)
//		str.replace()
		System.out.println(str.replace('a', 'o'));
		System.out.println("STR="+str);
		System.out.println(str.replace("Programming", "프로그래밍"));
		System.out.println("문자열길이+"+str.length());
		System.out.println("부분문자열('Pro')"+str.substring(4,7));
		System.out.println("부분문자열('Programming')"+str.substring(4));
		// String str = ""
		//
		
		System.out.println("전체대문자 변환="+str.toUpperCase());
		System.out.println("전체소문자 변환="+str.toLowerCase());
		
		str = "  "+str+"  "; // 앞뒤에 스페이스공백 2개씩 추가!!
		System.out.println("공백추가 후 길이="+str.length());
		str = str.trim(); // 양쪽 연속적인 공백을 제거!
		System.out.println("공백제거 후 길이="+str.length());
		
		// 검색
		System.out.println(str.startsWith("Jav"));	// 특정문자열로 시작하면 true
		System.out.println(str.endsWith("ing"));	// 특정문자열로 끝나면 true
		
		// 특정문자의 index 얻기
		System.out.println("P문자의 인덱스="+str.indexOf(97)); // a=97
		System.out.println("P문자의 인덱스="+str.indexOf('a')); // a=97
		System.out.println("P문자의 인덱스="+str.indexOf('P')); // a=97
		
		// index에 해당하는 문자얻기
		System.out.println("4인덱스의 문자="+str.charAt(4));
		
		//"010-2345-6789"
		//
		String tel = "010-2345-6789";
		int idx1 = tel.indexOf("-");
		int idx2 = tel.lastIndexOf("-");	//	indexOf("-", (idx1+1));
		
		String tel1, tel2, tel3;
		tel1 = tel.substring(0, idx1); // (0,3)
		tel2 = tel.substring(idx1+1, idx2); // (0,3)
		tel3 = tel.substring(idx2+1); // (0,3)
		System.out.println(tel1);
		System.out.println(tel2);
		System.out.println(tel3);
		
		// a=97		b=98	c=99	d=100
		// 기준 a		a<b		음수
		//			a==b	0
		//			a>b		양수
		System.out.println("e".compareTo("b"));
		
		
		
		
	}

}
