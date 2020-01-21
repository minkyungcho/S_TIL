package day2;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		
		Random r = new Random();
		int[] lotto = new int[6];
		boolean flag = true;
		int idx = 0;
		while(flag) {
			if(idx==6) break;
			int tmp = r.nextInt(45)+1;
			for(int i=0; i<6; i++) {
				if(tmp == lotto[i]) {
					break;
				}
				lotto[idx] = tmp;
			}
			idx++;
		}
		
//		for(int i=0; i<lotto.length; i++) {
//			for(int j=i+1; j<lotto.length; j++) {
//				if(lotto[i] > lotto[j]) {
//					int tmp = lotto[i];
//					lotto[i] = lotto[j];
//					lotto[j] = tmp;
//				}
//			}
//		}
		
		
		for(int n : lotto) {
			System.out.println(n+" ");
		}
		
	}

}
