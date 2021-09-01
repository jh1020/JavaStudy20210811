package b11_배열;

public class School {
	public static void main(String[] args) {
		ClassGroup[] cg = new ClassGroup[3];
		cg[0] = new ClassGroup(10);	
		cg[1] = new ClassGroup(15);
		cg[2] = new ClassGroup(30);
		
		
		cg[0].addStudent("김준일");
		cg[0].addStudent("이효원");
		cg[0].addStudent("김재성");
		cg[0].addStudent("서보경");
		cg[0].addStudent("박호훈");
		
		cg[1].addStudent("원지호");
		cg[1].addStudent("김상언");
		cg[1].addStudent("동민규");
		cg[1].addStudent("김형민");
		
		cg[1].classInfo(20210003);
		
	}
}
