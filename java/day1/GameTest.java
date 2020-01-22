package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {

		System.out.println(">>���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
		System.out.println("1. 5�� 3��\n2. 3�� 2��\n3. 1�� 1��");
		System.out.print("��ȣ�� �Է��ϼ���.");
		Scanner s = new Scanner(System.in);
		int game_num = s.nextInt();
		int game_cnt = 0;
		int com_win_cnt = 0;
		int user_win_cnt = 0;

		while (true) {
			System.out.print("���������� �� �ϳ� �Է�: ");
			String user_input = s.next();
			int user = 0;
			switch (user_input) {
			case "����":
				user = 1;
				break;
			case "����":
				user = 2;
				break;
			case "��":
				user = 3;
				break;
			}
			int com = (int) (Math.random() * 3) + 1;
			System.out.println(com);
			switch (user - com) {
			case 0: // ���º�
				System.out.println("�����ϴ�.");
				game_cnt++;
				break;
			case 1:
			case -2: // ����� �¸�
				System.out.println("�̰���ϴ�.");
				game_cnt++;
				user_win_cnt++;
				break;
			case 2:
			case -1: // ��ǻ�� ��
				System.out.println("�����ϴ�.");
				game_cnt++;
				com_win_cnt++;
				break;
			}
			// 5�� 3��  
			if (game_num == 1) {
				
				if(user_win_cnt==3) {
					System.out.println("### ����� ��!!!");
					return;
				}
				if(com_win_cnt==3) {
					System.out.println("### ��ǻ�� ��!!!");
					return;
				}
				if(game_cnt==5) {
					System.out.println("5�� ������ ����Ǿ����ϴ�.");
					switch(user_win_cnt-com_win_cnt) {
					case 0:
						System.out.println("### ���º�!!!");
						break;
					case 1: case 2:
						System.out.println("### ����� ��!!!");
						break;
					case -1: case -2:
						System.out.println("### ��ǻ�� ��!!!");
						break;
					}
					return;
				}

			// 3�� 2�� �� 
			} else if (game_num == 2) {
				if(user_win_cnt==2) {
					System.out.println("### ����� ��!!!");
					return;
				}
				if(com_win_cnt==2) {
					System.out.println("### ��ǻ�� ��!!!");
					return;
				}
				if(game_cnt==3) {
					System.out.println("3�� ������ ����Ǿ����ϴ�.");
					switch(user_win_cnt-com_win_cnt) {
					case 0:
						System.out.println("### ���º�!!!");
						break;
					case 1:
						System.out.println("### ����� ��!!!");
						break;
					case -1:
						System.out.println("### ��ǻ�� ��!!!");
						break;
					}
					return;
				}
				
			// 1�� 1�� �� 
			} else if (game_num == 3) {
				if(user_win_cnt==1) {
					System.out.println("### ����� ��!!!");
					return;
				}
				if(com_win_cnt==1) {
					System.out.println("### ��ǻ�� ��!!!");
					return;
				}
				if(game_cnt==1) {
					System.out.println("### ���º�!!!");
					return;
				}

			}
		}

	}

}
