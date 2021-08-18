package a3_상수;

public class countunt {

	public static void main(String[] args) {
		/**
		 * 
		 * 상수
		 * 1. final 예약어를 자료형 앞에 사용하여야 한다.
		 * 2. 이름은 모두 대문자여야 한다.
		 * 
		 * 
		 */
		int maxNum = 100;
		final int MAX_NUM = 200;
		
		maxNum = 200;
		//MAX_NUM = 200;
		
		System.out.println("일반 변수: " + maxNum);
		System.out.println("상수: " + MAX_NUM) ;
		
		
		
	}

}
