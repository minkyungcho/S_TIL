package com.ssafy;

public class MethodTest {

	public static void main(String[] args) {
		work(5);
		work('A'); // 65�ð� ���ϴ� �ɷ� ����Ʈ�ȴ�. ������ ����ȯ!
		work(0);
		int result = work(5, 30);
		work(3, 40);
	}
	/**
	 * Overloading
	 * �ϴ� �۾��� ����ϴٸ� �޼����� �̸��� �����ϰ�
	 * �Ķ���͸� �ٸ��� �༭ �ĺ��Ͽ� �����ϴ� ���
	 * ������, return type�� ����� ����.
	 */
	public static void work(int time) {
		if(time<=0) return; // �ð��� 0���ϸ� �ٽ� �ǵ��ư�
		
		System.out.println("������ ���ϴ� ��...."+time);
//		return time; // char���� �͵� ����ȯ �����ϴ�. ������ ����ȯ
	}

	public static int work(int time, int min) {
		if(time<=0) return time; // �ð��� 0���ϸ� �ٽ� �ǵ��ư�
		
		System.out.println("������ ���ϴ� ��...."+time);
		return time;
	}
	
}
