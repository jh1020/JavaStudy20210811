package a8_�ݺ�;

import java.util.Scanner;

public class GugudanAll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("���� �ܼ�: ");
		int A = input.nextInt();
		System.out.print("������ �ܼ�: ");
		int B = input.nextInt();
		
		for(int i = A-1;i < B; i++) {
			int i2 = i + 1;
			System.out.println(i2+"��");
			for(int j = 0; j < 9;j++) {
				int j2 = j + 1;
				System.out.println(i2+ " X "+j2+" = "+(i2*j2));
			}
		}

		//while(true) {
			//System.out.println("while��");
		//}
		//for(;true;) {
		//	System.out.println("for��");
		//}
		
	}

}
