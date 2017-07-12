package thiskeyword;

public class CarMaker {

	
	public void makeCar() {
		
	Car mycar = new Car(200, 5, "huge", false);
	
	System.out.println(mycar.passengers);
	System.out.println(mycar.fuel);
	System.out.println(mycar.size);
	System.out.println(mycar.electric);
	
	
	}
}
