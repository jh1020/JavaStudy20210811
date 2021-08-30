package b10_클래스;

public class Student {

	private String name;
	private String schoolname;
	private int year; //학년
	
	public Student() {// 기본 생성자
				
	}
	
	public void setName(String name) {
		this.name = name + "학생";
				
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
		super(); // 상속관계
		this.name = name + "학생";
		this.year = year;
		this.showInfo();
	}
	public Student(String name, String schoolname, int year) {
		super(); // 상속관계
		this.name = name + "학생";
		this.year = year;
		this.schoolname = schoolname;
		this.showInfo();
	}
	
	
	public void getFreebies() {
		Regular regular = new Regular();
		
		regular.setYearCheck(setYearCheck);

	
		if(regular.isYearCheck()) {
			System.out.println("사은품 대상자");
		}else {
			System.out.println("대상자 제외");
		}
	}
	
	
	
	
	
	public void showInfo() {
		System.out.println("학생 정보");
		System.out.println("이름: "+ name);
		System.out.println("학교: "+ schoolname);
		System.out.println("학년: "+ "year");
	}

	

}
