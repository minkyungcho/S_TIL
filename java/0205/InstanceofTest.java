package com.ssafy;

class Parent{
	A obj; // A obj = null;
	
	public Parent() {
		obj = new A(); // 클래스 먼저 생성
		obj.hello();
	}
}
class Child extends Parent{}

class A{
	void hello() {
		System.out.println("A안녕");
	}
}


public class InstanceofTest {

	public static void main(String[] args) {
		
		A a = new A();
		System.out.println("a참조변수는 A클래스의 객체(참조가능)?"+(a instanceof A));
		
		Parent p = new Parent();
		Child c = new Child();
		Parent p2 = new Child();	// p2 = c;
//		Parent p2 = (Parent) new Child();	// p2 = (Parent) c; 자동형변환!
		
//		Child c2 = p; // new Parent();  불가능해!	=> 컴파일에러
//		Child c2 = (Child) p; // ClassCastException => 런타임에러
//		Child c3 = p2; // => 컴파일에러
		Child c3 = (Child) p2; // p2는 겉모양은 Parent이지만 알맹이는 Child라서 형변환 가능하다
		
		
		System.out.println(p instanceof Child);		// false
		System.out.println(c instanceof Parent);	// true
		
		System.out.println(p2 instanceof Parent);	// true	
		System.out.println(p2 instanceof Child);	// true
		
		
		// 컴파일 에러와 런타임 에러 구분?
		String data = "13";
		int su = Integer.parseInt(data);
		System.out.println(su+100);
		
		System.out.println(10/0);
		
	}

}
