package day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1861_정사각형방 {
	static int[][] map;
	static int N;
	
	static Ans result;
    //상태공간트리에서 각각의 상태에 필요한 값. 현재 좌표. 처음칸이 몇이었는지. 몇칸 이동했는지.

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		StringTokenizer st;
		for (int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(in.readLine());
			// 상하좌우 경계선으로 활용
			map = new int[N + 2][N + 2];
			for (int i = 1; i < N + 1; i++) {
				st = new StringTokenizer(in.readLine());
				for (int j = 1; j < N + 1; j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}
			
//			for (int i =0; i < map.length; i++) {
//				for (int j = 0; j < map[i].length; j++)
//				  System.out.print(map[i][j]+" ");
//				System.out.println();
//			}

			// 정답객체사용
			result = new Ans(0, 0);

			// dfs출발
			for (int i = 1; i < N + 1; i++) {
				for (int j = 1; j < N + 1; j++)
					dfs(i, j, map[i][j], 1);
			}
			System.out.println("#" + tc + " " + result.toString());
		}
	}//main

	static class Ans {
		int pos;// 시작점의 값
		int cnt;// 내가 밟아온 칸의 갯수 (이동 횟수)

		Ans(int pos, int cnt) {
			this.pos = pos;
			this.cnt = cnt;
		}

		public int compareTo(Ans o) {
			if (this.cnt == o.cnt)
				return this.pos - o.pos;
			return o.cnt - this.cnt;
		}

		public String toString() {
			return this.pos + " " + this.cnt;
		}
	}

	static void dfs(int r, int c, int init, int cnt) {
		Ans ans = new Ans(init, cnt);
		if (result.compareTo(ans) > 0)
			result = ans;

		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (map[nr][nc] == map[r][c] + 1) {
				dfs(nr, nc, init, cnt + 1);
			}
		}
	}

	static int[] dr = { -1, 1, 0, 0 };
	static int[] dc = { 0, 0, -1, 1 };
}
