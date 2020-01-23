package com.ssafy.array;

public class ArrayRetrieveTest3 {

	public static void main(String[] args) {

		int[][] datas = { { 1, 2, 3 }
						, { 4, 5, 6 }
						, { 7, 8, 9 } };
		int n = datas.length;
		// 지그재그 탐색
		for (int i = 0; i < n; i++) { // 행 반복
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) { // 열 반복
					System.out.print(datas[i][j] + " ");
				}
			} else {
				for (int j = n - 1; j > -1; j--) { // 열 반복
					System.out.print(datas[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		// 지그재그 반대 탐색
		for (int i = 0; i < n; i++) { // 열 반복
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) { // 행 반복
					System.out.print(datas[j][i] + " ");
				}
			} else {
				for (int j = n - 1; j > -1; j--) { // 행 반복
					System.out.print(datas[j][i] + " ");
				}
			}
			System.out.println();
		}

	}

}
