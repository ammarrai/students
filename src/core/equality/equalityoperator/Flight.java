package core.equality.equalityoperator;

public class Flight {

	int flightNumber;

	Flight(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public static void main(String[] args) {

		Flight f1 = new Flight(202);
		Flight f2 = new Flight(202);

		if (f1 == f2) {
			System.out.println("There's a match.");
		} else
			System.out.println("The f1 and f2 objects are NOT equal. not the same object instance.");

	}

}
