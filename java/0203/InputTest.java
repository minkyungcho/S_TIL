package com.ssafy;

import java.io.IOException;

public class InputTest {

	public static void main(String[] args) throws IOException {
		System.out.print("입력");
		int in = System.in.read(); // 아스키코드 입력
		char ch = (char)System.in.read();
		System.out.println("in="+in);
	}

}

