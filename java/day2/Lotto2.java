package day2;

import java.util.Random;

public class Lotto2 {
	
	static int[] lotto = new int[6];
	
	public static void main(String[] args) {
		
		selectLotto();
		print();
		
	}
	
	public static void selectLotto() {
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = uniqueNumber(i);
		}
	}
	
	public static int uniqueNumber(int index) {
		Random r = new Random();
		int tmp;
		boolean dup = false; // �ߺ����� �ʾҴٰ� ����
		do {
			tmp = r.nextInt(45)+1;
			// �ߺ��Ǿ�����? �ߺ��Ǿ����� dup = true ���� �ٲ�
			for(int k=0; k<index; k++) {
				if(lotto[k] == tmp) {
					dup = true;
					break;
				}
			}
		}while(dup);
		return tmp; // �ߺ����� ���� �� ����
	}
	
	public static void print() {
		for(int l : lotto) {
			System.out.println(l+" ");
		}
	}
}
