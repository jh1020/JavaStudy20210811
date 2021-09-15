package b18_ÄÃ·º¼Ç;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class StudentSet {
	public static void main(String[] args) {
		Set<Student> sSet = new HashSet<Student>();
		
		sSet.add(new Student("±èÁØÀÏ", 202101));
		sSet.add(new Student("±èÁØÀÏ1", 202102));
		sSet.add(new Student("±èÁØÀÏ2", 202103));
		
		Iterator ir = sSet.iterator();
		
		while(ir.hasNext()) {
			System.out.println(ir.next());
		}
		
		
	}
}
