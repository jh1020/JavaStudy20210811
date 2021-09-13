package b16_기본클래스;

public class Car {
	private int carNumber;
	private String model;
	
	public Car(int carNumber, String model) {
		super();
		this.carNumber = carNumber;
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public int getCarNumber() {
		return carNumber;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + carNumber;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (carNumber != other.carNumber)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}
	
	
	
	
	
	
	
	/*
	@Override
	public int hashCode() {
		
		return carNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(hashCode() == obj.hashCode()) {
			flag = true;
		}
		return flag;
	}
	*/
	
	
	
	
	
	
	
	
}
