package b10_Ŭ����;

public class Regular {
	private boolean yearCheck;

	public boolean isYearCheck() {
		return yearCheck;
	}

	public void setYearCheck(int year, String schoolname) {
		this.yearCheck = year  > 2 && schoolname.equals("�ڸ��ƾ���Ƽ");
	}

	

}
