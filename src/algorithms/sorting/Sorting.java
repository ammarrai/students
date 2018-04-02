package algorithms.sorting;

public class Sorting {

    static String selectionSort(String input) {

        String everythingSorted = null;

        char myCharArray[] = input.toCharArray();

        for (int i = 0; i <= myCharArray.length; i++) {

            if (myCharArray[i] > myCharArray[i + 1]) {

                char placeholder;

                placeholder = myCharArray[i];

                myCharArray[i] = myCharArray[i + 1];

                myCharArray[i + 1] = placeholder;
            }

            everythingSorted = myCharArray.toString();

        }

        System.out.println(everythingSorted);
        return everythingSorted;

    }

}
