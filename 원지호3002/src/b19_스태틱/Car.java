package b19_스태틱;

public class Car {
	private int serialNum;
	private String model;
	
	public Car(int serialNum, String model) {
		this.serialNum = serialNum;
		this.serialNum = model;
	}
	
	public void carInfo() {
		System.out.println("차량 시리얼 번호: " + serialNum);
		System.out.println("차량 모델: " + model);
	}
}
