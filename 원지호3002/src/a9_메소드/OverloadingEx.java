package a9_메소드;

import java.util.Stack;

public class OverloadingEx {
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int add(String num1, int num2) {
		int result = Integer.parseInt(num1) + num2;
		return result;
	}
	public int add(int num1) {
		int result = num1 + num1;
		return result;
	}
	
	public int mul(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		return result;
		
	}public double mul(int num1, int num2) {
		int result = num1 * (int)num2 ;
		return result;
	}
	
	
	public void mainMethod() {
		int numberSum = add(20, 20);
		int numberMul = mul(2, 10);
		System.out.println("두 수의 합은? "+ numberSum);
		System.out.println("두 수의 곱은? "+ numberMul);
	
	
	
	
	
	}
	
	
	public static void main(String[] args) {
	OverloadingEx main = new OverloadingEx();
	main.mainMethod();
	
	
	
	
	
	
	}
}
