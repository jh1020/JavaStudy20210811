package a9_메소드;

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
		System.out.println("[별찍기 프로그램]");
		System.out.println("1. 문제1");
		System.out.println("2. 문제2");
		System.out.println("3. 문제3");
		System.out.println("4. 문제4");
		System.out.println("5. 문제5");
		System.out.println("q. 프로그램 종료");
	}
	
	public static void main(String[] args) {
		Quiz m = new Quiz();
		Scanner in = new Scanner(System.in);
		boolean loopFlag = true;
		
		while(loopFlag) {
		m.mainMenuPrint();
		System.out.print("명령을 입력하세요: ");
		String selector = in.nextLine();
		
	
		if(selector.equals("1") || selector.equals("2") || selector.equals("3")
				|| selector.equals("4")|| selector.equals("5")) {
			System.out.print("출력할 별의 개수를 입력하세요: ");
			int starCount = in.nextInt();
			in.nextLine();
			
		}else if(selector.equals("q") || selector.equals("ㅂ")) {
			System.out.println("프로그램 종료중...");
			loopFlag = false;
		}else {
			System.out.println("잘못된 입력입니다.");
		}System.out.println();
	
	
	
	
	
	
	
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
