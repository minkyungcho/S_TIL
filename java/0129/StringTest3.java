package com.ssafy.day4;

public class StringTest3 {

	public static void main(String[] args) {
		
		String s = "hello";
		String s2 = s+"a"; // stringbuilder�� �����ȴ�
		String ss = s.concat("a");
		System.out.println(s); // hello 
		System.out.println(ss); // helloa 
		if(s==s2) {
			System.out.println(true);
		}
		
		StringBuilder sb = new StringBuilder("Hello"); // new �� ������ ����Ѵ�.
		sb.append("a"); // ��ü�� ���� ������ �ʰ� �ڱ��ڽ����� ����
		System.out.println(sb);
//		sb.insert(offset, b); // offset ��ġ�� �����ϱ�
//		sb.indexOf(str);
		sb.length();
		sb.reverse();
//		sb.setCharAt(index, ch); // �� ��ġ�� ���� �־��
//		sb.setLength(newLength); // ���� ���� �����ϱ�.
		
	}

}
