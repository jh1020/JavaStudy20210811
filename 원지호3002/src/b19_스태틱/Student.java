package b19_스태틱;

public class Student {
	private  static int studnet_static_code = 20210001;
	private int student_code;
	private String name;
	
	public  Student(String name) {
		student_code = studnet_static_code++;
		this.name = name;
	}
	public void showInfo() {
		System.out.println("학번: " + student_code);
		System.out.println("이름: " + name);
		System.out.println();
	}
}
