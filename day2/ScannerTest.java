package day2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws FileNotFoundException {
		
		// Ű���� �Է�
//		Scanner s = new Scanner(System.in); 
		
		// �ؽ�Ʈ���� 
		Scanner t = new Scanner(new File("test.txt"));
		/**
		 * .next() ���ڿ��� �б� ������� 
		 * .nextInt() ���������� �б�
		 * .nextLine() ���� �б�
		 */
//		String msg = t.nextLine();
//		System.out.println(msg);
//		String msg2 = t.nextLine();
//		System.out.println(msg2);
//		String a = t.next();
//		int age = t.nextInt();
//		String b = t.next();
//		System.out.println(a+":"+b+":"+age);
//		String a2 = t.next();
//		int age2 = t.nextInt();
//		String b2 = t.next();
//		System.out.println(a2+":"+b2+":"+age2);
		String msg = t.nextLine();
		System.out.println(msg);
		String[] msgAr = msg.split(" ");
		for(int i=0; i<msgAr.length; i++) {
			System.out.println(msgAr[i]);
		}
		System.out.println(t.nextLine().trim());
		System.out.println(t.nextLine().trim());
		Random r = new Random();
		r.nextInt();
		r.nextInt(3);
	}

}
