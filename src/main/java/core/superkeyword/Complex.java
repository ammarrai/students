package core.superkeyword;

class Complex {
	 
    private double re, im;
 
    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
 
    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {

    	/* UTILIZING SUPER!!!!!!!!!!!!!!! This uses the base implementation of the equals method and doesn't
    	proceed any further */
    	if (super.equals(o))
    		return true;
    	
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of Complex or not
          "null instanceOf [type]" also returns false */
        if (!(o instanceof Complex)) {
            return false;
        }
         
        // Typecast o to Complex so that we can compare data members 
        Complex c = (Complex) o;
         
        // Compare the data members and return accordingly 
        return Double.compare(re, c.re) == 0
                && Double.compare(im, c.im) == 0;
    }

 
// Driver class to test the Complex class
    public static void main(String[] args) {
        Complex c1 = new Complex(10, 15);
        Complex c2 = new Complex(10, 15);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}