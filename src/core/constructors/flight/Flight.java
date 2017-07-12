package core.constructors.flight;

public class Flight {

	// instance variables
	int passengers; 
	int seats;

	// default constructor
	Flight() { 
		seats = 150;
		passengers = 0;
	}

	//methods
	private void handleTooMany() { // definition of handleTooMany method
		System.out.println("Too many!");
	}

	private void add1Passenger() {
		if (passengers < seats)
			passengers += 1;

		else
			handleTooMany(); // call handleTooMany method if passengers > seats
	}

	//run
	final void run(String[] args) {
		
		System.out.println("initial # of passengers: " +passengers);
		System.out.println("initial # of seats: " + seats);
		add1Passenger();
		System.out.println("number of passengers now: " +passengers);
	}

}