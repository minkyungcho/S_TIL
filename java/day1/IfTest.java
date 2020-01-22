package test;

import java.util.Scanner; 

public class IfTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
//		int score = 81;
		int score = s.nextInt(); 
		/** 
		 * s.nextInt() : ������ �Է�. ������ �Է��Ҷ����� ������ �Է¹���
		 * s.next() : ���ڿ� �Է�. 
		 * s.nextLine() : ���� �Է�
		 */
		/*if(score >= 70) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}*/
		
		/**
		 * ������ 90�� �̻��̸� A, 80�� �̻��̸� B, 70�� �̻��̸� C, �� �̸��̸� F�� ����ϴ� ���α׷�
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
		 * switch ������ ����Ͽ� ���Ͱ��� ����غ���
		 */
		switch(score/10*10) {
		case 100: // 100���̾ A����
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
