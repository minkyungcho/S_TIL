package com.ssafy;

class AA{
	int su;
	final int max=100;
	public void hello() {
		System.out.println("더블 A 안녕~!");
	}
}

class B{
	static int sum;
	public static void goodBye() {
		System.out.println("class B Bye~!!");
	}
}

public class StaticTest {
	public static void main(String[] args) {
		AA a = new AA();
		AA a2 = new AA();
		System.out.println("a SU:"+a.su);
		a.su++;
		a.hello();
		System.out.println("a SU:"+a.su);
		System.out.println("a2 SU:"+a2.su);
		
		System.out.println("===========");
		System.out.println("SUM="+B.sum);
		B.sum++;
		B.goodBye();
		System.out.println("SUM="+B.sum);
		
	}
	
	
}
