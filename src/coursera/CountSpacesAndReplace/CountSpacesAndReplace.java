package coursera.CountSpacesAndReplace;

public class CountSpacesAndReplace {

    public static int ReplaceSpacesWithUnderscores(String s) {


        char[] letters = s.toCharArray();
        int x = 0;

        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == ' ') {
                letters[i] = '_';
                x++;
            }        }


        System.out.println("s(original String): " + s);  // our original String
        System.out.println("x(# of spaces): " + x);  // our count of spaces in String s

        String lettersAsString = String.copyValueOf(letters);
        System.out.println("letters(new array): " + lettersAsString); // the character array we have created

        String newString = new String(lettersAsString);
        System.out.println("newString(new String): " + newString);  // brand new string created using the array

        return x;

    }



    }

