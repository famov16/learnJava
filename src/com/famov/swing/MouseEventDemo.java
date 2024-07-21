/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.swing;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;


/**
 *
 * @author Mozvil
 */
public class MouseEventDemo extends JFrame implements MouseListener {
    
    public MouseEventDemo(String title) {
        super(title);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.printf("mouseClicked at (%d,%d)\n", e.getPoint().x, e.getPoint().y);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("mousePressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MouseEventDemo frame = new MouseEventDemo("MouseEventDemo");
                frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                frame.setMinimumSize(new Dimension(400, 300));
                frame.addMouseListener(frame);
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }

}