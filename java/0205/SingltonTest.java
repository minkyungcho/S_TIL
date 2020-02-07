package com.ssafy;

class My{
	// 필드
	private static My instance;
	// 메소드
	
	private My() {	}
	
	public static My getInstance() {
		if(instance==null) {
			instance = new My();
		}
		return instance;
	}
}


public class SingltonTest {

	public static void main(String[] args) {
		
		My m1 = My.getInstance();
		My m2 = My.getInstance();
		My m3 = My.getInstance();
		
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		
	}

}
