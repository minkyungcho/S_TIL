package com.ssafy.array;

public class ArrayRetrieveTest2 {

	public static void main(String[] args) {

		int[][] datas = { { 1, 2, 3 }
						, { 4, 5, 6 }
						, { 7, 8, 9 } };
		int n = datas.length;
		// 열 우선 탐색
		for (int i = 0; i < n; i++) { // 열
			for (int j = 0; j < n; j++) { // 행
				System.out.print(datas[j][i] + " ");
			}
			System.out.println();
		}

	}

}
