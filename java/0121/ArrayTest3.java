package day2;

import java.util.Scanner;

public class ArrayTest3 {

	public static void main(String[] args) {
		/**
		 * Ű���带 ���� 10���� ���� ������ �Է¹޾�
		 * ���� ū ���� �ִ� ���� ��ġ�� ���Ͻÿ�.
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("10���� ���� ������ �Է��ϼ���.");
		int[] inputAr = new int[10];
		for(int i=0; i<inputAr.length; i++) {
			inputAr[i] = s.nextInt();
		}
		
		int max = inputAr[0];
		int maxidx = 0;
		
		for(int i=1; i<inputAr.length; i++) {
			if(inputAr[i] > max) {
				max = inputAr[i]; 
				maxidx = i;
			}
		}
		System.out.println("���� ū ���� ��ġ : "+maxidx);
	}

}
