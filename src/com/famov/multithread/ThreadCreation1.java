/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.multithread;

/**
 *
 * @author Mozvil
 */
public class ThreadCreation1 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i<10; i++){
            System.out.println("Prueba " + i);
        }
            
            
    }
    
    public static void main(String arg[]){
        Thread t = new Thread(new ThreadCreation1());
        t.start();
        System.out.println("Programa Finalizado");
    }
    
}
