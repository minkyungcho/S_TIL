package com.ssafy.day4;

public class StringTest4 {

	public static void main(String[] args) {
		
		/**
		 * names�� ���ĺ� ������ �����غ���
		 * ��������
		 */
		String[] names = {"kim", "lee", "park", "kang", "choi"};
		
		for(int i=0; i<names.length-1; i++) { // ����
			String min = names[i];
			int minp = i;
			for(int j=i+1; j<names.length; j++) {
				if(min.compareTo(names[j]) > 0) {
					min = names[j];
					minp = j;
				}
			}
			// ���� swap
			names[minp] = names[i];
			names[i] = min;
			
		}
		
		for(String name : names) {
			System.out.println(name);
		}
		
		String a = "abc";
		String b = "abd";
		System.out.println(a.compareTo(b)); // 
		
	}
}
