package com.ssafy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LineInputTest {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("숫자 입력:");
		String str = br.readLine();
		System.out.println("STR : "+str);
		System.out.println(str+500); // "123" + 500 = "123500" 
		System.out.println(Integer.parseInt(str)+500); // 123 + 500 = 623 
		                             
		// input.txt 읽어서 프로그램 2차원 배열에 입력하고 콘솔에 출력
		BufferedReader br2 = new BufferedReader(new FileReader("input.txt"));
		
//		String str2 = br2.readLine(); // 3 4
//		String[] strArr = str2.split(" ");
		String[] strArr = br2.readLine().split(" "); // strArr[] = {"3", "4"}
		int N = Integer.parseInt(strArr[0]);
		int M = Integer.parseInt(strArr[1]);
		
		int[][] array = new int[N][M];
		
		// text 데이터 입력
		for (int i = 0; i < N; i++) {
			String[] s = br2.readLine().split(" "); // 30 40 88 40
			for (int j = 0; j < M; j++) {
				array[i][j] = Integer.parseInt(s[j]);
			}
		}

		System.out.println("====== array ========");
		
		// 배열 데이터 출력
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				System.out.print(array[i][j]+" "); 
			}
			System.out.println();
		}
		
		
	}

}
