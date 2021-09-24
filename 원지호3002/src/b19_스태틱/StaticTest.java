package b19_½ºÅÂÆ½;

public class StaticTest {
	public static void main(String[] args) {
		Connector.connect();
		
		
		Student s1 = new Student("±èÁØÀÏ");
		Student s2 = new Student("Á¤»ó¿ì");
		Student s3 = new Student("±èÇö¾Æ");
		Student s4 = new Student("±èÀ±ÇÏ");
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		
	}
}
