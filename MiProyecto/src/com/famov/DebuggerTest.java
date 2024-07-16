/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov;

/**
 *
 * @author Mozvil
 */
public class DebuggerTest {
    private static void print(int a , int b){
        System.out.printf("%d %d\n", a ,b);
        
    }
    
    public static void main(String[] args) {
        for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                print(i, j);
                
            }
            
        }
    }
}
