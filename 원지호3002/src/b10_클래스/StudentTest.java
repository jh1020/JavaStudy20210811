package b10_클래스;

public class StudentTest {

	public static void main(String[] args) {
		
		Student one = new Student("원지호", 4);
		Student kim = new Student("김준일", 2); 
		Student lee = new Student("이지원", "코리아아이티", 3);
		//kim.name = "김준일";//	.은 해당 메모리 주소값을 참조한다라고 한다.
		//one.name = "?";
		
		one.showInfo();
		
		
		Integer i = new Integer(100);
		
		System.out.println(one.hashCode());
		System.out.println(i.hashCode());
		
		if(kim.getYear()  > 2) {
			System.out.println("사은품 대상자");
		}else {
			System.out.println("대상자 제외");
		}
		
		
		kim.getFreebies();
		one.getFreebies();
		
		
	}

}
