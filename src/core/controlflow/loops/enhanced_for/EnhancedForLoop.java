package core.controlflow.loops.enhanced_for;

// used to iterate over arrays and collections; AKA: for-each loop

// note: the colon : should be read as "in"

public class EnhancedForLoop {

	public static void main(String[] args) {

		String[] animals= {"cat","dog","lion","tiger","crow","lizard","hen"};
		
		for (String value : animals) {     //note: "value" is a variable which is only used within the loop
		
			System.out.println(value);
		}
	}
}
