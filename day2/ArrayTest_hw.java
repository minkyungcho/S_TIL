package com.ssafy.java;

import java.util.Scanner;

public class ArrayTest_hw {
	
	static int[] input = new int[10];
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(int i=0; i<10; i++) {
			input[i] = s.nextInt();
		}
		print();
		total();
		average();
		minimum();
		selectionSort();
		print();
		
	}
	
	public static void print() {
		for(int i : input) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public static void total() {
		int sum = 0;
		for(int i : input) {
			sum += i;
		}
		System.out.println("TOTAL : "+sum);
	}
	
	public static void average() {
		double avg = 0;
		int sum = 0;
		for(int i : input) {
			sum += i;
		}
		avg = (double)sum/(double)(input.length);
		System.out.println("AVG : "+avg);
	}
	
	public static void minimum() {
		int min = input[0];
		for(int i=0; i<input.length; i++) {
			if(input[i] < min) {
				min = input[i];
			}
		}
		System.out.println("MIN : "+min);
	}
	
	public static void selectionSort() {
		for(int i=0; i<input.length; i++) {
			for(int j=i+1; j<input.length; j++) {
				if(input[i] > input[j]) {
					int tmp = input[i];
					input[i] = input[j];
					input[j] = tmp;
				}
			}
		}
	}
	
}
