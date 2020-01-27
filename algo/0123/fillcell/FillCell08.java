package com.ssafy.array.fillcell;
import java.util.Scanner;
/**
 * 여러개의 좌표를 입력 받아 해당 좌표 상하 좌우에 지정한 칸수까지 1을 누적한 후 
 * 누적 값 중에 최대값 출력하기
 * 
 * 입력 :
 *  다음줄 부터 :  배열의 개수  좌표개수 칸수  {row좌표, column좌표}*좌표개수
 *  8 4 3 1 1 3 1 3 3 4 2
 * 
 */
public class FillCell08 {
	static int AnswerN;
	public static void main(String[] args) {
		Scanner sc = new Scanner("8 4 3 1 1 3 1 3 3 4 2");
//		Scanner sc = new Scanner(System.in);
		
		
		int N = sc.nextInt();
		int[][] map = new int[N][N];

		int[] dirR = {-1, 1, 0, 0};
		int[] dirC = {0, 0, -1, 1};
		int dn = dirR.length;
		
		int num = sc.nextInt();
		int count = sc.nextInt();
		for(int n=0; n<num; n++) {
			int r = sc.nextInt();
			int c = sc.nextInt();
			
			for(int cnt=1; cnt<count+1; cnt++) {
				for(int k=0; k<dn; k++) {
					int nr = r + dirR[k]*cnt;
					int nc = c + dirC[k]*cnt;
					
					if(nr>-1 && nr<N && nc>-1 && nc<N) {
						map[nr][nc]++;
					}
				}
			}
			
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		
		AnswerN = map[0][0];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(map[i][j]>AnswerN) {
					AnswerN = map[i][j];
				}
			}
		}
		
		System.out.println("최대 누적 :"+AnswerN);
		
	}
}
