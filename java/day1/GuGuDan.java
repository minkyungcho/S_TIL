package test;

public class GuGuDan {

	public static void main(String[] args) {
		// 2~9단까지 구구단을 출력하세요		
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.println(i+" X "+j+" = "+i*j);
			}
			System.out.println();
		}
	}
}
