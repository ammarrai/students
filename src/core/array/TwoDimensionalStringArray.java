package core.array;

public class TwoDimensionalStringArray {

	public static void main(String[] args) {

		String[][] TwoDimensionalArray; // 2-dimensional array declaration
		TwoDimensionalArray = new String[4][3]; // 2 dimensional array
												// instantiation
		
		TwoDimensionalArray = { { "Physics", "Ali", "Sara" }, { "Chemistry", "Chi", "Zack" },
			{ "Biology", "Nam", "Jean" }, { "English", "Sam", "Ara" } };

		/**
		 * We have just declared an array of four elements in which each element
		 * has 2 values.
		 * 
		 *
		 * EXAMPLE: physics: Ram, Sara chemistry: Chi, Zack biology: Nam, Jean
		 * english: Sam, Ara
		 * 
		 * The left index [4] determines the # of rows. the [2] is how many
		 * indexes each row contains.
		 *
		 *
		 */

		String[][] tutors = new String[][] { { "Physics", "Ali", "Sara" }, { "Chemistry", "Chi", "Zack" },
				{ "Biology", "Nam", "Jean" }, { "English", "Sam", "Ara" } };

				int x = 1;
				int y = 1;
				
				System.out.println(tutors[x][y]);
				
	}
}
