package test;

import java.util.Scanner;

public class LoopTest {

	public static void main(String[] args) {
		/**
		 * 10 ~ 100 ������ ������ �ϳ��� �Է¹޾� 
		 * 1 ~ �Է°� �� �հ踦 ���Ͽ� ����Ѵ�. 
		 * ��, 0�� �Էµɶ����� �� �۾��� �ݺ��Ѵ�.
		 */
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.println("���ڸ� �Է��ϼ���.(��, 0 �Է½� ����)");
			int input = s.nextInt();
			if (input != 0) {
				int sum = 0;
				for (int i = 1; i <= input; i++) {
					sum += i;
				}
				System.out.println(input+"������ �հ� : "+sum);
			}else {
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
	}
}