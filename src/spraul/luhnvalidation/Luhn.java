package spraul.luhnvalidation;

public class Luhn {


    public boolean validate(int input) {

        boolean status = false;


        if (input == 1) {

            status = true;
        }

        return status;
    }

}
    