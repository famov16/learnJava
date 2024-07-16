/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov;

import java.io.File;

/**
 *
 * @author Mozvil
 */
public class ListFiles {
    private static StringBuilder temp = new StringBuilder();
    private static String formatString(String str, int len){
        temp.setLength(0);
        temp.append(str);
        while(temp.length() < len)
            temp.append(" ");
            
        return temp.toString();
    }
    
    public static void main(String[] args) {
        File base = new File("c:/TheJavaPath/learnJava");
        File listFiles[] = base.listFiles();
        int nameLen = 0;
        for (File f : listFiles) {
          
          nameLen = Math.max(nameLen, f.getName().length());
            
        }
        nameLen += 3;
        System.out.print(formatString("Nombre", nameLen));
        System.out.print("Tipo          ");
        System.out.println("Tamaño");
        
        StringBuilder sb = new StringBuilder();
        while (sb.length() < nameLen) 
            sb.append("-");

        sb.append("-----------------");
        for (int i = 0; i < 12; i++) {
            sb.append("-");
            
        }
        System.out.println(sb.toString());
        
        for (File f : listFiles) {
            sb.setLength(0);
            sb.append(formatString(f.getName(), nameLen));
            sb.append(f.isFile() ? "Archivo       " : "Directorio    ");
            sb.append(f.length());
            System.out.println(sb.toString());
        }
        
        
    }
}
