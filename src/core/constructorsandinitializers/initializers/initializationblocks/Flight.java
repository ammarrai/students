package core.constructorsandinitializers.initializers.initializationblocks;


/* An initialization block is a great place to put in code which you wish to share
 * among ALL the consturctors!
*/

public class Flight {

	
	// instance variables
	private int passengers, flightNumber, seats =150;
	private char flightClass;
	private boolean[] isSeatAvailable;

	// initializer block
	{	
		isSeatAvailable= new boolean[seats];
		for(int i = 0; i< seats; i++)
			isSeatAvailable[i] = true;
	}
	
	
	// constructors
	public Flight() {
	}

	public Flight(int flightNumber) {
		this();
		this.flightNumber = flightNumber; // instance variable = passed argument
	}
	
	
	public Flight(char flightClass) {
		this();
		this.flightClass = flightClass; // instance variable = passed argument
	}
	
	
}



