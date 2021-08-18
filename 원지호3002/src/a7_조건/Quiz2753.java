package a7_조건;

import java.util.Scanner;

public class Quiz2753 {

	public static void main(String[] args) {
		// 해당년도 4의 배수이고 100의 배수는아니거나 400의배수
		Scanner input = new Scanner(System.in);
			int year = input.nextInt();
			
			int result;
			
			if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
				result = 1;
				System.out.println("윤년입니다.");
				
			}else {
				result = 0 ;
				System.out.println("윤년이 아닙니다.");
		}

	}

}
