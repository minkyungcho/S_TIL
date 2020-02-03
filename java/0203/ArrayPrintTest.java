package com.ssafy;

import java.util.Iterator;

public class ArrayPrintTest {

	public static void main(String[] args) {
		
		int[][] su = {{1}, {2,3}, {4,5,6}};
		
		for(int i=0; i<su.length; i++) {
			for(int j=0; j<su[i].length; j++) {
				System.out.println("su["+i+"]["+j+"]");
			}
		}
		
		
		
	}

}
