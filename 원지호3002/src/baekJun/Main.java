package baekJun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 
		//89���� B, 70 ~ 79���� C, 60 ~ 69���� D,
		//������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

		Scanner input = new Scanner(System.in);
		int Score = input.nextInt();
		if (Score >= 90) {
			System.out.println("A");
		}else if (Score >= 80){
			System.out.println("B");
		}else if (Score >= 70){
			System.out.println("C");
		}else if (Score >= 60){
			System.out.println("D");
		}else 
			System.out.println("F");
		
			
		
		
		
	}

}
