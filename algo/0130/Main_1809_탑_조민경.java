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
        int[] towers = new int[n];
        int[] towerPos = new int[n];
        for(int i=0; i<n; i++) {
            int tower = sc.nextInt();
            towers[i] = tower;
            stack.push(tower);
        }
         
        while(!stack.isEmpty()) {
            int top = stack.pop();
             
            for(int i=stack.size(); i>-1; i--) {
                if(top<towers[i]) {
                    towerPos[stack.size()] = i+1;
                    break;
                }
            }
        }
        for(int pos : towerPos) {
            System.out.print(pos+" ");
        }
//      System.out.println(Arrays.toString(towerPos));
    }
 
}