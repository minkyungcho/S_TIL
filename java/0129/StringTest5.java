package com.ssafy.day4;

import java.util.Scanner;

public class StringTest5 {

	public static void main(String[] args) {
		
		int k = 30;
		Integer k2 = new Integer(k);
		Integer k3 = k;
		System.out.println(k);
		System.out.println(k2);
		System.out.println(k3);
		
		Scanner sc = new Scanner(System.in);
		
		String msg = sc.next();
		char c = msg.charAt(0);
		if('0'<=c && c<='9') {
			System.out.println("����");
		}else {
			System.out.println("����");
			
		}
		Character ch = msg.charAt(0);
		System.out.println("����?"+ch.isDigit(ch));
		System.out.println("���ĺ�?"+ch.isAlphabetic(ch));
		System.out.println("����?"+ch.isLetter(ch));
		
	}

}
