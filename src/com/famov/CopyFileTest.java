/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Mozvil
 */
public class CopyFileTest {

    public static void copyFile(File source, File dest) throws IOException {
        InputStream in = new FileInputStream(source);
        OutputStream out = new FileOutputStream(dest);
        int b = in.read();
        while (b != -1) {
            out.write(b);
            b = in.read();
        }

        in.close();
        out.close();
    }

    public static void copyFile2(File source, File dest) throws IOException {

        try (InputStream in = new FileInputStream(source); 
             OutputStream out = new FileOutputStream(dest)){
            
            byte buffer[] = new byte[4096];
            int n = in.read(buffer);
            while (n != -1) {
                out.write(buffer, 0, n);
                n = in.read(buffer);
            }

        }
    }

    public static void main(String[] args) throws Exception {
        copyFile(new File("c:/temp/imagen.png"), new File("c:/temp/imagen2.png"));
        copyFile2(new File("c:/temp/imagen.png"), new File("c:/temp/imagen3.png"));

    }
}
