package b10_클래스;

public class StudentTest {

	public static void main(String[] args) {
		
		
		Student kim = new Student(); //생성자 -> 클래스명과 같다. 
		
		kim.name = "김재성";
		
		kim.showInfo();
		
		Student lee = new Student();
		
		lee.name = "이효원";
		
		lee.showInfo();
		
	}

}
