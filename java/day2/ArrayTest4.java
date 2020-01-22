package day2;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		/**
		 * ������ 10���� �Է¹޾� 
		 * ���������� ū�� ������ sort �ؼ� ����ϼ���.
		 * selection sort
		 */
		Scanner s = new Scanner(System.in);
		System.out.println("10���� ������ �Է��ϼ���.");
		int[] inputAr = new int[10];
		for(int i=0; i<inputAr.length; i++) {
			inputAr[i] = s.nextInt();
		}
		
		for(int i=0; i<inputAr.length; i++) {
			for(int j=i+1; j<inputAr.length; j++) {
				if(inputAr[j] < inputAr[i]) {
					int tmp = inputAr[i];
					inputAr[i] = inputAr[j];
					inputAr[j] = tmp;
				}
			}
		}
		
		for(int i : inputAr) {
			System.out.println(i);
		}
	}
	
	
	public static void sort(int[] su) {
		int min;
		int minp;
		for(int n=0; n<su.length-1; n++) { // ������
			min = su[n];
			minp = n;
			
			for(int i=n+1; i<su.length; i++) { // �񱳴��
				if(min > su[i]) {
					min = su[i];
					minp = i;
				}
			}
			// swap
			su[minp] = su[n];
			su[n] = min;
			
		}
		
	}
}
