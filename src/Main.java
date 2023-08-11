package Java;
import java.lang.System;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        
        class Counter {
            private int count = 0;
            public void increment() {++count;} // the statement that increases the value of one, will only be executed in ONE thread at most.
            /*
             * getfield count
             * load 1 - both threads loads 1 each
             * add - both threads adds 1
             * putfield count
             * Read-Modify-Write pattern
             * RMW
             */
            public int getCount() {return count;}
        }

        final Counter counter = new Counter();

        class CountingThread extends Thread {
            public void run() {
                for(int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        }

        CountingThread t1 = new CountingThread();
        CountingThread t2 = new CountingThread();

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(counter.getCount()); // expected output: 20000

        /*
         * initalization of new threads below 
         */

    //     Thread myThread = new Thread() {
    //     public void run() {
    //         System.out.println("Hello from the new thread");
    //     }
    // };

    // myThread.start();
    // Thread.yield();
    // System.out.println("Hello from the main thread");
    // myThread.join();
}}
