package core.Strings;

public class StringEquivalency {

    //  Lesson: As long as a String contains the same value, then it is essentially the same object, with the same hashcode.

    public static void main(String[] args) {

        String first = new String();
        String second;
        String third = new String();
        String fourth;

        first = "My fair lady";
        second = "My fair lady";
        third = "My fair lady";
        fourth = "My fair lady";

        if (first == second) {
            System.out.println("first: " + first.hashCode() + " and " + "second:" + second.hashCode() + " are pointing to the same object. (==)");
        } else {
            System.out.println("first: " + first.hashCode() + "and " + "second:" + second.hashCode() + "point to DIFFERENT objects. (==)");

        }

        if (second == third) {
            System.out.println("second: " + second.hashCode() + " and third:" + third.hashCode() + " are pointing to the same object. (==)");
        } else {
            System.out.println("second: " + second.hashCode() + "and third:" + third.hashCode() + " point to DIFFERENT objects. (==)");
        }

        if (third == fourth) {
            System.out.println("third:" + third.hashCode() + " and fourth:" + fourth.hashCode() + " point to the same object. (==)");
        } else {
            System.out.println("second:" + third.hashCode() + "and third:" + fourth.hashCode() + " point to DIFFERENT objects. (==)");

        }

        if (first.equals(second)) {
            System.out.println("first equals second (.equals)");
        } else {
            System.out.println("first doesn't NOT equal second (.equals)");
        }

        if (second.equals(third)) {
            System.out.println("second equals third (.equals)");
        } else {
            System.out.println("second doesn't NOT equal third (.equals)");
        }


        if (third.equals(fourth)) {
            System.out.println("third equals fourth (.equals)");
        } else {
            System.out.println("third doesn't NOT equal fourth (.equals)");
        }
    }
}
