package prototypeImplementation;

public abstract class Vehicle {
	public String getBrand() {
		return brand;
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}

	private String brand;
	private String model;
	private String color;
	
	
	
	public Vehicle(String brand, String model, String color) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
	}

	protected Vehicle(Vehicle vehicle) {
		this.brand = vehicle.brand;
		this.model = vehicle.model;
		this.color = vehicle.color;
	}
	
	public abstract Vehicle clone();
}
