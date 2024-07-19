/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.multithread;

public class ThreadCreation2 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread 1 " + i);
        }
    }

    public static void main(String[] args) {
        Thread t = new ThreadCreation2(); 
        t.start();
        System.out.println("Thread 2");

    }
}
