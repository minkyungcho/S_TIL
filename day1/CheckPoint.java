package com.java.first;

import java.util.Scanner;

public class CheckPoint {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int height = s.nextInt();
		int weight = s.nextInt();
		int num = weight + 100 - height;
		
		System.out.println("�񸸼�ġ�� "+num+"�Դϴ�.");
		if(num > 0) {
			System.out.println("����� ���̱���.");
		}
	}

}
