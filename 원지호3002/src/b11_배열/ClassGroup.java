package b11_¹è¿­;

public class ClassGroup {
	private int student_count = 0;
	private Student[] students;
	private Desk[] desks;
	
	
	
	public ClassGroup(int count) {
		students = new Student[count];
		desks = new Desk[count];
	}
	
	public void addStudent(String student_name) {
		desks[student_count] = new Desk(202100 + student_count,"Desker");
		students[student_count] = new Student((student_count++)+ 20210000, student_name);
		
	}
	
	public void classInfo(int student_code) {
		int student_num = 0;
		
		for(int i = 0; i < students.length; i++) {
			if(students[i].getStudent_code() == student_code) {
				student_num = i;
				break;
			}
		}
		students[student_num].showInfo();
		desks[student_num].showInfo();
	}
	
	
}
