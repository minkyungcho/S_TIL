package swea.d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_1289_�����Ǹ޸𸮺����ϱ�2 {

	public static void main(String[] args) throws FileNotFoundException {
		
//		Scanner sc = new Scanner(new FileInputStream(""));
		/**
		 * System.in �� ���â���κ��� �����͸� ������
		 * setIn(~) �Լ��� ���� �Է� �޴� ����� �����Ѵ�. 
		 */
		System.setIn(new FileInputStream("res/swea/d3/1289_�����Ǹ޸𸮺����ϱ�.txt")); // swea �ø��� �ּ�ó���ϰ� upload
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T ; test_case++) {
			int cnt = 1; // �޸� ���� Ƚ�� 
			String data = sc.next();
			int size = data.length();
			
			// startWith(str) : ���ڿ��� ������ ���ڷ� �����ϸ� true, �ƴϸ� false
			if(data.startsWith("1")) {
				cnt++;
			}
			
			for(int i=0; i<size-1; i++) {
				// ���� bit�� ���� bit�� ���� ������ �ش� bit�� �����ؾ��Ѵ�.
				if(data.charAt(i) != data.charAt(i+1)) {
					cnt++;
				}
			}
			
			System.out.println("#"+test_case+" "+cnt);
		}
		
	}

}
