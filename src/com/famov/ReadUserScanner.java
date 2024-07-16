/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov;

import java.util.Scanner;

/**
 *
 * @author Mozvil
 */
public class ReadUserScanner {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String name = sc.nextLine();
        System.out.println("Hola " + name +"!");
    }
}
