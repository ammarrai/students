package core.statickeyword.staticvariable;

public class Flight {

	int passengers = 0;
	static int allPassengers = 0;

	//m
	void addPassengers(int number) {
		passengers += number;
		allPassengers += number;
	}
	
	static void getAllPassengers() {
		System.out.println(allPassengers);
	}

	static int resetAllPassengers() {
		return allPassengers = 0;
	}

}
