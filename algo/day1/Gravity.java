package com.ssafy.array;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Gravity {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.setIn(new FileInputStream("res/exercise/array/gravity.txt")); // swea 올릴때 주석처리하고 upload
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int test_case = 1; test_case <= T ; test_case++) {
			int mapSize = sc.nextInt();
			int[][] map = new int[mapSize][mapSize];
			int[] blockAr = new int[mapSize];
			int[] cntAr = new int[mapSize];
			
			for(int i=0; i<mapSize; i++) {
				blockAr[i] = sc.nextInt();
			}
			
			for(int i=0; i<mapSize; i++) {
				int num = blockAr[i];
				int cnt = 0;
				for(int j=i+1; j<mapSize; j++) {
					if(blockAr[j]>=num) {
						continue;
					}
					cnt++;
				}
				cntAr[i] = cnt;
			}
			
			int max = cntAr[0];
			for(int i=1; i<cntAr.length; i++) {
				if(max < cntAr[i]) max = cntAr[i];
			}
//			for(int i=0; i<mapSize; i++) {
//				for(int j=0; j<mapSize; j++) {
//					map[i][j] = sc.nextInt();
//				}
//			}
//			for(int i=0; i<mapSize; i++) {
//				int n = blockAr[i];
//				for(int j=0; j<n; j++) {
//					map[j][i] = 1;
//				}
//			}
//			for(int i=mapSize-1; i<=0; i--) {
//				
//				int n = blockAr[i];
//				
//				for(int j=0; j<n; j++) {
//					map[j][i] = 1;
//				}
//			}
			
			
			
//			for(int i=0; i<mapSize; i++) {
//				for(int j=0; j<mapSize; j++) {
//					System.out.print(map[i][j]+" ");
//				}
//				System.out.println();
//			}
			System.out.println(Arrays.toString(cntAr));
			System.out.println(max);
		
		}
	}

}
