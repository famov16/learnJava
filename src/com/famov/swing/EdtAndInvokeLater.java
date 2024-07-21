/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.famov.swing;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author Mozvil
 */
public class EdtAndInvokeLater {

    public static void main(String[] args) {

        /*Swing y AWT no son multithread  En su lugar existe un thread especia llamado EDT que es el encargado de gesrtionar todas las
        Tareas relacionadas con la interface del usaurio, como el dibujo y redibujo de pantallas, asi como el manejo  eventos que tienen
        que ver con Swing. Y tambien un Tread que se encarga de capturar los eventos del sistema*/
        // Swing fue diseñado con una regla simple, el EDT es responsable de ejecutal cualquier metodo que modifique  el estado de un componente
        // SwingUtilities.isEventDispatchThread() me devuelve verdaddero si el Thread es el  EDT
        
        SwingUtilities.invokeLater(new Runnable() { //Agenda el parametro para que a la primera opurtinidad pueda ser ejecutado por el EDT y no sea ejecutado por otro Thread
            @Override
            public void run() {
                JFrame frame = new JFrame("JFrameDemo");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setMinimumSize(new Dimension(400, 300));
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);

            }
        });

    }
}
