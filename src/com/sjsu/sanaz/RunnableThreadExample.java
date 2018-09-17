package com.sjsu.sanaz;

/**
 * Created by sanazk on 9/16/18.
 */
public class RunnableThreadExample implements Runnable {

    public int counter = 0;

    public void run(){
        System.out.print("Hi");
        try {
            while (counter < 5){
                Thread.sleep(500);
                counter++;
                System.out.print(counter);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("RunnableThread is interrupted");
        }
        System.out.println("RunnableThread is Terminating");
    }
}
