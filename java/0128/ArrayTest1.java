package com.ssafy;

public class ArrayTest1 {

	public static void main(String[] args) {
		
		int[][] a = new int[3][2];
		a[0][0] = 100;
		a[1][1] = 200;
		
		for(int i=0; i<a.length; i++) { // �� ��ȸ
			for(int j=0; j<a[i].length; j++) { // �� ��ȸ
				System.out.print(a[i][j]+" ");
			} // �� ����
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
