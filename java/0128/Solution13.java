package com.ssafy.algo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution13 {
	
	static int T, N;
	static int answer;
	
	public static void printMap(char[][] map, int N) {
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
    }
	public static void printMap(int[][] map, int N) {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		// �� �� �� �� ���  ����  ����  �»� 
		int[] dirR = {-1,1,0,0, -1, 1, 1, -1};
		int[] dirC = {0,0,-1,1, 1, 1, -1, -1};
		int dn = dirR.length;
		
		System.setIn(new FileInputStream("res/Solution13.txt"));
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt(); // testcase �Է�
		for(int testCase=1; testCase<T+1; testCase++) {
			// �Է�
			answer = 0;
			N = sc.nextInt(); // �迭 ũ�� �Է�
			char[][] map = new char[N][N];
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					map[r][c] = sc.next().charAt(0);
				}
			}
			printMap(map, N);
			System.out.println("======================");
			// ó��
			// 2�� ���� ǥ��
			char[][] heightMap = map;
			int[][] intHeightMap = new int[N][N];
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					if(map[r][c]=='G') {
						for(int i=0; i<dn; i++) {
							int nr = r + dirR[i];
							int nc = c + dirC[i];
							
							if(nr>-1 && nr<N && nc>-1 && nc<N && map[nr][nc]=='B') {
								heightMap[nr][nc] = '2';
							}
						}
					}
				}
			}
			printMap(heightMap, N);
			
			// G���� ���� ���� ���ϱ�
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					if(map[r][c]=='B') {
						// �� ��ġ�κ��� �����¿� Ž��
//						for(int ir=r-1; ir>=0; ir--) { // ��
//							if(map[ir][c]=='B' || map[ir][c]=='2') answer++;
//						}
//						for(int ir=r+1; ir<N; ir++) { // ��
//							if(map[ir][c]=='B' || map[ir][c]=='2') answer++;
//						}
//						for(int ic=c-1; c>=0; ic--) { // ��
//							if(map[r][ic]=='B' || map[r][ic]=='2') answer++;
//						}
//						for(int ic=c+1; ic<N; ic++) { // ��
//							if(map[r][ic]=='B' || map[r][ic]=='2') answer++;
//						}
						dn = 4;
						int cnt = 0;
						for(int k=1; k<N+1; k++) {
							for(int d=0; d<dn; d++) {
								int nr = r + dirR[d]*k;
								int nc = c + dirC[d]*k;
								if(nr>-1 && nr<N && nc>-1 && nc<N && map[nr][nc]!='G') {
									cnt++;
									System.out.println("r,c: "+r+","+c);
									System.out.println("nr,nc: "+nr+","+nc);
									System.out.println(cnt);
								}
							}
						}
						System.out.println("cnt : "+cnt);
//						intHeightMap[r][c] = cnt+1;
						
						for (int i = 0; i < N; i++) {
							for (int j = 0; j < N; j++) {
								if (heightMap[i][j]=='2') {
									intHeightMap[i][j] = 2;
								}
//								else if(heightMap[i][j]=='B' && heightMap[i][j]==0) {
//									intHeightMap[i][j] = cnt+1;
//									System.out.println("map�� cnt �Է��޴ٱ� "+(cnt+1));
//								}
							}
						}
					}
				}
			}
			printMap(intHeightMap, N);
			// �ִ밪 ���ϱ�
			answer = intHeightMap[0][0];
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if(intHeightMap[i][j]>answer) {
						answer = intHeightMap[i][j];
					}
				}
			}
			
			// ���
			System.out.println("#"+testCase+" "+answer);
		} // end testCase
	} // end main()
}
