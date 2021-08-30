package b10_클래스;

public class GetterAndSetter {
	
	public static void main(String[] args) {
		
	
	
		Student kim = new Student();
	
		// kim.name = "원지호";
		// Setter()
	
		kim.setName("원지호");
		kim.setSchoolname("동의과학대학교");
		kim.setYear(2);
		
		System.out.println(kim.getName());
		System.out.println(kim.getSchoolname());
		System.out.println(kim.getYear());
	
	
	}
	
} 
