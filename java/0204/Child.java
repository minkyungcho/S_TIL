package com.ssafy.pack1;

public class Child extends Parent {
	void callTest(){
		m1();
		m2();
		m3();
//		m4(); 에러 - 상속에서 private 멤버는 제외됨
	}
}
