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
        public class CreateJFrameDemo extends JFrame{

            public static CreateJFrameDemo newInstance(){
                CreateJFrameDemo frame  = new CreateJFrameDemo();
                frame.setTitle("CreateJFrameDemo");
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setMinimumSize(new Dimension(400,300));
                frame.setLocationRelativeTo(null);
                return frame;
            }
            /*
                Un constructor sirve para inicializar el objeto, si tú llamas a un método y en la clase hija lo redefines, 
                cuando generes un objeto de la clase hija, el constructor llamará al método de la clase hija, y probablemente
                no ejectuarás el código de la clase padre o estarás trabajando con un objeto que no fue correctamente inicializad         
                 super("CreateJframe");
                setTitle("CreateJFrameDemo");
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                setMinimumSize(new Dimension(400,300));
                setLocationRelativeTo(null);*/

            private CreateJFrameDemo(){ // se coloca en privado para evitar instanciar con el constructor

            }

            public static void main(String[] args) {
                SwingUtilities.invokeLater(new Runnable() {
                    @Override
                    public void run() {
                       CreateJFrameDemo frame = CreateJFrameDemo.newInstance();
                       frame.setVisible(true);
                    }
                });
            }
        }
