package b14_추상클래스;

abstract class AbstractEx3Exten extends AbstractEx {
	

}

class AbstractEx2Exten extends AbstractEx {
	@Override
	public void PrintName() {
		System.out.println("김 준 일");
		
	}
}


public class AbstractExExten extends AbstractEx{
	@Override
	public void PrintName() {
		System.out.println("김 준일");
		
		
	}
}
