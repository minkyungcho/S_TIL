package day2;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		/**
		 * Ű����κ��� 10���� ������ �Է¹޾� 
		 * �Է� ���� ���� �հ�, �ּҰ�, �ִ밪 �� ���
		 */
		
		Scanner s = new Scanner(System.in);
		int[] inputAr = new int[10];
		System.out.println("10���� ���ڸ� �Է��ϼ���.");
		for (int i=0; i<inputAr.length; i++) {
			inputAr[i] = s.nextInt();
		}
//		System.out.println(inputAr.toString());
		
		// �հ�, �ּ�, �ִ�
		int sum = 0;
		int min = inputAr[0];
		int max = inputAr[0];
		for (int a : inputAr) {
			sum += a;
			if(min > a) min = a;
			if(a > max) max = a;
		}
		System.out.println("�հ�� : "+sum);
		System.out.println("�ּҰ��� : "+min);
		System.out.println("�ִ밪�� : "+max);
		System.out.println();
		sum(inputAr);
		max(inputAr);
		int armin = min(inputAr);
		System.out.println("�ּ� "+armin);
		
	}
	
	// �հ� ���ϴ� �޼��� (�Լ�)
	public static void sum(int[] a) {
		int tot = 0;
		for(int su : a) {
			tot += su;
		}
		System.out.println("�հ� "+tot);
	}
	
	// �ִ밪 ���ϴ� �޼���
	public static void max(int[] a) {
		int armax = a[0];
		for(int su : a) {
			if(su > armax) armax = su;
		}
		System.out.println("�ִ� "+armax);
	}
	
	// �ּҰ� ���ϴ� �޼���
	public static int min(int[] a) {
		int armin = a[0];
		for(int su : a) {
			if(armin > su) armin = su;
		}
		return armin;
//		System.out.println("�ּ� "+armin);
	}
}
