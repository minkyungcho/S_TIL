package com.ssafy;

class A{
	String str;	// 멤버변수(필드) - 모든 멤버(메소드)가 공유
	A(){	// 기본생성자
		this("알고리즘"); // 메소드 위에서 맨 뮈위애서
		this.hello();
//		hello();
	}
	A(String str){	// 오버로딩 생성자
		this.str =str;
	}
	void hello() {
		System.out.println("안녕,"+str);
	}
}

public class ThisTest {

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println("STR : "+a.str);
		
		A a2 = new A("자바");
		
		System.out.println("STR : "+a2.str);
		
		
	}

}
