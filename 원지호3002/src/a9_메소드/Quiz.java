package a9_�޼ҵ�;

import java.util.Scanner;

public class Quiz {
	
	public void quiz1(int starCount) {
		for(int i = 0; i<5;i++) {
			for(int j = 0; j < i +1; j++) {
		}System.out.println(" ");
	}for(int j = 5; )
		
	}
	
	public void procStart(String selector, int starCount) {
		if(selector.equals("1")) {
			
	}else if(selector.equals("2")) {
		
	}else if(selector.equals("3")) {
		
	}else if(selector.equals("4")) {
		
	}else {
		
	}
	
	public void mainMenuPrint() {
		System.out.println("[����� ���α׷�]");
		System.out.println("1. ����1");
		System.out.println("2. ����2");
		System.out.println("3. ����3");
		System.out.println("4. ����4");
		System.out.println("5. ����5");
		System.out.println("q. ���α׷� ����");
	}
	
	public static void main(String[] args) {
		Quiz m = new Quiz();
		Scanner in = new Scanner(System.in);
		boolean loopFlag = true;
		
		while(loopFlag) {
		m.mainMenuPrint();
		System.out.print("����� �Է��ϼ���: ");
		String selector = in.nextLine();
		
	
		if(selector.equals("1") || selector.equals("2") || selector.equals("3")
				|| selector.equals("4")|| selector.equals("5")) {
			System.out.print("����� ���� ������ �Է��ϼ���: ");
			int starCount = in.nextInt();
			in.nextLine();
			
		}else if(selector.equals("q") || selector.equals("��")) {
			System.out.println("���α׷� ������...");
			loopFlag = false;
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}System.out.println();
	
	
	
	
	
	
	
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	}
}
