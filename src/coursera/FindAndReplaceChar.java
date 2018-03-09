package coursera;

public class ForEachLoops {

    public static String replace(String word, char undesiredChar, char replacementChar) {

        /* 1st Step: We Initialize two char arrays. The first one is from the input String "word"
         The second array is an empty char array, but it is the same length as the first array */

        char[] originalCharacterArray = word.toCharArray();
        char[] modifiedCharacterArray = new char[originalCharacterArray.length];
        int i = 0;

        /* 2nd step:
        Go over the original "word" character array. If an element matches an undesired character,
        assign  that character to that same index in the modified array.
         */

        for (char c : originalCharacterArray) {
            if (c == undesiredChar) {
                modifiedCharacterArray[i] = replacementChar;
                i++;
            } else {
                modifiedCharacterArray[i] = c;
                i++;
            }

        }

        return new String(modifiedCharacterArray);
    }
}