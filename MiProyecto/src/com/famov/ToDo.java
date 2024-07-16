/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Mozvil
 */
public class ToDo {
    public static void main(String[] args) throws IOException{
        //TODO : Este programa podria funcinar mejor usando scaner.
        System.out.print("Introduce un numero: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        //TODO: Validar que el usuario ingrese un numero valido.
        br.close();
        //Todo: validar entrada.
        int i = Integer.parseInt(line);
        System.out.println("El numero " + i + " multiplicado por 10 es : " + (i*10)) ;
    }
}
