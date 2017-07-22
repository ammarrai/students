package core.stringclass.tostring;

public class Flight {

	// iv
	int flightNumber;
	char flightClass;

	// constructors
	public Flight(int flightNumber) {
		this.flightNumber = flightNumber;
	};

	public Flight(char flightClass) {
		this.flightClass = flightClass;
	}

	// methods
	@Override
	public String toString() {
		if (flightNumber > 0) {
			return "Flight #" + flightNumber;
		} else
			return "Flight Class " + flightClass;
	}

	public static void main(String[] args) {
		Flight myFlight = new Flight(175);
		System.out.println("My Flight is " + myFlight);
	}
}
