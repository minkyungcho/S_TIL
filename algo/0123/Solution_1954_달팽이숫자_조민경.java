package swea.d2;

import java.util.Scanner;

public class Solution_1954_달팽이숫자_조민경 {

	public static void printMap(int[][] map, int N) {
    	for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		// 우 하 좌 상  
		int[] dirR = {0, 1, 0, -1};
		int[] dirC = {1, 0, -1, 0};
		int dn = dirR.length;
		
		for (int test_case = 1; test_case < T+1; test_case++) {
			int N = sc.nextInt();
			
			int[][] map = new int[N][N];
			
			int r = 0;
			int c = 0;
			int num = 0;
			int count = N;

			for(int i=0; i<(N/2+1); i++) {
				
				for(int k=0; k<dn; k++) {
					
					for(int cnt=0; cnt<count; cnt++) {
						int nr = r+dirR[k]*cnt;
						int nc = c+dirC[k]*cnt;
						if(nr>-1 && nr<N && nc>-1 && nc<N && map[nr][nc]==0) {
							map[nr][nc] = ++num;
						}
						if(cnt == count-1) {
							r = nr;
							c = nc;
							if(k == dn-1) {
								r++;
								c++;
								count-=2;
							}
						}
					}
				}
			}
			
			System.out.println("#"+test_case);
			printMap(map, N);
		}
	}

}
