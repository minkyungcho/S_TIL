package com.ssafy.array;

public class ArrayRetrieveTest3 {

	public static void main(String[] args) {

		int[][] datas = { { 1, 2, 3 }
						, { 4, 5, 6 }
						, { 7, 8, 9 } };
		int n = datas.length;
		// ������� Ž��
		for (int i = 0; i < n; i++) { // �� �ݺ�
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) { // �� �ݺ�
					System.out.print(datas[i][j] + " ");
				}
			} else {
				for (int j = n - 1; j > -1; j--) { // �� �ݺ�
					System.out.print(datas[i][j] + " ");
				}
			}
			System.out.println();
		}
		System.out.println();
		// ������� �ݴ� Ž��
		for (int i = 0; i < n; i++) { // �� �ݺ�
			if (i % 2 == 0) {
				for (int j = 0; j < n; j++) { // �� �ݺ�
					System.out.print(datas[j][i] + " ");
				}
			} else {
				for (int j = n - 1; j > -1; j--) { // �� �ݺ�
					System.out.print(datas[j][i] + " ");
				}
			}
			System.out.println();
		}

	}

}
