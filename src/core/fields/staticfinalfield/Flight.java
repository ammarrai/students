package core.fields.staticfinalfield;

public class Flight {

	static final int MAX_FAA_SEATS = 550;   // use ALL CAPS for static final fields (named constants)
	private int seats;
	
	
	//G&S
	public void setSeats(int seats){
		if (seats < MAX_FAA_SEATS) {
			this.seats  = seats;				
		}
		else {
			System.out.println("handle error, somehow");
		}
	
		
	}
}
