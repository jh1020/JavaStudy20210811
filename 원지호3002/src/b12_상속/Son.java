package b12_상속;

public class Son extends Father{
	
	private int Bitcoin;
	
	public Son() {
		super("김", 10000, "삼정타워");//new Father();
		System.out.println(super.toString());
		System.out.println("아들 생성");
		
		
	}
	@Override //어노테이션
	public String getLastName() {
		// TODO Auto-generated method stub
		return super.getLastName();
	}
	
	
	
	public void setMoney(int money) {
		super.setMoney(((int)(money* 1.1)));
	}
	
	public int getBitcoin() {
		return Bitcoin;
	}
	public void setBitcoin(int bitcoin) {
		Bitcoin = bitcoin;
	}
	
	
}
