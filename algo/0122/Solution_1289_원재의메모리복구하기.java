package swea.d3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution_1289_원재의메모리복구하기 {

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
			
			StringBuilder nData = new StringBuilder(data); // 비트를 변경해서 원본과 같은지 비교할 대상
			
			// 첫 1의 위치 찾기
			int idx = data.indexOf("1");
			for(int i=idx; i<=size; ) {
				change(nData, i, size, ""+(cnt%2));
				if(data.equals(nData.toString())) {
					break;
				}
				// 두 문자열이 같지 않으므로 다른 지점을 찾는다.
				for(int j=i+1; j<size; j++) {
					// 두 문자열 비교		charAt(index) : 문자열의 index 위치에 해당하는 문자 하나를 리턴
					if(data.charAt(j) != nData.charAt(j)) {
						i = j;
						break;
					}
				}
				cnt++; // 다른 비트이므로 복구 카운트 증가
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
