package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("100�̸��� ���� �������� �Է��ϼ���.\n0�� �Է��ϸ� ����˴ϴ�.\n");
		boolean flag = true;
		int[] inputAr = new int[10];
		int input;
		while(flag) {
			input = s.nextInt();
			if(input == 0) {
				System.out.println("����");
				break;
			}
			inputAr[input/10]++;
		}
		for(int i=0; i<10; i++) {
			if(inputAr[i] != 0) {
				System.out.println(i+" : "+inputAr[i]+"��");
				
			}
		}
	}
}
