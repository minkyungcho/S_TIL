package com.ssafy.java;

import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {
		System.out.println(">>���������� ������ �����մϴ�. �Ʒ� ���� �� �ϳ��� ������.");
		System.out.println("1. 5�� 3��\n2. 3�� 2��\n3. 1�� 1��");
		System.out.print("��ȣ�� �Է��ϼ���.");
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
			System.out.print("���������� �� �ϳ� �Է�: ");
			String user_input = s.next();
			int com_input = (int)(Math.random()*3) +1;
			if(user_input=="����") {
				if(com_input==1) {
					System.out.println("�����ϴ�.");
					System.out.println("### ���º�!!!");
				}else if(com_input==2) {
					System.out.println("�̰���ϴ�.");
					System.out.println("### ����� ��!!!");
					
				}else if(com_input==3) {
					System.out.println("�����ϴ�.");
					System.out.println("### ����� ��!!!");
					
				}
			}
			
		}
		
	}

}
