package baekJun;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		//정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
		//이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int X = input.nextInt();
		
		for(int i = 0; i <= A; i++) {
			if(X < A) {
				
				System.out.print(X + " ");
				break;
			}
			
			
			
		}
		
		
			
		
		
		
	}

}