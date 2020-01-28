package com.ssafy.array.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Robot_T {
	
	static int T, N;
	static int answer;
	public static void main(String[] args) throws FileNotFoundException {
		
		
		System.setIn(new FileInputStream("res/robot.txt"));
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt(); // testcase 입력
		for(int testCase=1; testCase<T+1; testCase++) {
			// 입력
			N = sc.nextInt(); // 배열 크기 입력
			char[][] map = new char[N][N];
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					map[r][c] = sc.next().charAt(0);
				}
			}
			// 처리
			answer = 0; // answer 초기화
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					switch(map[r][c]) {
					case 'A': // 자신위치로부터 우 탐색
						for(int ic=c+1; ic<N; ic++) { // 우
							if(map[r][ic] == 'S') answer++;
							else break;
						}
						break;
					case 'B': // 자신 위치로부터 좌우 탐색
						for(int ic=c-1; ic>-1; ic--) { // 좌
							if(map[r][ic] == 'S') answer++;
							else break;
						}
						for(int ic=c+1; ic<N; ic++) { // 우
							if(map[r][ic] == 'S') answer++;
							else break;
						}
						break;
					case 'C': // 자신 위치로부터 상하좌우 탐색
						for(int ir=r-1; ir>-1; ir--) { // 상
							if(map[ir][c] == 'S') answer++;
							else break;
						}
						for(int ir=r+1; ir<N; ir++) { // 하
							if(map[ir][c] == 'S') answer++;
							else break;
						}
						for(int ic=c-1; ic>-1; ic--) { // 좌
							if(map[r][ic] == 'S') answer++;
							else break;
						}
						for(int ic=c+1; ic<N; ic++) { // 우
							if(map[r][ic] == 'S') answer++;
							else break;
						}
						
						break;
					}
				}
			}
			
			// 출력
			System.out.println("#"+testCase+" "+answer);
		} //end testCase 
	} // end main()
}
