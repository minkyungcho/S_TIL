package com.ssafy;

public class BeansTest {

	public static void main(String[] args) {
		
		Person p = new Person();
//		p.name = "홍길동"; // error : private 이기 때문!
		p.setName("홍길동");
		p.setAge(13);
		p.setJob("학생");
		
		System.out.println("p이름:"+p.getName());
		
		// 
		Person p2 = new Person("김길동", 15, "학생"); 
		System.out.println("p2 이름:"+p2.getName());
		System.out.println("p2 나이:"+p2.getAge());
		System.out.println("p2 직업:"+p2.getJob());
		
		System.out.println(p2);
		System.out.println(p2.toString());
	}

}
