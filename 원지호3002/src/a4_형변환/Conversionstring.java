package a4_����ȯ;

public class Conversionstring {

	public static void main(String[] args) {
		// ���ڿ� (String)�� ����ȯ
		int num = 10;
		int num2 = 10;
		String sNum = "10";
		
		System.out.println(num + num2+ sNum);
		// num + num2�� ���� ����Ǿ� 20�̳�����
		// ���ڿ�Ÿ���� sNum�� ���Ҷ� num + num2 �� ���ڿ��̹Ƿ� 
		// 2010�� ���´�.
		
		
		//���ڿ� -> �ٸ� �ڷ���(boolean, int, double)
		// int(����): Integer.parsInt(���ڿ�);
		int i = Integer.parseInt("10");
		double d = (int)Double.parseDouble("10.1");
		boolean b = Boolean.parseBoolean("true");
		
		
		//�ٸ� �ڷ��� -> ���ڿ�
		// int(����): Integer.toString
		Integer.toString(10);
		Double.toString(10.2);
		Boolean.toString(false);
		
		
		
		
		
		
	}

}
