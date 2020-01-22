package com.java.first;

import java.util.Scanner;

public class CheckPoint {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int height = s.nextInt();
		int weight = s.nextInt();
		int num = weight + 100 - height;
		
		System.out.println("비만수치는 "+num+"입니다.");
		if(num > 0) {
			System.out.println("당신은 비만이군요.");
		}
	}

}
