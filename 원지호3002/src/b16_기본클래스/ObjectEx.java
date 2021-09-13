package b16_기본클래스;

public class ObjectEx {
	private String className = "ObjectEx";
	
	
	@Override
	public String toString() {
		
		return className;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	public static void main(String[] args) {
		Object obj = new Object();
		
		
		System.out.println(obj.toString());
		
		ObjectEx oex = new ObjectEx();
		ObjectEx oex2 = new ObjectEx();
		System.out.println(oex);
		
		String str1 = "원지호";
		String str2 = "원지호";
		String str3 = new String("원지호");
		
		/*
		String[] toStringArray = new String[10];
		
		for(int i = 0; i < toStringArray.length; i++) {
			Student s1 = new Student("김준일", "코리아아이티아카데미", 1, 1, 1,
					20210001, "부산 동래구", "010-9988-1916");
			toStringArray[i] = s1.toString();
		}
		/*
		
		for (String s : toStringArray) {
			Student s1 = new Student("김준일", "코리아아이티아카데미", 1, 1, 1,
					20210001, "부산 동래구", "010-9988-1916");
			s = s1.toString();
		}
		
		
		for(String s : toStringArray) {
			System.out.println(s);
		}
		*/
		
		
		System.out.println(oex.equals(oex2));
		
		System.out.println(str1 + str2 + str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str3));
		System.out.println(str1 == str3);
		
		Student s1 = new Student("김준일", "코리아아이티아카데미", 1, 1, 1,
				20210001, "부산 동래구", "010-9988-1916");
		Student s2 = new Student("김준일", "코리아아이티아카데미", 1, 1, 1,
				20210001, "부산 동래구", "010-9988-1916");
		
		System.out.println(s1.equals(s2));
	
	}
	
}
