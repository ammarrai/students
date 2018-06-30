package core.constructorsandinitializers.parameters;
import xyz.ObjectSwapper;

public class FlightMaker {

	void makeflight(int passedFlightValue1, int passedFlightValue2) {

		Flight val1 = new Flight(passedFlightValue1);
		Flight val2 = new Flight(passedFlightValue2);

		System.out.println("The first flight is " + val1.flightNumber);
		System.out.println("The second flight is " + val2.flightNumber);

		
		ObjectSwapper<Flight> os = new ObjectSwapper<Flight>(val1, val2);
		val1 =  os.getFirst();
		val2 = os.getSecond();
		
			
		
		System.out.println();
		System.out.println("The first flight is " + val1.flightNumber);
		System.out.println("The second flight is " + val2.flightNumber);

	}

}