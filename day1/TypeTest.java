package test;

public class TypeTest {

	public static void main(String[] args) {
		int k = 45;
		System.out.println(k); // ctrl+space : �ڵ��ϼ� ��� sysout
		long kk=k; 
		double d=k; // promotion (�ڵ�����ȯ : ū������<-����������, �Ǽ�������<-������)
		System.out.println(d+" "+kk);
		double dd=4.5;
		int a=(int) dd; // type casting (���������ȯ : ����������<-ū������, ����������<-�Ǽ���) �Ҽ����ϰ� �߸�.
		System.out.println(a);
	}

}
