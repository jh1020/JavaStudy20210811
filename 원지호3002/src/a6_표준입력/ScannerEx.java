package a6_ǥ���Է�;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// String �⺻���� Ŭ����
		// Scanner �ܺ� Ŭ����
		
		// �ڵ� import
		// Ctrl + spacebar -> �ϳ��� Ŭ���� import
		// Ctrl + Shift  + O -> ���Ŭ���� import
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("���� 2���� �Է��� �ּ���.");
		System.out.print("ù��° ��: ");
		String str = input.nextLine();
		
		System.out.print("�ι�° ��: ");
		String str2 = input.nextLine();
		
		System.out.print("���: ");
		System.out.println(Integer.parseInt(str) + Integer.parseInt(str2));
		

		
		
		
		

	}

}
