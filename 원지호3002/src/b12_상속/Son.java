package b12_���;

public class Son extends Father{
	
	private int Bitcoin;
	
	public Son() {
		super("��", 10000, "����Ÿ��");//new Father();
		System.out.println(super.toString());
		System.out.println("�Ƶ� ����");
		
		
	}
	@Override //������̼�
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
