package prototypeImplementation;

public class Truck extends Vehicle{
	
	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	private int mass;
	
	

	public Truck(String brand, String model, String color, int mass) {
		super(brand, model, color);
		this.mass = mass;
	}

	protected Truck(Truck truck) {
		super(truck);
		this.mass = truck.mass; 
	}

	@Override
	public Vehicle clone() {
		return new Truck(this);
	}

}
