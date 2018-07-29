package core.innerclasses.anonymousinnerclass;

public class AnonymousClass {

    public void someMethod() {

        new Object() {

            void myAnonymousMethod() {
                System.out.println("I'm inside my anonymous method");
            }

        }

        .myAnonymousMethod(); // Here I am calling the anonymous method!

    }
}
