package core.statickeyword.staticvariable;

public class Launcher {

	public static void main(String[] args) {

		Flight f1 = new Flight();
		
		f1.addPassengers(5);
		System.out.println("The # of passengers on f1 are:" + f1.passengers);
		System.out.println("The total count is: " + Flight.allPassengers);
		
		Flight f2 = new Flight();
		f2.addPassengers(5);		
		System.out.println("The # of passengers on f2 are:" + f2.passengers);
		System.out.println("The total count is: " + Flight.allPassengers);
		
		System.out.println("This is an illustration of a static variable being incremented");
		
		
	}
	
}
