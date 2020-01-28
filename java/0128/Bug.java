package com.ssafy.array.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bug {
	
	static int T, size, num;
	static int answer = 0;
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("res/Bug.txt"));
		Scanner sc = new Scanner(System.in);
		// 하  우 
		int[] dirR = {1, 0};
		int[] dirC = {0, 1};
		T = sc.nextInt(); // testcase 입력
		for(int testCase=1; testCase<T+1; testCase++) {
			// 입력
			size = sc.nextInt();
			num = sc.nextInt();
			int[][] map = new int[size][size];
			
			for(int n=1; n<num+1; n++) {
				int number = n;
				int r = sc.nextInt();
				int c = sc.nextInt();
				int dir = sc.nextInt(); // dir-1
				
				int nr = r + dirR[dir]*3;
				int nc = c + dirC[dir]*3;

				int nnr = nr + dirR[dir]*2;
				int nnc = nc + dirC[dir]*2;
				
				int nnnr = nnr + dirR[dir];
				int nnnc = nnc + dirC[dir];
				
				// 점프 가능 : 경계범위 내, 다음 지점에 소금쟁이 없음.  
				if(nr>-1 && nr<size && nc>-1 && nc<size && map[nr][nc]==0) {
					map[nr][nc] = n;
				}else continue;

				if(nnr>-1 && nnr<size && nnc>-1 && nnc<size && map[nnr][nnc]==0) {
					map[nnr][nnc] = n;
				}else continue;
				
				if(nnnr>-1 && nnnr<size && nnnc>-1 && nnnc<size && map[nnnr][nnnc]==0) {
					map[nnnr][nnnc] = n;
				}else continue;
				
				
				
			}
			
			System.out.println("#"+testCase+" "+answer);
		}
		
	}

}
