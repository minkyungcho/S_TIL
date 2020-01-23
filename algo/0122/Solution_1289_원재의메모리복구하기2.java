package swea.d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_1289_원재의메모리복구하기2 {

	public static void main(String[] args) throws FileNotFoundException {
		
//		Scanner sc = new Scanner(new FileInputStream(""));
		/**
		 * System.in 은 명령창으로부터 데이터를 읽지만
		 * setIn(~) 함수를 통해 입력 받는 대상을 변경한다. 
		 */
		System.setIn(new FileInputStream("res/swea/d3/1289_원재의메모리복구하기.txt")); // swea 올릴때 주석처리하고 upload
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T ; test_case++) {
			int cnt = 1; // 메모리 복구 횟수 
			String data = sc.next();
			int size = data.length();
			
			// startWith(str) : 문자열이 지정한 문자로 시작하면 true, 아니면 false
			if(data.startsWith("1")) {
				cnt++;
			}
			
			for(int i=0; i<size-1; i++) {
				// 현재 bit와 다음 bit가 같지 않으면 해당 bit로 복구해야한다.
				if(data.charAt(i) != data.charAt(i+1)) {
					cnt++;
				}
			}
			
			System.out.println("#"+test_case+" "+cnt);
		}
		
	}

}
