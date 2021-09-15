package b18_컬렉션;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ArrayListTest {
	public static void main(String[] args) {
		
		List<String> arrayList = new ArrayList<String>(); //업캐스팅
		//arrayList = new LinkedList<String>();
		//arrayList = new Vector<String>();
		//arrayList = new Stack<String>();
		
		arrayList.add("java");
		arrayList.add("c");
		arrayList.add("python");
		
		System.out.println(arrayList.get(1));
		
		for ( int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		for(String str : arrayList)
			System.out.println(str);
		
		System.out.println(arrayList.remove(0));
		
		System.out.println(arrayList);
		
		
		
	}
}
