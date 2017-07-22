package core.inheritance.constructors;

public class CargoFlight extends Flight {

	float maxCargoSpace = 1000.0f;

	// constructors
	public CargoFlight(int flightNumber) {
		super(flightNumber); // calls the Flight's constructor which takes (int flightNumber)
	}

	public CargoFlight(int flightNumber, float maxCargoSpace) {

		this(flightNumber);
		this.maxCargoSpace = maxCargoSpace;
	}

	public CargoFlight() {
	}

	public CargoFlight(float maxCargoSpace) {
		this.maxCargoSpace = maxCargoSpace;
	}

}
