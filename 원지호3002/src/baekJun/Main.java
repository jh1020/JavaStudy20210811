package baekJun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		
		for(int i = 0; i < x; i--) {
			int i2 = i + 1;
			
			for(int j = 0; j < i2; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			
		}
		
		
			
		
		
		
	}

}