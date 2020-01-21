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
		boolean dup = false; // 중복되지 않았다고 가정
		do {
			tmp = r.nextInt(45)+1;
			// 중복되었는지? 중복되었으면 dup = true 으로 바꿈
			for(int k=0; k<index; k++) {
				if(lotto[k] == tmp) {
					dup = true;
					break;
				}
			}
		}while(dup);
		return tmp; // 중복되지 않은 값 리턴
	}
	
	public static void print() {
		for(int l : lotto) {
			System.out.println(l+" ");
		}
	}
}
