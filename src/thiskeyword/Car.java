package thiskeyword;

public class Car {

	// the "this" keyword allows you to point to an object's instance variables.

	// has to be called from the body of another constructor.

	// must be the first line in the constructor

	// instance variables
	int fuel = 50;
	int passengers = 4;
	int seats = 4;
	String size = "large";
	boolean electric = false;

	// constructors

	// no-arg constructor
	Car() {
		seats = 4;
	}

	// constructor #2
	Car(int fuel, int passengers, String size, boolean electric) {
		this(); // This will call the no-arg constructor to initialize the seats.
		this.passengers = passengers;
		this.size = size;
		this.electric = electric;
	}

}
