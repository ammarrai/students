package interview.one.isunique.booleanarray;

public class Runner {


    public static void main(String[] args) {

        String str = "abcdefghijklmn";

        IsUniqueCharacterUsingBooleanArray iuc = new IsUniqueCharacterUsingBooleanArray();

        if (iuc.isUnique(str) == true) {

            System.out.println("This string has only unique characters.");
        } else

            System.out.println("duplicates found!");


    }

}
