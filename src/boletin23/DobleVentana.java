/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author dani
 */
public class DobleVentana implements ActionListener{

    JFrame marco1;
    JPanel panel1;
    JFrame marco2;
    JPanel panel2;
    JButton boton;

    public DobleVentana(){
        marco1=new JFrame("Ventana 1");
        panel1=new JPanel();
        marco2=new JFrame("Ventana 2");
        boton=new JButton("Abrir ventana 2");

        

        //Características
        boton.addActionListener(this); //Añadimos listener al desencadenante del evento.
        
        marco1.setSize(400, 200);
        marco2.setSize(400,200);
        panel1.add(boton);
        marco1.add(panel1);

        //Valores
        marco2.setVisible(false);
        marco1.setLocationRelativeTo(marco1);
        marco1.setVisible(true);
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
        public void actionPerformed(ActionEvent e){
            marco2.setVisible(true);
    }
}
