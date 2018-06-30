package core.regex.NumberOfSentences;

public class NumberOfSentences {

    static String[] stringArray = null;

    public static int numberOfSentences(String text) {

        stringArray = text.split("[!?.:;]+");

        System.out.println(stringArray.length);
        return stringArray.length;


    }

}


