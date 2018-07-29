package core.innerclasses.localclass;

public class Example {

    public void enclosingMethod() {

        class LocalClass {

             // fields declared cannot be static / must be instance members.
            public void myLocalClassMethod() {

                System.out.println("I am now running a method inside my local inner class");
            }
        }

        // instantiate class anonymously and call its method.
        new LocalClass().myLocalClassMethod();
    }
}

/* Local classes, or Local Inner Classes are a way to create functionality which will only be ever used
within a code block, and hidden from the rest of the application. It's visibility is private.

 */