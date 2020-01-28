package com.ssafy;

public class MethodTest {

	public static void main(String[] args) {
		work(5);
		work('A'); // 65시간 일하는 걸로 프린트된다. 묵시적 형변환!
		work(0);
		int result = work(5, 30);
		work(3, 40);
	}
	/**
	 * Overloading
	 * 하는 작업이 비슷하다면 메서드의 이름을 같게하고
	 * 파라미터를 다르게 줘서 식별하여 정의하는 기법
	 * 제한자, return type은 상관이 없다.
	 */
	public static void work(int time) {
		if(time<=0) return; // 시간이 0이하면 다시 되돌아가
		
		System.out.println("열심히 일하는 중...."+time);
//		return time; // char형이 와도 형변환 가능하다. 묵시적 형변환
	}

	public static int work(int time, int min) {
		if(time<=0) return time; // 시간이 0이하면 다시 되돌아가
		
		System.out.println("열심히 일하는 중...."+time);
		return time;
	}
	
}
