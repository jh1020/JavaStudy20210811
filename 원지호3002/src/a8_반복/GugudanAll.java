package a8_반복;

import java.util.Scanner;

public class GugudanAll {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("시작 단수: ");
		int A = input.nextInt();
		System.out.print("마지막 단수: ");
		int B = input.nextInt();
		
		for(int i = A-1;i < B; i++) {
			int i2 = i + 1;
			System.out.println(i2+"단");
			for(int j = 0; j < 9;j++) {
				int j2 = j + 1;
				System.out.println(i2+ " X "+j2+" = "+(i2*j2));
			}
		}

		//while(true) {
			//System.out.println("while문");
		//}
		//for(;true;) {
		//	System.out.println("for문");
		//}
		
	}

}
