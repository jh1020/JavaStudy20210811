package b19_½ºÅÂÆ½;

public class SingleTon {
	public static void main(String[] args) {
		KIA factory1 = KIA.getInstnce();
		KIA factory2 = KIA.getInstnce();
		KIA factory3 = KIA.getInstnce();
		KIA factory4 = KIA.getInstnce();
		KIA factory5 = KIA.getInstnce();
		KIA factory6 = KIA.getInstnce();
		
		Car k3 = factory1.createCar("k3");
		Car k5 = factory2.createCar("k5");
		Car k7 = factory3.createCar("k7");
		Car k8 = factory4.createCar("k8");
		Car ev6 = factory5.createCar("ev6");
		
		k3.carInfo();
		k5.carInfo();
		k7.carInfo();
		k8.carInfo();
		ev6.carInfo();
		
		
		
		
	}
	
}
