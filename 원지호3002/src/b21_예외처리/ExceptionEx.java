package b21_예외처리;

import java.time.DateTimeException;

/**
 * 
 * Exception(예외)
 * 1. 문법(소스코드) 오류 
 * 2. 컴파일 오류
 * 3. 버그
 *  
 * throw(호출한 위치로 예외 미루기)
 **/

public class ExceptionEx {
	public static void arrText() throws ArrayIndexOutOfBoundsException {
		int[] arr =new int[5];
		
		for(int i = 0; i <5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		try {
			ExceptionEx.arrText();
			
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 초과하여 대입하였습니다.");
		
		} catch (SecurityException e) {
			System.out.println("배열의 크기를 초과하여 대입하였습니다.");
		
		} catch (DateTimeException e) {
			System.out.println("배열의 크기를 초과하여 대입하였습니다.");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	
	
	
	}

}
