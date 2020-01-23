package day2;

public class ArrayTest1 {

	public static void main(String[] args) {
		int[] ar = new int[5];
		ar[0] = 11;
		ar[1] = 23;
		ar[2] = 43;
		ar[3] = 28;
		ar[4] = 37;
		int sum = 0;
		for(int i=0; i<ar.length; i++) {
			sum += ar[i];
		}
		System.out.println("합계 : "+sum);
		
		int tot = 0;
		for (int a : ar) {
			tot += a;
		}
		System.out.println("합계 : "+tot);

	}

}
