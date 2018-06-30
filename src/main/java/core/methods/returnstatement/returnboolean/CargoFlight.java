package core.methods.returnstatement.returnboolean;

public class CargoFlight {

		float maxCargoSpace = 1000.0f;
		float usedCargoSpace;

		public void add1Package(float h, float w, float d) {
			double size = h * w * d;
			if(hasCargoSpace(size))
				usedCargoSpace += size;
			else
				handleNoSpace();
		}

		/* The return type of the method below is boolean
		 *  the true or false which the method will return
		 *  is coming from the return statement which says:
		 *  if the used cargo space + size is less than or
		 *  equal to max cargo space, then the condition is 
		 *  true and the "hasCargoSpace will return a true.
		 */
				
		
		private boolean hasCargoSpace(double size) {
			return usedCargoSpace + size <= maxCargoSpace;    // 

		}

		private void handleNoSpace() {
			System.out.println("Not enough space");

		}

	}

