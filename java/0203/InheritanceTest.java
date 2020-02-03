package com.ssafy;

public class InheritanceTest {
	
	// JavaApplication(main 포함) 
	
	public static void main(String[] args) {
		
		// 객체생성식 A obj = new A();
		Parent p = new Parent();
		System.out.println(p.su);
		p.hello();
//		p.goodBye(); // 에러 : 부모레퍼런스 통해 자식 호출 불가!
		
		System.out.println("========");
		Child c = new Child();
		c.goodBye();
		System.out.println("파이:"+c.pi);
		c.hello();
		c.toString();
		c.print();
		p.print();
		
		Parent pp = new Child();
		
//		Child cc = new Parent();

	
	}

}
