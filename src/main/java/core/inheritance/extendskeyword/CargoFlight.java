package core.inheritance.extendskeyword;

public class CargoFlight extends Flight {

	float maxCargoSpace = 1000.0f;
	float usedCargoSpace;

	public void add1Package(float h, float w, float d) {
		double size = h * w * d;
		if(hasCargoSpace(size))
			usedCargoSpace += size;
		else
			handleNoSpace();
	}
	
	private boolean hasCargoSpace(double size) {
		return usedCargoSpace + size <= maxCargoSpace;    // 

	}

	private void handleNoSpace() {
		System.out.println("Not enough space");

	}

}


/* Please note that while a CargoFlight instance will inherit the behaviors of Flight,
 * a instance of type Flight will not have the behaviors of CargoFlight 
 */

 