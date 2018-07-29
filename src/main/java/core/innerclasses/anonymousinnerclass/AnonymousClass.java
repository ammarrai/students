package core.innerclasses.anonymousinnerclass;

/* Anonymous classes are the same as Local Classes, except they have no name. Notice that
within "someMethod()" I declared a "new Object()" within this object, I declared a method.
Now, to call this method, I simply called this method similar to how we call static methods.

Like so: .myAnonymousMethod()

 */


public class AnonymousClass {

    public void someMethod() {

        new Object() {

            void myAnonymousMethod() {
                System.out.println("I'm inside my anonymous method, which was called using just the dot operator!");
            }

        }

        .myAnonymousMethod(); // Here I am calling the anonymous method!s

    }
}
