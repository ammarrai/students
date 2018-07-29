package core.innerclasses.localclass;

/* A Local Class is a class within a method. Note that "LocalClass" is declared within
 *  "enclosingMethod()"
 */

public class Example {

    public void enclosingMethod() {

        class LocalClass {

            // fields declared cannot be static / must be instance members.
            public void myLocalClassMethod() {

                System.out.println("I instantiated Example and ran 'enclosingMethod()' which automatically");
                System.out.println("ran methods within the local class that was embedded within enclosingMethod().");

            }
        }

        // instantiate class anonymously and call its method.
        new LocalClass().myLocalClassMethod();
    }
}

/* Local classes, or Local Inner Classes are a way to create functionality which will only be ever used
within a code block, and hidden from the rest of the application. It's visibility is private.

 */