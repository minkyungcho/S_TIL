package jungol.im;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1828_냉장고 {
	
	static int N;
	static int[][] temp;
	static int[] check =  new int[10271];
	public static void main(String[] args) throws Exception {
		
		System.setIn(new FileInputStream("res/jungol/im/1828_냉장고.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		temp = new int[N][2];
		int start;
		int end;
		for (int i = 0; i< N ; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			start = Integer.parseInt(st.nextToken());
			end = Integer.parseInt(st.nextToken());
			temp[i][0] = start;
			temp[i][1] = end;
		}
		
		int tmp = temp[0][1];
		for(int i=0; i<N; i++) {
			if(tmp>temp[i+1][1]) {
				tmp = temp[i+1][1];
				temp[i+1][1] = temp[i+1][1];
				temp[i][1] = tmp;
			}
		}
		
		for(int i=0; i<N; i++ ) {
			System.out.println(temp[i][0]+" "+temp[i][1]);
		}
//		System.out.println(result);
		
	}

}
