package a2_����;

public class MyInfo {

	public static void main(String[] args) {
		/** <�ڷ���>
		* ����(boolean) = true, false
		* boolean ������ = true;
		* boolean ������ = false;
		* 
		* 
		* ������(char) ĳ���� = a~z, �ѱ�(1���ڸ�)
		* char ������ = 'a';
		* char ������ = '��';
		* char ������ = '1';
		* char ������ = '$';
		* 
		* ���ڿ��ڷ���(String) ��Ʈ�� = "���ڿ��� ������ �� �ֽ��ϴ�."
		* String ������ = "�ȳ��ϼ���. ����ȣ�Դϴ�.";
		* 
		* ������(int) Integer = 0 ~ 10 �������� ǥ��
		* int ������ = 100;
		* 
		* �Ǽ���(double) = 0.0 ~ 0.9999 �Ǽ�����(�Ҽ���) ǥ��
		* double ������ = 100.08776;
		*/
		
		// ���������� ������� �� �⵵�� �����ϴ� year����
		// ���������� ���� �����ϴ� month ����
		// ���������� ���� �����ϴ� day ����
		
		// �̸��� ���������� ǥ�� �������� f, s, th
		// �÷� left, right ���� �Ǽ������� ���� ����
		// ���� ���� maleFemale������ �� true, �� false;
		
		// �������: 0000�� 00�� 00��
		// �̸�: ����ȣ
		// �÷�(R): 0.5
		// �÷�(L): 0.7
		// ����: true
		
		int year = 2000 ;
		int month = 10 ;
		int day = 20 ;
		
		char f = '��';
		char s = '��';
		char th = 'ȣ' ;
		String name = "����ȣ";
		
		double left = 0.5;
		double right = 0.7;
		boolean maleFemale = true ;
		
		System.out.print("�������: ");
		System.out.print(year);
		System.out.print("�� ");
		System.out.print(month);
		System.out.print("�� ");
		System.out.print(day);
		System.out.println("��");
		
		System.out.print("�̸�: ");
		System.out.print(f);
		System.out.print(s);
		System.out.println(th);
		
		System.out.print("�̸�: ");
		System.out.println(name);
		
		System.out.print("�÷�(R) :");
		System.out.println(right);
		System.out.print("�÷�(L) :");
		System.out.println(left);
		
		System.out.print("����: ");
		System.out.print(maleFemale);
		
		
		
		
		
		
		
	}

}
