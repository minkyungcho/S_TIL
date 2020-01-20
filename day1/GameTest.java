package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승\n2. 3판 2승\n3. 1판 1승");
		System.out.print("번호를 입력하세요.");
		Scanner s = new Scanner(System.in);
		int game_num = s.nextInt();
		
		if(game_num==1) {
			while(true) {
				
				break;
			}
		}else if(game_num==2) {
			while(true) {
				
				break;
			}
		}else if(game_num==3) {
			System.out.print("가위바위보 중 하나 입력: ");
			String user_input = s.next();
			int com_input = (int)(Math.random()*3) +1;
			if(user_input=="가위") {
				if(com_input==1) {
					System.out.println("비겼습니다.");
					System.out.println("### 무승부!!!");
				}else if(com_input==2) {
					System.out.println("이겼습니다.");
					System.out.println("### 사용자 승!!!");
					
				}else if(com_input==3) {
					System.out.println("졌습니다.");
					System.out.println("### 사용자 승!!!");
					
				}
			}
			
		}
		
	}

}
