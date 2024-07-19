/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.multithread;

/**
 *
 * @author Mozvil
 */
public class CriticalSections implements Runnable{
    int count = 0;
    
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            count++;// Critical Seccion
            System.out.println("count : " + count);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
    }
    
    public static void main(String[] args) {
        CriticalSections t = new CriticalSections();
        
        Thread thread1 = new Thread(t);
        Thread thread2 = new Thread(t);
        thread1.start(); 
        thread2.start(); 
        
        System.out.println("Programa Finalizado count : " + t.count);
    }
}
