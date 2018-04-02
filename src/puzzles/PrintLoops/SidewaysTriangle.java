package puzzles.PrintLoops;

public class SidewaysTriangle {

    public static void main(String[] args) {

        // master loop
        for (int a = 0; a < 5; a++) {


            // create triangle
            for (int b = 1; b <= 5; b++) {        // number of rows/lines we want; 5

                for (int c = 1; c <= b; c++) {    // number of "#s" we want; inits at 1 and until increments the number to outer loop's variable.
                    System.out.print("#");
                }

                System.out.print("\n");

            }


            // create half a square

            for (int d = 1; d < 4; d++) {    // number of rows/lines we want;
                for (int e = d; e <= 4; e++) {
                    System.out.print("#");
                }
                System.out.print("\n");
            }


            // end of master loop

        }
    }

}



