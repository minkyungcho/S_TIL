package com.ssafy;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		int[][] a = {{10,20,30},{40,50,60},{70,80}};
		
		System.out.println("===============");
		for(int[] aa : a) {
			for(int aaa : aa) {
				System.out.print(aaa+" ");
			}
			System.out.println();
		}
	}

}
