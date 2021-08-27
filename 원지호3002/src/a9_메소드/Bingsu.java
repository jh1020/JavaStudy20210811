package a9_메소드;

public class Bingsu {
	
	String toMake(String material, int materialCount, String material2) {
		String bingsu = material + materialCount + "개와 " + material2 + "가 들어간 빙수";
		return bingsu;
	}
	
	void voidTest() {
		System.out.println("보이드 테스트 메소드");
	}

	public static void main(String[] args) {
		Bingsu b = new Bingsu();
		
		String material = "딸기";
		
		String bingsu1 = b.toMake(material, 10, "연유");
		String bingsu2 = b.toMake("청포도", 10, "연유");
		String bingsu3 = b.toMake("망고", 10, "연유");
		String bingsu4 = b.toMake("초코", 10, "연유");
		
		System.out.println(bingsu1);
		System.out.println(bingsu2);
		System.out.println(bingsu3);
		System.out.println(bingsu4);
		
		b.voidTest();

	}

}