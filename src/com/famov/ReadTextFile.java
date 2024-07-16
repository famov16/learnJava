/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author Mozvil
 */
public class ReadTextFile {

    public static void main(String[] args) throws  Exception{       
//        BufferedReader br = new BufferedReader(        
//            new InputStreamReader(
//                new FileInputStream("c:/TheJavaPath/learnJava/src/com/famov/quijote.txt")
//            )
//        );
//      
//      
//        String line = br.readLine();
//        while (line != null) {            
//            System.out.println(line);
//            line = br.readLine();
//        }
//        br.close();
          BufferedReader br = new BufferedReader(        
            new InputStreamReader(
                ReadTextFile.class.getResourceAsStream("oop/quijote.txt")
            )
        );
      
      
        String line = br.readLine();
        while (line != null) {            
            System.out.println(line);
            line = br.readLine();
        }
        br.close();
    }

}
