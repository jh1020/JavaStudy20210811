package b10_Ŭ����;

public class Student {

	private String name;
	private String schoolname;
	private int year; //�г�
	
	public Student() {// �⺻ ������
				
	}
	
	public void setName(String name) {
		this.name = name + "�л�";
				
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getSchoolname() {
		return schoolname;
	}

	public void setSchoolname(String schoolname) {
		this.schoolname = schoolname;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Student(String name, int year) {
		super(); // ��Ӱ���
		this.name = name + "�л�";
		this.year = year;
		this.showInfo();
	}
	public Student(String name, String schoolname, int year) {
		super(); // ��Ӱ���
		this.name = name + "�л�";
		this.year = year;
		this.schoolname = schoolname;
		this.showInfo();
	}
	
	
	public void getFreebies() {
		Regular regular = new Regular();
		
		regular.setYearCheck(setYearCheck);

	
		if(regular.isYearCheck()) {
			System.out.println("����ǰ �����");
		}else {
			System.out.println("����� ����");
		}
	}
	
	
	
	
	
	public void showInfo() {
		System.out.println("�л� ����");
		System.out.println("�̸�: "+ name);
		System.out.println("�б�: "+ schoolname);
		System.out.println("�г�: "+ "year");
	}

	

}
