package core.methods.overloading;

public class Flight {

	int seats = 150;
	int passengers;
	int totalCheckedBags;
	int maxCarryOns = seats * 2;
	int totalCarryOns;

	public void add1Passenger() {
		if (hasSeating())
			passengers += 1;
		else
			handleTooMany();
	}

	public void add1Passenger(int bags) { // overloaded method
		if (hasSeating()) {
			add1Passenger();
			totalCheckedBags += bags;
		}
	}

	private boolean hasSeating() {
		return passengers < seats;
	}

	private boolean hasCarryOnSpace(int carryOns) {
		return totalCarryOns + carryOns <= maxCarryOns;
	}

}
