package test;

import java.util.Scanner; 

public class IfTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
//		int score = 81;
		int score = s.nextInt(); 
		/** 
		 * s.nextInt() : 정수형 입력. 공백을 입력할때까지 정수형 입력받음
		 * s.next() : 문자열 입력. 
		 * s.nextLine() : 한줄 입력
		 */
		/*if(score >= 70) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}*/
		
		/**
		 * 점수가 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 그 미만이면 F를 출력하는 프로그램
		 */
		if(score >=90) {
			System.out.println("A");
		} else if(score >= 80) {
			System.out.println("B");
		} else if(score >= 70){
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		/**
		 * switch 구문을 사용하여 위와같이 출력해보기
		 */
		switch(score/10*10) {
		case 100: // 100점이어도 A학점
		case 90:
			System.out.println("A");
			break;
		case 80:
			System.out.println("B");
			break;
		case 70:
			System.out.println("C");
			break;
		default :
			System.out.println("F");
		}
	}

}
