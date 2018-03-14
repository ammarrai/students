package coursera.equalsequalsoperator;

public class NewStrings {

    public static void main(String[] args) {

        /* Lesson: If the new keyword is added to either of the Strings, the result is non-equivalency.  */

        String first = new String("Yo");
        String second = ("Yo");


        if (first == second) {

            System.out.println("they are both equivalent");

        }
 else{
            System.out.println("not equivalent");
        }

    }


}
