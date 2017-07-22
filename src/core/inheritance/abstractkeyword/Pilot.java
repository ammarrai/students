package core.inheritance.abstractkeyword;

public abstract class Pilot {                 

	private Flight currentFlight;

	public void fly(Flight f) {

		if (canAccept(f))
			currentFlight = f;
		else
			handleCantAccept();
	}
	
	public abstract boolean canAccept(Flight f);     // abstract method, so class must be abstract too
	

	private void handleCantAccept() {
		System.out.println("Can't Accept");
	}

}
