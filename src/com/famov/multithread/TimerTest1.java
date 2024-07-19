/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.multithread;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Mozvil
 */
public class TimerTest1 {

    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            private int n;
            @Override
            public void run() {
                System.out.println("n = " + n);
                n++;
                if(n>10){
                    timer.cancel();
                }
            }
        },1000,1000);

    }

}
