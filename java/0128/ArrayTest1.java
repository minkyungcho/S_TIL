package com.ssafy;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		int[][] a = new int[3][2];
		a[0][0] = 100;
		a[1][1] = 200;
		
		for(int i=0; i<a.length; i++) { // 행 순회
			for(int j=0; j<a[i].length; j++) { // 열 순회
				System.out.print(a[i][j]+" ");
			} // 열 종료
			System.out.println();
		}
		
		System.out.println("===============");
		for(int[] aa : a) {
			for(int aaa : aa) {
				System.out.print(aaa+" ");
			}
			System.out.println();
		}
	}

}
