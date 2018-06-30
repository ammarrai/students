package core.fields.finalfields;

public class Passenger {

	private final int freeBags;
	
// Any attempt to set freeBags after it's been set in the constructor will give a compiler error
	
	public Passenger(int freeBags) {
		
		this.freeBags = freeBags;
	}
	
}
