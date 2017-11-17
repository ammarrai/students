/*  notes:

     1. There are two ways in which to start a thread.
     a. extend the Thread class
     b. implement runnable interface


     2. a thread is like a separate OS process which can run
        concurrently with other threads.

    */


package core.multithreading.demo1;

public class Runner extends Thread {

    public void run() {


        for (int i = 0; i < 10; i++) {

            System.out.println("Hello  " + i);

            try {
                Thread.sleep(100);

            } catch (InterruptedException e) {

                e.printStackTrace();
            }

        }

    }
}


class App {

    public static void main(String[] args) {
        Runner runner1 = new Runner();
        runner1.start();

    }
}





