package com.ssafy.array.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Bug {
	
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
		
		System.setIn(new FileInputStream("res/Bug.txt"));
		Scanner sc = new Scanner(System.in);
		// down right 
		int[] dirR = {1, 0};
		int[] dirC = {0, 1};
		T = sc.nextInt(); // testcase 
		for(int testCase=1; testCase<T+1; testCase++) {

			size = sc.nextInt();
			num = sc.nextInt();
			int[][] map = new int[size][size];
			answer = 0;
			for(int n=1; n<num+1; n++) {
				int number = n;
				int r = sc.nextInt();
				int c = sc.nextInt();
				int dir = sc.nextInt(); // dir-1
				for(int i=3; i>0; i--) {
					int nr = r + dirR[dir-1]*i;
					int nc = c + dirC[dir-1]*i;
					r = nr;
					c = nc;
					if(nr>-1 && nr<size && nc>-1 && nc<size) {
						if(map[nr][nc]==0)
							map[nr][nc] = n;
						else 
							answer = n;
					}
				}
			}
//			printMap(map, size);
			System.out.println("#"+testCase+" "+answer);
//			System.out.println("=====================");
		}
		
	}

}
