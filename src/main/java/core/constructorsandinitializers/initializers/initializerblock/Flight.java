package core.constructorsandinitializers.initializers.initializerblock;


/* An initialization block is a great place to put in code which you wish to share
 * among ALL the consturctors!
*/

public class Flight {
	
	// instance variables
	
	private int passengers, flightNumber, seats =150;
	private char flightClass;
	private boolean[] isSeatAvailable;

	// initializer block (this code is shared among all our constructors)
	
	{	
		isSeatAvailable= new boolean[seats];  // multiple init blocks ones can be used.
		for(int i = 0; i< seats; i++)
			isSeatAvailable[i] = true;
	}
	
	
	// constructors
	
	public Flight() {
	}

	public Flight(int flightNumber) {
	//	this();    <-- no longer needed due to initializer block
		this.flightNumber = flightNumber; // instance variable = passed argument
	}
	
	
	public Flight(char flightClass) {
	//	this();    <-- no longer needed due to initializer block
		this.flightClass = flightClass; // instance variable = passed argument
	}	
}



