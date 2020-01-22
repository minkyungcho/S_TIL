package test;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		/**
		 * 10 ~ 100 사이의 정수값 하나를 입력받아 
		 * 1 ~ 입력값 의 합계를 구하여 출력한다. 
		 * 단, 0이 입력될때까지 위 작업을 반복한다.
		 */
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("숫자를 입력하세요.(단, 0 입력시 종료)");
			int input = s.nextInt();
			if (input != 0) {
				int sum = 0;
				for (int i = 1; i <= input; i++) {
					sum += i;
				}
				System.out.println(input+"까지의 합계 : "+sum);
			}else {
				System.out.println("종료되었습니다.");
				break;
			}
		}
	}
}