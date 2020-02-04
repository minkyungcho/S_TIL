package com.ssafy.pack1;

public class Other {
	void callTest() {
		Parent p = new Parent();
		p.m1();
		p.m2();
		p.m3();
//		p.m4(); 에러 - private 요소는 참조 불가
	}
}
