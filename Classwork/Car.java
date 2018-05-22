// Julio Collado
// pg 396 car class

public class Car {
	// fields
	private int yearModel;
	private String make;
	private int speed;

	// Constructors

	public Car () {
		yearModel = 0;
		make = "";
		speed = 0;
	}

	public Car (int year, String mk) {
		yearModel = year;
		make = mk;
		speed = 0;
	}

	// Accessors

	public int getYearModel() {
		return yearModel;
	}
	public String getMake() {
		return make;
	}
	public int getSpeed() {
		return speed;
	}

	// mutators

	public void accelerate() {
		speed += 5;
		
		return;
	}

	public void breakSpeed() {
		speed -= 5;

		return;
	}
}