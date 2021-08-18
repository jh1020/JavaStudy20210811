package a4_형변환;

public class Conversionstring {

	public static void main(String[] args) {
		// 문자열 (String)의 형변환
		int num = 10;
		int num2 = 10;
		String sNum = "10";
		
		System.out.println(num + num2+ sNum);
		// num + num2가 먼저 연산되어 20이나오고
		// 문자열타입인 sNum과 더할때 num + num2 은 문자열이므로 
		// 2010이 나온다.
		
		
		//문자열 -> 다른 자료형(boolean, int, double)
		// int(정수): Integer.parsInt(문자열);
		int i = Integer.parseInt("10");
		double d = (int)Double.parseDouble("10.1");
		boolean b = Boolean.parseBoolean("true");
		
		
		//다른 자료형 -> 문자열
		// int(정수): Integer.toString
		Integer.toString(10);
		Double.toString(10.2);
		Boolean.toString(false);
		
		
		
		
		
		
	}

}
