package b10_Ŭ����;

/**
 * 
 * 
 *  �ڷ����� ����
 *  1. �Ϲ� �ڷ���(int, double, char, boolean)
 * 	2. ���� �ڷ���(Ŭ����, �迭) -> String, Phone, Student, Car, �迭[]
 *  
 * 
 */
class Phone {
	private String company;
	private String model;
	private String color;
	private String newsAgency;
	private int d_ram;
	private String phoneCase;	

	public Phone() {
		System.out.println("���ο� Phone�� �����Ͽ����ϴ�.");
	}
	
	public Phone(String company) {
		System.out.println("�ι�° �����ڷ� ���� Phone");
		this.company = company;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
}




public class Class_EX {
	public static void main(String[] args) {
		
		System.out.println(new Phone("Apple"));
		Phone p = new Phone();
		Phone p2 = new Phone();
		
		//p.model = "iphone";
		//p2.model = "galaxy";
		
		p.setModel("iphone"); // ���� ����(����)�ϴ� ���̱� ������ ���ϰ��� ����. 
		
		p.getModel(); // �ܼ��� Ŭ���� ������ ���� ���� �������� ���� ���̱� ������ ���ϰ��� ������ 
					  //�Ű������� ����.
		
		
		p2.setModel("galaxy");
		
		p2.getModel();
		
	}
}
