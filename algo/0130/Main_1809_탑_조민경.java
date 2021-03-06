package jungol.im;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
 
public class Main_1809_탑_조민경 {
 
    public static void main(String[] args) throws FileNotFoundException {
         
//      System.setIn(new FileInputStream("res/1809_탑.txt"));    // 0 0 2 2 4
//      System.setIn(new FileInputStream("res/1809_탑2.txt"));   // 0 0 0 3 3 3 6
//      System.setIn(new FileInputStream("res/1809_탑3.txt"));   // 0 0 2 0 0 5 6
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> idx = new Stack<>();
        int[] towers = new int[n];
        for(int i=0; i<n; i++) {
            int top = sc.nextInt();
         
	        while(!stack.isEmpty() && stack.peek()<top) {
	        	stack.pop();
	        	idx.pop();
	        }
	        if(!stack.isEmpty() && stack.peek()>top) {
	        	towers[i] = idx.peek();
	        }
	        stack.push(top);
	        idx.push(i+1);
        }
        for(int t : towers) {
            System.out.print(t+" ");
        }
    }
 
}