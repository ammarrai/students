package core.interfaces.comparable;

import java.util.Arrays;

public class Passenger implements Comparable {

	//iv
	private int memberLevel; // 3rd, 2nd, 1st
	private int memberDays;
	
	//cc
	
	
	
	//methods
	public void setLevelAndDays(int level, int days) {
		this.memberLevel = level;
		this.memberDays = days;
	}
	
	
	public int compareTo(Object o) {

		Passenger p = (Passenger) o;
		if (memberLevel > p.memberLevel)
			return -1;
		else if (memberLevel < p.memberLevel)
			return 1;
		else {
			if (memberDays > p.memberDays)
				return -1;
			else {
				return 0;
			}
		}
	}

	public static void main(String[] args) {
		
		Passenger bob = new Passenger();
		bob.setLevelAndDays(1,180);
		
		Passenger jane = new Passenger();
		jane.setLevelAndDays(1,90);
		
		Passenger[] passengers= 
			{bob, jane};
		Arrays.sort(passengers);
		System.out.println(passengers);
		
	}

}
