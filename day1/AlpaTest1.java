package com.ssafy.java;

public class AlpaTest1 {

	public static void main(String[] args) {
		char c = 'A';
		for (int row = 1; row <= 5; row++) {
			for (int i = 1; i <= row; i++) {
				System.out.print(c); // ���ĺ� ���
				c++;
			}
			System.out.println();
		}
	}

}
