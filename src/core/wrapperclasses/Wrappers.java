package core.wrapperclasses;

public class Wrappers {

	public static void main(String[] args) {

		Integer a = 100;
		int b = a;
		Integer c = b;
		
		/* while these conversions were done implicitly
		   java also provides methods for explicit conversions
		                                                       */

		/* boxing - taking a primitive value and putting it in a box/class.
		 
	 	   unboxing - wrapper class and convert to primitive type
				     xxxValue 
				     Integer has intValue()
				     Byte has byteValue(), etc.
				                               */
		Integer d = Integer.valueOf(100);
		int e = d.intValue();
		Integer f = Integer.valueOf(e);
		
		Float g = Float.valueOf(18.125f);
		
		float h = g.floatValue();
		
		String s = "87.44";
		double s1= Double.parseDouble(s);
		
		Double s2 = Double.valueOf(s);
		

	}

}
