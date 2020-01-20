package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {

		System.out.println(">>가위바위보 게임을 시작합니다. 아래 보기 중 하나를 고르세요.");
		System.out.println("1. 5판 3승\n2. 3판 2승\n3. 1판 1승");
		System.out.print("번호를 입력하세요.");
		Scanner s = new Scanner(System.in);
		int game_num = s.nextInt();
		int game_cnt = 0;
		int com_win_cnt = 0;
		int user_win_cnt = 0;

		while (true) {
			System.out.print("가위바위보 중 하나 입력: ");
			String user_input = s.next();
			int user = 0;
			switch (user_input) {
			case "가위":
				user = 1;
				break;
			case "바위":
				user = 2;
				break;
			case "보":
				user = 3;
				break;
			}
			int com = (int) (Math.random() * 3) + 1;
			System.out.println(com);
			switch (user - com) {
			case 0: // 무승부
				System.out.println("비겼습니다.");
				game_cnt++;
				break;
			case 1:
			case -2: // 사용자 승리
				System.out.println("이겼습니다.");
				game_cnt++;
				user_win_cnt++;
				break;
			case 2:
			case -1: // 컴퓨터 승
				System.out.println("졌습니다.");
				game_cnt++;
				com_win_cnt++;
				break;
			}
			// 5판 3선  
			if (game_num == 1) {
				
				if(user_win_cnt==3) {
					System.out.println("### 사용자 승!!!");
					return;
				}
				if(com_win_cnt==3) {
					System.out.println("### 컴퓨터 승!!!");
					return;
				}
				if(game_cnt==5) {
					System.out.println("5판 게임이 종료되었습니다.");
					switch(user_win_cnt-com_win_cnt) {
					case 0:
						System.out.println("### 무승부!!!");
						break;
					case 1: case 2:
						System.out.println("### 사용자 승!!!");
						break;
					case -1: case -2:
						System.out.println("### 컴퓨터 승!!!");
						break;
					}
					return;
				}

			// 3판 2선 승 
			} else if (game_num == 2) {
				if(user_win_cnt==2) {
					System.out.println("### 사용자 승!!!");
					return;
				}
				if(com_win_cnt==2) {
					System.out.println("### 컴퓨터 승!!!");
					return;
				}
				if(game_cnt==3) {
					System.out.println("3판 게임이 종료되었습니다.");
					switch(user_win_cnt-com_win_cnt) {
					case 0:
						System.out.println("### 무승부!!!");
						break;
					case 1:
						System.out.println("### 사용자 승!!!");
						break;
					case -1:
						System.out.println("### 컴퓨터 승!!!");
						break;
					}
					return;
				}
				
			// 1판 1선 승 
			} else if (game_num == 3) {
				if(user_win_cnt==1) {
					System.out.println("### 사용자 승!!!");
					return;
				}
				if(com_win_cnt==1) {
					System.out.println("### 컴퓨터 승!!!");
					return;
				}
				if(game_cnt==1) {
					System.out.println("### 무승부!!!");
					return;
				}

			}
		}

	}

}
