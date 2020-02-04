package com.ssafy.classDesign;

import java.util.Arrays;
import java.util.Scanner;

public class BookTest {
	
	static int MAX=100;
	
	public static void main(String[] args) {
		
		
		
		Book b = new Book(1234, "책제목", "지은이", "출판사", 9900, "알고리즘공부방법");
		Book b2 = new Book(1234, "제목", "지은이", "출판사", 9900, "알고리즘공부방법");
		Book b3 = new Book(1234, "제목", "지은이", "출판사", 9900, "알고리즘공부방법");
		Book b4 = new Book(1234, "제목", "지은이", "출판사", 9900, "알고리즘공부방법");
		Book b5 = new Book(1234, "제목", "지은이", "출판사", 9900, "알고리즘공부방법");
		
		Magazine m = new Magazine(123, "매거진제목", "지은이", "출판사", 10000, "2020패션", 2020, 1);
		Magazine m2 = new Magazine(123, "제목", "지은이", "출판사", 10000, "2020패션", 2020, 1);
		Magazine m3 = new Magazine(123, "제목", "지은이", "출판사", 10000, "2020패션", 2020, 1);
		Magazine m4 = new Magazine(123, "제목", "지은이", "출판사", 10000, "2020패션", 2020, 1);
		Magazine m5 = new Magazine(123, "제목", "지은이", "출판사", 10000, "2020패션", 2020, 1);
		
		m2.setAuthor("매거진지은이");
		
		Book[] books = new Book[MAX];
		books[0] = b;
		books[1] = m;
		books[2] = b2;
		books[3] = m2;
		books[4] = b3;
		books[5] = m3;
		books[6] = b4;
		books[7] = m4;
		books[8] = b5;
		books[9] = m5;
		
		Scanner sc = new Scanner(System.in);
		int cnt = 10;
		out:
		while(true) {
			System.out.print("Book/Magazine 등록(1), 검색(2), 금액합계(3), 금액평균(4), 책 전체검색(8), 종료(9)");
			int input = sc.nextInt();
			switch (input) {
			case 9:
				System.out.println("종료되었습니다.");
				break out;
			case 8:
				for(Book book : books) {
					if(book != null) {
						System.out.println(book.toString());
					}
				}
				break;
			case 1:
				System.out.print("Book(1)/Magazine(2)");
				int num = sc.nextInt();
				if(num==1) {
					System.out.println("Book : ISBN(숫자),title,author,publisher,price(숫자),desc\n위와 같은 형식으로 입력해주세요.");
					String[] bookLine = sc.next().split(",");
					Book newBook = new Book();
					newBook.setIsbn(Integer.parseInt(bookLine[0]));
					newBook.setTitle(bookLine[1]);
					newBook.setAuthor(bookLine[2]);
					newBook.setPublisher(bookLine[3]);
					newBook.setPrice(Integer.parseInt(bookLine[4]));
					newBook.setDesc(bookLine[5]);
					books[cnt++] = newBook;
				}else if(num==2) {
					System.out.println("Magazine : ISBN(숫자),title,author,publisher,price(숫자),desc,year(숫자),month(숫자)\n위와 같은 형식으로 입력해주세요.");
					String[] magazineLine = sc.next().split(",");
					Magazine newMagazine = new Magazine();
					newMagazine.setIsbn(Integer.parseInt(magazineLine[0]));
					newMagazine.setTitle(magazineLine[1]);
					newMagazine.setAuthor(magazineLine[2]);
					newMagazine.setPublisher(magazineLine[3]);
					newMagazine.setPrice(Integer.parseInt(magazineLine[4]));
					newMagazine.setDesc(magazineLine[5]);
					newMagazine.setYear(Integer.parseInt(magazineLine[6]));
					newMagazine.setMonth(Integer.parseInt(magazineLine[7]));
					books[cnt++] = newMagazine;
				}
				System.out.println("등록이 완료되었습니다.");
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 숫자를 입력하세요.");
				break;
			}
			
			
		}
		
		
	}

}
