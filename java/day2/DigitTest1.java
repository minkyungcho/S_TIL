package com.ssafy.algo;

import java.util.Scanner;

public class DigitTest1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("100미만의 양의 정수들을 입력하세요.\n0을 입력하면 종료됩니다.\n");
		boolean flag = true;
		int[] inputAr = new int[10];
		int input;
		while(flag) {
			input = s.nextInt();
			if(input == 0) {
				System.out.println("종료");
				break;
			}
			inputAr[input/10]++;
		}
		for(int i=0; i<10; i++) {
			if(inputAr[i] != 0) {
				System.out.println(i+" : "+inputAr[i]+"개");
				
			}
		}
	}
}
