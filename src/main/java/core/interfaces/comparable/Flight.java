package core.interfaces.comparable;

import java.util.Arrays;

public class Flight implements Comparable {

	private int flightTime; // mins past midnight

	// constructors
	Flight() {

	}

	// methods
	public int compareTo(Object o) {
		Flight f = (Flight) o;

		if (flightTime < f.flightTime) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return null;
	}

	// mm
	public static void main(String[] args) {
		Flight flight1 = new Flight();
		flight1.setFlightTime(45);

		Flight flight2 = new Flight();
		flight1.setFlightTime(145);

		Flight flight3 = new Flight();
		flight1.setFlightTime(15);

		Flight flight4 = new Flight();
		flight1.setFlightTime(25);

		Flight flight5 = new Flight();
		flight1.setFlightTime(835);

		Flight[] flights = { flight1, flight2, flight3, flight4, flight5 };

		Arrays.sort(flights);

		System.out.println(Arrays.toString(flights));

	}

	// getters & setters
	public int getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(int flightTime) {
		this.flightTime = flightTime;
	}

}