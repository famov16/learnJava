/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.swing;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mozvil
 */
public class ShowMessageDialogDemo {
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JOptionPane.showMessageDialog(null,"Hola");
            }
        });
        
    }
}
