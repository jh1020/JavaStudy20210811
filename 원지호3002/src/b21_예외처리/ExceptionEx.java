package b21_����ó��;

/**
 * 
 * Exception(����)
 * 1. ����(�ҽ��ڵ�) ���� 
 * 2. ������ ����
 * 3. ����
 *  
 *
 */

public class ExceptionEx {
	
	public static void main(String[] args) {
		int[] arr =new int[5];
		
		try {
			for(int i = 0; i <5; i++) {
				arr[i] = i;
				System.out.println(arr[1]);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���α׷� ����");
	
	
	
	}

}
