package com.ssafy.day4;

public class StringTest4 {

	public static void main(String[] args) {
		
		/**
		 * names를 알파벳 순으로 정렬해보기
		 * 오름차순
		 */
		String[] names = {"kim", "lee", "park", "kang", "choi"};
		
		for(int i=0; i<names.length-1; i++) { // 기준
			String min = names[i];
			int minp = i;
			for(int j=i+1; j<names.length; j++) {
				if(min.compareTo(names[j]) > 0) {
					min = names[j];
					minp = j;
				}
			}
			// 변경 swap
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
