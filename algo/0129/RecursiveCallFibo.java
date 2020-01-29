package com.ssafy.recursive;

/**
 * 1 2 3 4 5 6 7 8 9 10 11 12 
 * 1 1 2 3 5 8 13 21 34 55 89 ...
 */
public class RecursiveCallFibo {

	public static int fibo2(int n) {
		if(n<2) {
			return n;
		}
		return fibo2(n-1)+fibo2(n-2);
	}
	
	public static void main(String[] args) {
		int n = 7;
		System.out.printf("%d번째의 수열: %d\n", n,fibo2(n));
	}

}
