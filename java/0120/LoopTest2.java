package test;

public class LoopTest2 {

	public static void main(String[] args) {
		/**
		 * �� ���
		 * 
		 */
		for (int row = 1; row <= 5; row++) {
			for (int i = 1; i <= row; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int row = 5; row >= 1; row--) {
			for (int i = row; i >= 1; i--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		for (int row = 1; row <= 5; row++) {
			for (int i = 1; i <= 5-row; i++) {
				System.out.print(" "); // ���� ��� 5-row
			}
			for (int i = 1; i <= row; i++) {
				System.out.print("*"); // �� ��� row
			}
			System.out.println();
		}

		System.out.println();
		char c = 'A';
		for (int row = 1; row <= 5; row++) {
			for (int i = 1; i <= row; i++) {
				System.out.print(c);
				c++;
			}
			System.out.println();
		}
		System.out.println();
	}

}
