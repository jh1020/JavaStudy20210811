package b20_�����ͺ��̽�;

import java.util.Scanner;

public class LoginTest {
	

	public static void main(String[] args) {
		LoginDaoImpl loginDao = new LoginDaoImpl();
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("======�α��� �ý���======");
			
			System.out.print("���̵�: ");
			String id = input.nextLine();
			
			System.out.print("��й�ȣ: ");
			String password = input.nextLine();
			
			int flag = loginDao.login(id, password);
			
			
			if(flag ==0) {
				System.out.println("�������� �ʴ� ���̵� �Դϴ�.");
				
			}else if(flag == 1) {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. �ٽ� �õ��ϼ���.");
			}else if(flag == 2) {
				System.out.println("�α��� ����. ȯ���մϴ�.");
			}else {
				System.out.println("������ ���̽� ����");
			}
			
		}
		
		

	}

}
