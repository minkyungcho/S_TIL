package test;

public class Test {
	/**
	 * 실행 메소드
	 */
	public static void main(String[] args) {
		int a = 13;
		int b = 5;
		float c = a / b;
		String city = "Seoul";
		System.out.println(c + city+b+a);
		// 이항연산자 특성상 input값 중 하나가 문자열이면 문자열끼리의 덧셈으로 처리됨.
	}
}
