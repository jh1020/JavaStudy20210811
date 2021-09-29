package b21_����ó��;

import java.time.DateTimeException;

/**
 * 
 * Exception(����)
 * 1. ����(�ҽ��ڵ�) ���� 
 * 2. ������ ����
 * 3. ����
 *  
 * throw(ȣ���� ��ġ�� ���� �̷��)
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
			System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		
		} catch (SecurityException e) {
			System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		
		} catch (DateTimeException e) {
			System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����");
	
	
	
	}

}
