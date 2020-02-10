package swea.d4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_d4_1861_정사각형방 {

	static int T;
	static int N;
	static int[][] room;
	static int[][] roomCnt;
	static int roomNum;
	static int roomCntMax;

	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("res/swea/d4/1861_정사각형방.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// up down left right
		int[] dirR = {-1, 1, 0, 0};
		int[] dirC = {0, 0, -1, 1};
		
		int dn = 4;
		T = Integer.parseInt(br.readLine());
		for (int testcase = 1; testcase < T + 1; testcase++) {
//			roomNum = 1;
			roomCntMax = 0;
			
			N = Integer.parseInt(br.readLine());
			room = new int[N+1][N+1];
			roomCnt = new int[N+1][N+1];
			
			// 방 번호 입력하기
			for (int i = 1; i < N+1; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 1; j < N+1; j++) {
					room[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			int roomNowNum=0;
			int roomNextNum=0;
			int roomSub=0;
			for (int i = 1; i < N+1; i++) {
				for (int j = 1; j < N+1; j++) {
					System.out.println(i+", "+j+"");
					int fi = i;
					int fj = j;
					roomNum=1;
					int ci = i;
					int cj = j;
					nextroom : 
					for(int n = 0; n<N*N; n++) {
						roomNowNum = room[i][j];
						for (int d = 0; d < dn; d++) {
							System.out.print("방향탐색"+d+" ");
							int nr = fi + dirR[d];
							int nc = fj + dirC[d];
//							System.out.println();
							if(nr>0 && nr<N+1 && nc>0 && nc<N+1) {
								roomNextNum = room[nr][nc];
								roomSub = roomNextNum - roomNowNum;
								System.out.println(roomNextNum+"-"+roomNowNum);
								if(roomSub==1) {
//									System.out.print("roomNowNum:"+roomNowNum+", roomNextNum:"+roomNextNum);
									
									roomNum++;
									roomCnt[fi][fj] = roomNum;
									ci = nr;
									cj = nc;
									System.out.println("roomNum : "+roomNum+", ("+fi+", "+fj+")");
//									continue;
									break;
								}

							}else {
								ci = nr;
								cj = nc;
								continue;  
							}
						}
						System.out.println("===");
					}
					
//					print();
					
				}
			}
		
			
			
			
			// 출력
			System.out.println("#"+testcase+" "+roomNum+" "+roomCntMax);
			return;
		}
	}
	private static void print() {

		for (int i = 1; i < N+1; i++) {
			for (int j = 1; j < N+1; j++) {
				System.out.print(roomCnt[i][j] + " ");
			}
			System.out.println();
		}

	}
}
