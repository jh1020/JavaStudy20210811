package b11_�迭;

public class School {
	public static void main(String[] args) {
		ClassGroup[] cg = new ClassGroup[3];
		cg[0] = new ClassGroup(10);	
		cg[1] = new ClassGroup(15);
		cg[2] = new ClassGroup(30);
		
		
		cg[0].addStudent("������");
		cg[0].addStudent("��ȿ��");
		cg[0].addStudent("���缺");
		cg[0].addStudent("������");
		cg[0].addStudent("��ȣ��");
		
		cg[1].addStudent("����ȣ");
		cg[1].addStudent("����");
		cg[1].addStudent("���α�");
		cg[1].addStudent("������");
		
		cg[1].classInfo(20210003);
		
	}
}
