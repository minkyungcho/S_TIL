package com.ssafy.array;

public class ArrayRetrieveTest4 {

	public static void main(String[] args) {

		int[][] datas = { { 1, 2, 3 }
						, { 4, 5, 6 }
						, { 7, 8, 9 } };
		int n = datas.length;
		// ������� Ž�� ����
		for (int i = 0; i < n; i++) { // ��
			for (int j = 0; j < n; j++) { // ��
				System.out.print(datas[i][j+(n-1-2*j)*(i%2)] + " ");
			}
			System.out.println();
		}

	}

}