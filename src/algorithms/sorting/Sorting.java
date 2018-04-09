package algorithms.sorting;

public class Sorting {

    static char[] selectionSort(String input) {


        char myCharArray[] = input.toCharArray();

        for (int h = 0; h < myCharArray.length - 1; h++) {

            for (int i = 0; i < myCharArray.length - 1; i++) {

                if (myCharArray[i] > myCharArray[i + 1]) {

                    char placeholder;

                    placeholder = myCharArray[i];

                    myCharArray[i] = myCharArray[i + 1];

                    myCharArray[i + 1] = placeholder;
                }

            }
        }

        System.out.println(myCharArray);
        return myCharArray;

    }
}
