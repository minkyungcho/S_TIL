package swea.d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_1289_�����Ǹ޸𸮺����ϱ� {

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
			
			StringBuilder nData = new StringBuilder(data); // ��Ʈ�� �����ؼ� ������ ������ ���� ���
			
			// ù 1�� ��ġ ã��
			int idx = data.indexOf("1");
			for(int i=idx; i<=size; ) {
				change(nData, i, size, ""+(cnt%2));
				if(data.equals(nData.toString())) {
					break;
				}
				// �� ���ڿ��� ���� �����Ƿ� �ٸ� ������ ã�´�.
				for(int j=i+1; j<size; j++) {
					// �� ���ڿ� ��		charAt(index) : ���ڿ��� index ��ġ�� �ش��ϴ� ���� �ϳ��� ����
					if(data.charAt(j) != nData.charAt(j)) {
						i = j;
						break;
					}
				}
				cnt++; // �ٸ� ��Ʈ�̹Ƿ� ���� ī��Ʈ ����
			}
			
			System.out.println("#"+test_case+" "+cnt);
		}
		
	}

	private static void change(StringBuilder nData, int start, int end, String fill) {
		for(int i=start; i<end; i++) {
			nData.replace(i, i+1, fill);
		}
		
	}

}
