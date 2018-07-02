package core.regex.NumberOfWords;

public class NumberOfWords {


    public static int numberOfWords(String text) {

        String[] words = null;


        if (text.equals(null) | text.isEmpty()) {
            return 0;
        }

        words = text.split("[\\w'_-]+");
        System.out.println(words.length);

        return words.length;

    }

}
