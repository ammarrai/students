package core.lambda;

import java.util.function.*;

public class Lambdas {

    public static void main(String[] args) {

        //test() of Predicate
        Predicate<String> stringLength = (s) -> s.length() < 10;
        System.out.println(stringLength.test("Apples") + " - Apple is less than 10");


        //Consumer example uses accept()
        Consumer<String> consumerString = (s) -> System.out.println(s.toLowerCase());
        consumerString.accept("ABCDefghijklmNopQRSTUVWxyz");

        //Function example
        Function<Integer,String> converter = (num) -> Integer.toString(num);
        System.out.println("length of 26: " + converter.apply(26).length());

        //Supplier example
        Supplier<String> s = () -> "Java is fun";
        System.out.println(s.get());

        //Binary Operator example
        BinaryOperator<Integer> add = (a,b) -> a + b;
        System.out.println("add 10 to 25: " + add.apply(10, 25));

        //Unary operator example
        UnaryOperator<String> str = (msg) -> msg.toUpperCase();
        System.out.println(str.apply("This is my message in upper case"));


    }
}
