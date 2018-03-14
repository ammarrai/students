package core.regex.NumberOfCharacters;

public class NumberOfCharacters {

    public static int numberOfCharacters(String text) {

        char characterArray[] = text.toCharArray();

        int numberOfCharacters = characterArray.length;

        System.out.println(numberOfCharacters);
        return numberOfCharacters;


    }

}
