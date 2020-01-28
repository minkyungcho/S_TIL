package com.ssafy.array.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Robot {
	public static void printMap(char[][] map, int N) {
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
    }
	public static void main(String[] args) throws FileNotFoundException {
		
//		int[][] dirA = {{1},{0}};
//		int[][] dirB = {{1,-1},{0,0}};
//		int[][] dirC = {{1,0,-1},{0,1,0}};
		// ©Л аб ╩С го  
		int[] dirR = {0, 0, 1, -1};
		int[] dirC = {1, -1, 0, 0};
		int dn = 0;
		
		System.setIn(new FileInputStream("res/robot.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case=1; test_case<T+1; test_case++){
			int N = sc.nextInt();
			
			char[][] map = new char[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					map[i][j] = sc.next().charAt(0);
				}
			}
			int cntA = 0;
			int cntB = 0;
			int cntC = 0;
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					if(map[i][j]=='A') {
						int r = i;
						int c = j;
						System.out.println("r,c : "+r+" "+c);
						for(int k=1; k<N+1; k++) {
							int nr = r + dirR[0]*k;
							int nc = c + dirC[0]*k;
							if(nr>-1 && nr<N && nc>-1 && nc<N && map[nr][nc]=='S') {
								cntA++;
								System.out.println("nr,nc : "+nr+" "+nc);
							}
							if(nr>-1 && nr<N && nc>-1 && nc<N && map[nr][nc]!='S') {
								break;
							}
						}
					}
					if(map[i][j]=='B') {
						dn = 2;
						int r = i;
						int c = j;
						System.out.println("r,c : "+r+" "+c);
						out:
						for(int k=1; k<N+1; k++) {
							for(int d=0; d<dn; d++) {
								int nr = r + dirR[d]*k;
								int nc = c + dirC[d]*k;
								if(nr>-1 && nr<N && nc>-1 && nc<N && map[nr][nc]=='S') {
									cntB++;
									System.out.println("nr,nc : "+nr+" "+nc);
								}
								if(nr>-1 && nr<N && nc>-1 && nc<N && map[nr][nc]!='S') {
									break out;
								}
							}
						}
					}
					if(map[i][j]=='C') {
						dn = 4;
						int r = i;
						int c = j;
						System.out.println("r,c : "+r+" "+c);
						out:
						for(int k=1; k<N+1; k++) {
							for(int d=0; d<dn; d++) {
								int nr = r + dirR[d]*k;
								int nc = c + dirC[d]*k;
								if(nr>-1 && nr<N && nc>-1 && nc<N && map[nr][nc]=='S') {
									cntC++;
									System.out.println("nr,nc : "+nr+" "+nc);
								}
								if(nr>-1 && nr<N && nc>-1 && nc<N && map[nr][nc]!='S') {
									break out;
								}
							}
						}
					}
				}
			}
			printMap(map, N);
			System.out.println("A : "+cntA);
			System.out.println("B : "+cntB);
			System.out.println("C : "+cntC);
		}
		
	}

}
