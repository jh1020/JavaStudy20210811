package a7_����;

import java.util.Scanner;

public class Quiz2753 {

	public static void main(String[] args) {
		// �ش�⵵ 4�� ����̰� 100�� ����¾ƴϰų� 400�ǹ��
		Scanner input = new Scanner(System.in);
			int year = input.nextInt();
			
			int result;
			
			if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
				result = 1;
				System.out.println("�����Դϴ�.");
				
			}else {
				result = 0 ;
				System.out.println("������ �ƴմϴ�.");
		}

	}

}
