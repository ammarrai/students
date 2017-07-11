package core.array;

public class TwoDimensionalStringArray {

	public static void main(String[] args) {

		/**
		 * We have just declared an array of four elements in which each element
		 * has 3 values.
		 * 
		 *
		 * EXAMPLE: physics: Ram, Sara chemistry: Chi, Zack biology: Nam, Jean
		 * english: Sam, Ara
		 * 
		 * The left index [4] determines the # of rows. the [3] is how many
		 * indexes each row contains.
		 *
		 *
		 */

		String[][] tutors = new String[][] { { "Physics", "Ali", "Sara" }, { "Chemistry", "Chi", "Zack" },
				{ "Biology", "Nam", "Jean" }, { "English", "Sam", "Ara" } };

				int x = 0;
				int y = 0;
				
				System.out.println(tutors[x][y]);
				
	}
}
