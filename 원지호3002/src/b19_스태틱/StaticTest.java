package b19_����ƽ;

public class StaticTest {
	public static void main(String[] args) {
		Connector.connect();
		
		
		Student s1 = new Student("������");
		Student s2 = new Student("�����");
		Student s3 = new Student("������");
		Student s4 = new Student("������");
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		
	}
}
