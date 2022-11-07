package prototypeImplementation;

public class Car extends Vehicle{
	
	public int getPeopleInside() {
		return peopleInside;
	}

	public void setPeopleInside(int peopleInside) {
		this.peopleInside = peopleInside;
	}

	private int peopleInside;
	
	public Car(String brand, String model, String color, int peopleInside) {
		super(brand, model, color);
		this.peopleInside = peopleInside;
	}

	protected Car(Car car) {
		super(car);
		this.peopleInside = car.peopleInside;
	}

	@Override
	public Vehicle clone() {
		return new Car(this);
	}

	
	

}
