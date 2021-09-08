package b12_상속;

public class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
		
	}

	@Override
	public String toString() {
		return "Animal [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
}
