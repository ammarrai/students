package coursera.stringconcat;

public class Concatenation {

    public static void main(String[] args) {

        String s1 = new String("My ");
        String s2 = s1 + new String("String");
        System.out.println(s2);

        String s3 = new String("My");
        String s4 = " String";
        String s5 = s3 + s4;
        System.out.println(s5);

        String s6 = "My String";
        String s7 = s6;
        System.out.println(s7);

        String s8 = "My ";
        s8 = s8.concat("String");
        System.out.println(s8);
    }


}
