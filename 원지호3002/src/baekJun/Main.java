package baekJun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//���� ���, ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�. �� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.
//
	//	���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int number2 = input.nextInt();
		
		if (number > 0 && number2 > 0) {
			System.out.println("1");
		}else if (number > 0 && number2 < 0) {
			System.out.println("4");
		}else if (number < 0 && number2 > 0) {
			System.out.println("2");
		}else
			System.out.println("3");
		
			
		
		
		
	}

}
