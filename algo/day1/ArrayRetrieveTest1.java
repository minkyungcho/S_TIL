package com.ssafy.array;

public class ArrayRetrieveTest1 {

	public static void main(String[] args) {

		int[][] datas = { { 1, 2, 3 }
						, { 4, 5, 6 }
						, { 7, 8, 9 } };
		int n = datas.length;
		// 행 우선 탐색
		for (int i = 0; i < n; i++) { // 행
			for (int j = 0; j < n; j++) { // 열
				System.out.print(datas[i][j] + " ");
			}
			System.out.println();
		}

	}

}
