/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.swing;

import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**
 *
 * @author Mozvil
 */
public class MouseAdapterDemo extends JFrame{
    
    public MouseAdapterDemo(String title) {
        super(title);
    }
    
   
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MouseAdapterDemo frame = new MouseAdapterDemo("MouseEventDemo");
                frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                frame.setMinimumSize(new Dimension(400, 300));
                frame.addMouseListener(new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e) {
                          System.out.printf("mouseClicked at (%d,%d)\n", e.getPoint().x, e.getPoint().y);
                          System.out.println("EDT: " + SwingUtilities.isEventDispatchThread());
                    }
                    
                });
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

}