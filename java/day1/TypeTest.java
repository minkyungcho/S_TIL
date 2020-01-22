package test;

public class TypeTest {

	public static void main(String[] args) {
		int k = 45;
		System.out.println(k); // ctrl+space : 자동완성 기능 sysout
		long kk=k; 
		double d=k; // promotion (자동형변환 : 큰사이즈<-작은사이즈, 실수형변수<-정수값)
		System.out.println(d+" "+kk);
		double dd=4.5;
		int a=(int) dd; // type casting (명시적형변환 : 작은사이즈<-큰사이즈, 정수형변수<-실수값) 소수이하가 잘림.
		System.out.println(a);
	}

}
