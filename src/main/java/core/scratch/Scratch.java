package core.scratch;

public class Scratch {


    public static String replace(String word, char undesiredChar, char replacementChar) {

        char[] cArray = word.toCharArray();

        for (char c : cArray) {

            if (c == undesiredChar) {

                c = replacementChar;
            }
        }
        return word;
    }
}





