/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.multithread;

/**
 *
 * @author Mozvil
 */
public class SynchronizedThreads implements Runnable {

    int count = 0;

    /*private synchronized void intCount() { // garantiza que un thread lo ejecute a la ves
        count++;
    }

    private synchronized void printCount() {
        System.out.println("count : " + count);
    }*/
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            /*
              intCount()  ;
              printCount();
             */
            //SynchronizeBlock
            synchronized (this) {
                count++;
                System.out.println("count : " + count);
            }

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedThreads t = new SynchronizedThreads();

        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
        }

        System.out.println("Programa Finalizado count : " + t.count);
    }
}