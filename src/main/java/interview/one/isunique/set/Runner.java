package interview.one.isunique.set;

import interview.one.isunique.IsUniqueCharacterUsingSet;

public class Runner {

    public static void main(String[] args) {

        String str = "abcdefghijklmnopqrstuvwxyzz";


        IsUniqueCharacterUsingSet iuc = new IsUniqueCharacterUsingSet();


        System.out.println(str);
        if (iuc.isUnique(str)) {

            System.out.println("This string is unique.");

        } else
            System.out.println("Duplicates found!");

    }
}
