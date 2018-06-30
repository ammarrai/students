package core.wrapperclasses;

public class Flight {

	// iv
	Integer flightNumber;
	Character flightClass;

	// constructors
	Flight(Integer fightNumber) {
		this.flightNumber = flightNumber;
	}

	Flight(Character flightClass) {
		this.flightClass = flightClass;
	}

	// main method
	public static void main(String[] args) {

	Flight f1 = new Flight(142);
	System.out.println(f1);	
	}

	// m
	@Override
	public String toString() {

		if (flightNumber != null)
			return "Flight #" + flightNumber;
		else if (flightClass != null)
			return "Flight Class " + flightClass;
		else
			return "Flight identity not set ";
	}
}

/*
 * overriden toString method to provide validation checking and the ability to
 * return the appropriate variable with the toString applied to it.
 * 
 * http://bit.ly/javabyte
 * http://bit.ly/javashort
 * http://bit.ly/javainteger
 * http://bit.ly/javalong
 * 
 * 
 * 
 */