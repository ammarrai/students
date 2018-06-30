package core.datatypes;
public class Datatypes {

	

	
	public static void main(String[] args){
	
		byte     variable1          = 127;
		short    variable2          = 32_767; // 32 Thousand 676
		int      variable3          = 2_147_483_647;  // 2 billion 147 million 483 thousand and 647
		
		// make sure to put an "L" after a long value
		long     variable4          = 9_223_372_036_854_775_807L; // 9 quintillion 223 quadrillion 372 trillion 36 billion 854 million 775 thousand and 807   
		
		//an "F" after a long value
		float    variable5         = 1.14743647335423423F; // this is rounded off to 6 decimal places
		
		//a "D" after a long value
		double   variable6         = 1.53526254545234243D; // this is rounded off to 16 decimal places
		char     variable7         = 'a'; 
		boolean  variable8         = false;
		
		
		System.out.println("Maximum byte value: " + variable1);
		System.out.println("Maximum short value: " + variable2);
		System.out.println("Maximum int value: " + variable3);
		System.out.println("Maximum long value: " + variable4);
		System.out.println("Maximum float value: " + variable5);
		System.out.println("Maximum double value: " + variable6);
		System.out.println("sample char value: " + variable7);
		System.out.println("sample byte boolean: " + variable8);
	}
	
}
	
	
