package b12_상속;

public class Animals {
	public static void main(String[] args) {
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		
		h.move();
		t.move();
		e.move();
		
		Animal[] a = new Animal[3];
		a[0] = new Human();
		a[1] = new Tiger();
		a[2] = new Eagle();
		
		for (Animal ani : a) {
			ani.move();
		}
	}
	
}

		class Human extends Animal{
			@Override
			public void move() {
				System.out.println("사람이 뜁니다.");
			}
			
			
		}
		
		class Tiger extends Animal{
			
			@Override
			public void move() {
				System.out.println("호랑이가 네발로 걷습니다.");
			}
			
			
		}
		
		class Eagle extends Animal{
			@Override
			public void move() {
				System.out.println("독수리가 날개를펴고 납니다");
			}
			
			
			
		}
	
	
	
	
	
	
	
	
