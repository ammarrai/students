package core.interfaces.inheritingmultipleinterfaces;

import java.util.Iterator;

public class Flight implements Comparable, Iterable<Person> {

	private int flightTime;
	private CrewMember[] crew;
	private Passenger[] roster;
	
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public Iterator<Person> iterator() {
		return new FlightIterator(crew, roster);
	}

}
