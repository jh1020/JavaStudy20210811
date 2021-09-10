package b13_다형성;

import b12_상속.Animal;


	


class Human extends Animal{
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
	
	@Override
	public void move() {
		System.out.println("사람이 뜁니다.");
	}
	
	
}

class Tiger extends Animal{
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 걷습니다.");
	}
	
	
}

class Eagle extends Animal{
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
	
	@Override
	public void move() {
		System.out.println("독수리가 날개를펴고 납니다");
	}
	
	
	
}

public class AnimalTest {
	Animal[] list = new Animal[3];
	
	public void addAnimal() {
		list[0] = new Human();
		list[1] = new Tiger();
		list[2] = new Eagle();
	}
	
	public void animalMove() {
		for(Animal ani : list) {
			ani.move();
			
		}
	}
	public void casting() {
		for(Animal ani : list) {
			if(ani == null) {
				continue;
				
			}
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
				
			}else if(ani instanceof Tiger) {
				Tiger h = (Tiger)ani;
				h.hunting();
			}else if(ani instanceof Eagle) {
				Eagle h = (Eagle)ani;
				h.flying();
			}else {
				System.out.println("지원하지 않는 자료형입니다.");
			}
			
		}
		
	}
	
	
	public static void main(String[] args) {
			AnimalTest aniTest = new AnimalTest();
			
			// 업 캐스팅
			aniTest.addAnimal();
			aniTest.animalMove();
			
			
			System.out.println("----------------------------");
			
			// 다운 캐스팅
			aniTest.casting();
				
			}
			
			
			
			
			
			
	}


