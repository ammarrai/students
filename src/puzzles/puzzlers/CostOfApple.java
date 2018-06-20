package puzzles.puzzlers;

// What will be printed out?


import java.math.BigDecimal;

public class CostOfApple {

    public static void main(String[] args) {

        //TEST #1
        System.out.println(2.00 - 1.10);


        //TEST #2
        BigDecimal payment = new BigDecimal(2.00);
        BigDecimal cost = new BigDecimal(1.10);
        System.out.println(payment.subtract(cost));

    }
}


/* ***** SPOILERS ******
TEST #1
If you thought that it would print out .90 cents. You are wrong. This is because it
will try to do a floating point calculation, and the result

TEST #2
The 'double' value is translated to BigDecimal with the exact decimal representation of the double's binary
floating-point value.

 */
