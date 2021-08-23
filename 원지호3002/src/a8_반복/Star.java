package a8_반복;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
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