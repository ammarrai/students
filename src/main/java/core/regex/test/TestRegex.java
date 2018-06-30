package core.regex.test;

public class TestRegex {

    public static String[] testRegex(String text) {

        String[] temporaryStringArray;

        temporaryStringArray = text.split("%+");

        System.out.println(temporaryStringArray.toString());

        return temporaryStringArray;

    }
}
