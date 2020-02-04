package com.ssafy;

class Parent{
	public Parent() {
		System.out.println("부모생성자");
	}
	public Parent(String str) {
		System.out.println("부모오버로딩생성자");
	}
	void hello() {
		System.out.println("안녕부모");
	}
}

// 상속 예외  1. 생성자 2. private 멤버
class Child extends Parent{
	public Child() {
		super("자바~"); // 첫번째 줄에서 쓰여야한다.
		System.out.println("자식생성자");
	}
	void hello() {
		System.out.println("안녕자식");
	}
	void callTest() {
//		this.hello();
		hello(); // this.이 생략되어 있는것
	}
	void callTest2() {
		super.hello();
	}
}

public class SuperTest {
	public static void main(String[] args) {
		
		Child c = new Child(); 
		// 자식만 선언했는데도 부모 클래스 메모리 할당 하고 자식클래스 또한 메모리 할당되어 
		// 기본생성자에 있는 출력문이 제일 먼저 나오는 것을 볼 수 있다.
		
		c.callTest();
		
		// callTest2()를 호출하고 경우 부모의 hell()를 호출하고 싶다!
		c.callTest2();
	}
}
