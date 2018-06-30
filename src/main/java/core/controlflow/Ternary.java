package core.controlflow;

public class Ternary {

static int x = 5;
static int y = 10;

static String truecondition = "True condition: x is less than y";
static String falsecondition = "False condition: x is not more than y";

public static void main(String[] args){

	
	String z = x > y ? truecondition : falsecondition; 
	System.out.println(z);
}
	
	
	}


