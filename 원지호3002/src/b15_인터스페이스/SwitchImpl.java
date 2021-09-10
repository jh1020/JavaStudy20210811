package b15_인터스페이스;

public class SwitchImpl implements Switch{
	@Override
	public void off() {
		System.out.println("전원을 켭니다.");
		
	}
	@Override
		public void on() {
		System.out.println("전원을 끕니다.");
			
	}
}
