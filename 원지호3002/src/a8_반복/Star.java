package a8_�ݺ�;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		//ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		//������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
		Scanner input = new Scanner(System.in);
				
				int x = input.nextInt();
				
				for(int i = 1; i <= x; i++) {
					for(int j = 1; j <= x-1; j++) {
						System.out.print(" ");
					}
					for (int k =0; k < i; k++) {
						System.out.print("*");
					}System.out.println();
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
	
	
}
}