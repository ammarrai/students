package core.constructors.constructorchaining;

public class Passenger {
	// instance variables
	int freeBags;
	int checkedBags;
	double perBagFee;

	// constructors
	public Passenger() { // default constructor.
	}
	
    // first constructor
	public Passenger(int freeBags) { // constructor which takes 1 arg.
		this(freeBags > 1? 25.0d : 50.0d);
		this.freeBags = freeBags;
	}
	
	// second constructor
	public Passenger(int freeBags, int checkedBags) { // constructor which takes  2 args.
		this(freeBags);   // Constructor Chaining: This is simply calling the first constructor
		this.checkedBags = checkedBags;
	}
	
	// third constructor
	private Passenger(double perBagFee) { 
		this.perBagFee = perBagFee;
	}
	
	// methods

	// Getters & Setters
	public int getFreeBags() {
		return freeBags;
	}

	public void setFreeBags(int freeBags) {
		this.freeBags = freeBags;
	}

	public int getCheckedBags() {
		return checkedBags;
	}

	public void setCheckedBags(int checkedBags) {
		this.checkedBags = checkedBags;
	}
}
