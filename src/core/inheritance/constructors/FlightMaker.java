package core.inheritance.constructors;

public class FlightMaker {

	Flight f175 = new Flight();
	
	CargoFlight cf1 = new CargoFlight();
	
	CargoFlight cf2 = new CargoFlight(294);
	
	CargoFlight cf3 = new CargoFlight(85, 2000.0f);
	
	CargoFlight cf4 = new CargoFlight (5000.0f);
	
}	
