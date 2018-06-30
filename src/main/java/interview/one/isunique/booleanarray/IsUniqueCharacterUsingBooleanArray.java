package interview.one.isunique.booleanarray;

/* ask interviewer:

Is it an ASCII string?

non-extended ASCII is 7 bits or 128 characters & extended ASCII is 256 characters.

or

is it a UNICODE string?


UNICODE is a superset of ASCII. It is encoded using UTF-8 or UTF-32)
and contains 2^21 characters.


We will assume 128 characters...



*/

public class IsUniqueCharacterUsingBooleanArray {


    public boolean isUnique(String str) {

        if (str.length() > 128) return false;


        boolean[] character_set = new boolean[128];


        for (int i = 0; i < str.length(); i++) {

            int val = str.charAt(i);

            if (character_set[val]) {

                return false;
            }


            character_set[val] = true;

        }

        return true;
    }
}