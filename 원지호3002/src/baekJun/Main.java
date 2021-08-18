package baekJun;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 
		//89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D,
		//나머지 점수는 F를 출력하는 프로그램을 작성하시오.

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
