package coursera.HasLetter;

public class HasLetter {

    public static boolean hasLeter(String word, char letter) {

        boolean state = false;

        for (int i = 0; i < word.length(); i++)

            if (word.charAt(i) == letter) {

                state = true;

            }

        System.out.println(state);
        return state;
    }


}
