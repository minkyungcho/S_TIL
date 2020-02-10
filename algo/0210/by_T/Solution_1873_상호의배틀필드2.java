package day8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1873_상호의배틀필드2 {
	static int[] dh = { -1, 1, 0, 0 };
	static int[] dw = { 0, 0, -1, 1 };

	public static void main(String[] args) throws Exception{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		StringTokenizer st;
		for (int tc = 1; tc <= T; tc++) {
			
			st = new StringTokenizer(in.readLine()," ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			char[][] map = new char[H][W];
			int[] pos = new int[2];//전차의 위치(행열)
			for (int i = 0; i < H; i++) {
				String c = in.readLine();
				map[i] = c.toCharArray();
				for (int j = 0; j < map[i].length; j++) {
					switch (map[i][j]) {
					case '<':
					case '>':
					case '^':
					case 'v':
						pos[0] = i;
						pos[1] = j;
						break;
					}
				}
			}

			
			int N = Integer.parseInt(in.readLine());
			String oper = in.readLine();
			for (int i = 0; i < N; i++) {
				
				char c = oper.charAt(i);
				switch (c) {
				case 'U':
					map[pos[0]][pos[1]] = '^';
					move(map, pos, 0);
					break;
				case 'D':
					map[pos[0]][pos[1]] = 'v';
					move(map, pos, 1);
					break;
				case 'L':
					map[pos[0]][pos[1]] = '<';
					move(map, pos, 2);
					break;
				case 'R':
					map[pos[0]][pos[1]] = '>';
					move(map, pos, 3);
					break;
				case 'S':
					shoot(map, pos);
					break;
				}
			}
			System.out.print("#" + tc + " ");

			for (int i = 0; i < H; i++) {
				for (int j = 0; j < W; j++)
					System.out.print(map[i][j]);
				System.out.println();
			}

		}
	}

	static void shoot(char[][] map, int[] pos) {
		int dir = 0;
		
		switch (map[pos[0]][pos[1]]) {
		case '^':
			dir = 0;
			break;
		case 'v':
			dir = 1;
			break;
		case '<':
			dir = 2;
			break;
		case '>':
			dir = 3;
			break;
		}
		
		int nph = pos[0];
		int npw = pos[1];
		while (true) {
			
			nph = nph + dh[dir];
			npw = npw + dw[dir];
			
			if (nph < 0 || npw < 0 || nph >= map.length || npw >= map[0].length)
				return;
			
			if (map[nph][npw] == '*') {
				map[nph][npw] = '.';
				return;
			
			} else if (map[nph][npw] == '#')
				return;
		}

	}

	//static int[] dh = { -1, 1, 0, 0 };
	//static int[] dw = { 0, 0, -1, 1 };
	static void move(char[][] map, int[] pos, int dir) {
		//U, D,  L, R  ===> 0, 1, 2, 3
		int nph = pos[0] + dh[dir];
		int npw = pos[1] + dw[dir];
	
		if (nph < 0 || npw < 0 || nph >= map.length || npw >= map[0].length)
			return;
		
		if (map[nph][npw] == '.') {			
			map[nph][npw] = map[pos[0]][pos[1]];			
			map[pos[0]][pos[1]] = '.';			
			pos[0] = nph;
			pos[1] = npw;
		}
	}
}



