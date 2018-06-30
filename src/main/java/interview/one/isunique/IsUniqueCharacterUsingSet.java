package interview.one.isunique;

import java.util.HashSet;
import java.util.Set;

public class IsUniqueCharacterUsingSet {


    public boolean isUnique(String str) {


        Set<Character> characterSet = new HashSet<>();

        for (char c : str.toCharArray()) {

            if (characterSet.contains(c)) {

                return false;
            }

            characterSet.add(c);

        }

        return true;


    }

}
