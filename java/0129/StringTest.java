package com.ssafy.day4;

public class StringTest {

	public static void main(String[] args) {
		
		String s = new String("Hello"); // java.lang�� �־ import ���ص� ��
		String ss = "Hello"; // new �ϴ� ��ó�� ������ֱ�� ����ߴ�.
		
		System.out.println(ss.charAt(3)); // ���� ��ġ�� ���� �ϳ�
		System.out.println(ss.length()); // ���ڿ��� ����
		System.out.println(ss.indexOf("l")); // ���� ���ڿ��� ��ġ
		System.out.println(ss.startsWith("He")); // true/false
		System.out.println(ss.substring(1,3));  //1���� 4��ġ ������
		System.out.println(ss.substring(3)); // 3��ġ���� ������
		System.out.println(ss.toLowerCase()); // ��� �ҹ���
		System.out.println(ss.toUpperCase()); // ��� �빮��
		System.out.println(ss.trim()); // ���� ������ ����
		String[] result = ss.split(""); // ������ ���ڿ��� �и�
		for(String re : result) {
			System.out.println(re);
		}
	
	}

}
