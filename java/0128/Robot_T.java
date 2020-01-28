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
		
		T = sc.nextInt(); // testcase �Է�
		for(int testCase=1; testCase<T+1; testCase++) {
			// �Է�
			N = sc.nextInt(); // �迭 ũ�� �Է�
			char[][] map = new char[N][N];
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					map[r][c] = sc.next().charAt(0);
				}
			}
			// ó��
			answer = 0; // answer �ʱ�ȭ
			for(int r=0; r<N; r++) {
				for(int c=0; c<N; c++) {
					switch(map[r][c]) {
					case 'A': // �ڽ���ġ�κ��� �� Ž��
						for(int ic=c+1; ic<N; ic++) { // ��
							if(map[r][ic] == 'S') answer++;
							else break;
						}
						break;
					case 'B': // �ڽ� ��ġ�κ��� �¿� Ž��
						for(int ic=c-1; ic>-1; ic--) { // ��
							if(map[r][ic] == 'S') answer++;
							else break;
						}
						for(int ic=c+1; ic<N; ic++) { // ��
							if(map[r][ic] == 'S') answer++;
							else break;
						}
						break;
					case 'C': // �ڽ� ��ġ�κ��� �����¿� Ž��
						for(int ir=r-1; ir>-1; ir--) { // ��
							if(map[ir][c] == 'S') answer++;
							else break;
						}
						for(int ir=r+1; ir<N; ir++) { // ��
							if(map[ir][c] == 'S') answer++;
							else break;
						}
						for(int ic=c-1; ic>-1; ic--) { // ��
							if(map[r][ic] == 'S') answer++;
							else break;
						}
						for(int ic=c+1; ic<N; ic++) { // ��
							if(map[r][ic] == 'S') answer++;
							else break;
						}
						
						break;
					}
				}
			}
			
			// ���
			System.out.println("#"+testCase+" "+answer);
		} //end testCase 
	} // end main()
}
