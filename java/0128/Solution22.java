package com.ssafy.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution22 {
	
	static int T, size, num;
	static int answer = 0;
	
	public static void printMap(int[][] map, int N) {
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
    }
	
	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("res/Solution22.txt"));
		Scanner sc = new Scanner(System.in);
		// up down left right 
		int[] dirR = {-1, 1, 0, 0};
		int[] dirC = {0, 0, -1, 1};
		T = sc.nextInt(); // testcase 
		for(int testCase=1; testCase<T+1; testCase++) {
			size = sc.nextInt();
			num = sc.nextInt();
			int[][] map = new int[size][size];
			answer = 0;
			for(int n=1; n<num+1; n++) {
				int r = sc.nextInt();
				int c = sc.nextInt();
				int dir = sc.nextInt(); // dir-1
				if(map[r][c]!=0) {
					continue;
				}else {
					for(int i=3; i>0; i--) {
						int nr = r + dirR[dir-1]*i;
						int nc = c + dirC[dir-1]*i;
						r = nr;
						c = nc;
						if(nr>-1 && nr<size && nc>-1 && nc<size) {
							if(i==1) {
								if(map[nr][nc]==0)
									map[nr][nc] = n;
							}else {
								if(map[nr][nc]==0)
									map[nr][nc] = -1;
							}
						}
					}
				}
			}
//			printMap(map, size);
			for (int i = 0; i < size; i++) {
				for (int j = 0; j < size; j++) {
					if(map[i][j]!=0 && map[i][j]!=-1) {
						answer++;
					}
				}
			}
			System.out.println("#"+testCase+" "+answer);
//			System.out.println("=====================");
		}
	}

}
