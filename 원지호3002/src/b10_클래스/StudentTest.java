package b10_Ŭ����;

public class StudentTest {

	public static void main(String[] args) {
		
		Student one = new Student("����ȣ", 4);
		Student kim = new Student("������", 2); 
		Student lee = new Student("������", "�ڸ��ƾ���Ƽ", 3);
		//kim.name = "������";//	.�� �ش� �޸� �ּҰ��� �����Ѵٶ�� �Ѵ�.
		//one.name = "?";
		
		one.showInfo();
		
		
		Integer i = new Integer(100);
		
		System.out.println(one.hashCode());
		System.out.println(i.hashCode());
		
		if(kim.getYear()  > 2) {
			System.out.println("����ǰ �����");
		}else {
			System.out.println("����� ����");
		}
		
		
		kim.getFreebies();
		one.getFreebies();
		
		
	}

}
