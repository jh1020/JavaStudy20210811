package b10_클래스;

public class Regular {
	private boolean yearCheck;

	public boolean isYearCheck() {
		return yearCheck;
	}

	public void setYearCheck(int year, String schoolname) {
		this.yearCheck = year  > 2 && schoolname.equals("코리아아이티");
	}

	

}
