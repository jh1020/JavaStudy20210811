package b21_예외처리;

/**
 * 
 * Exception(예외)
 * 1. 문법(소스코드) 오류 
 * 2. 컴파일 오류
 * 3. 버그
 *  
 *
 */

public class ExceptionEx {
	
	public static void main(String[] args) {
		int[] arr =new int[5];
		
		try {
			for(int i = 0; i <5; i++) {
				arr[i] = i;
				System.out.println(arr[1]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	
	
	
	}

}
