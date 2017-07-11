package core.primitivecasting;

public class Downcasting_2 {

	int anIntvariable = 50;
	
	short aShortVariable = (short) anIntvariable;

	// This is explicit Type Conversion
	// Also called Explicit Casting or Casting or Downcasting.
	
	//Conversions & Promotions
	//https://docs.oracle.com/javase/specs/jls/se7/html/jls-5.html
	
	
	
	
	int anotherIntVar = 100;
	long anotherLongVar = 200;
	short anotherShortVar = (short) (anotherIntVar + anotherLongVar);

	// Here we put parenthesis around the operation on the right and cast it to a short.
	
	
	byte a = 10;
	short b = 200;
	int c = 3525;
	long d = 5351;
	float e = 35235.5F;
	double f = 35353.6;
	
	byte g =  (byte) ((long) b+c+d);
    // Here we cast everything to a long first in order to complete the expression
	// Then we cast that result to a byte.
	
}
