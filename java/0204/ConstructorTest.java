package com.ssafy;

import java.lang.*;

class Abc{
	/*
	 * 클래스 내에는 최소 1개 이상의 생성자가 필요함!
	 * ---> 없다면 컴파일러가 내용없는 기본 생성자(인자가 비어있는)를 추가 시킴
	 * 		Abc(){}
	 * ---> 있다면 컴파일러는 생성자 추가를 하지 않는다.
	 */
	
	int su;	// =0
//	My my;	// =null
	Abc(){ // 기본 생성자
		System.out.println("생성자!(초기화코드)");
		su = 100;
//		my = new My();
		// 1. 멤버필드에 대한 초기화 작업   2. 선행작업
	}
	
	Abc(String name){ // 생성자 오버로딩
		System.out.println("오버로딩 생성자!");
	}
	
	void hello() {
		System.out.println("안녕");
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		
		Abc a = new Abc();
		//		   ------
		//		   생성자 호출
		//
		a.hello();
		
		Abc a2 = new Abc("홍길동");
		a2.hello();
	}

}
