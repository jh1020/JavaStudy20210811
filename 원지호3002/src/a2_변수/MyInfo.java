package a2_변수;

public class MyInfo {

	public static void main(String[] args) {
		/** <자료형>
		* 논리형(boolean) = true, false
		* boolean 변수명 = true;
		* boolean 변수명 = false;
		* 
		* 
		* 문자형(char) 캐릭터 = a~z, 한글(1글자만)
		* char 변수명 = 'a';
		* char 변수명 = '가';
		* char 변수명 = '1';
		* char 변수명 = '$';
		* 
		* 문자열자료형(String) 스트링 = "문자열을 저장할 수 있습니다."
		* String 변수명 = "안녕하세요. 원지호입니다.";
		* 
		* 정수형(int) Integer = 0 ~ 10 십진수를 표현
		* int 변수명 = 100;
		* 
		* 실수형(double) = 0.0 ~ 0.9999 실수단위(소숫점) 표현
		* double 변수명 = 100.08776;
		*/
		
		// 정수형으로 생년월일 중 년도를 저장하는 year변수
		// 정수형으로 월을 저장하는 month 변수
		// 정수형으로 일을 저장하는 day 변수
		
		// 이름을 문자형으로 표현 변수명은 f, s, th
		// 시력 left, right 각각 실수형으로 변수 저장
		// 성별 논리형 maleFemale변수명 남 true, 여 false;
		
		// 생년월일: 0000년 00월 00일
		// 이름: 원지호
		// 시력(R): 0.5
		// 시력(L): 0.7
		// 성별: true
		
		int year = 2000 ;
		int month = 10 ;
		int day = 20 ;
		
		char f = '원';
		char s = '지';
		char th = '호' ;
		String name = "원지호";
		
		double left = 0.5;
		double right = 0.7;
		boolean maleFemale = true ;
		
		System.out.print("생년월일: ");
		System.out.print(year);
		System.out.print("년 ");
		System.out.print(month);
		System.out.print("월 ");
		System.out.print(day);
		System.out.println("일");
		
		System.out.print("이름: ");
		System.out.print(f);
		System.out.print(s);
		System.out.println(th);
		
		System.out.print("이름: ");
		System.out.println(name);
		
		System.out.print("시력(R) :");
		System.out.println(right);
		System.out.print("시력(L) :");
		System.out.println(left);
		
		System.out.print("성별: ");
		System.out.print(maleFemale);
		
		
		
		
		
		
		
	}

}
