/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Mozvil
 */
public class ReadUser {
    public static void main(String[] args) throws  Exception{
        System.out.println("¿Como te llamas? ");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();
        System.out.println("Hola " + name + "!");
    }
}
