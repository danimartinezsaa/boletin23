/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin23;

import java.awt.Color;
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
public class Encender implements ActionListener{

    JFrame marco;
    JPanel panel;
    JButton bencender;
    JLabel msn;

    public Encender(){
        marco=new JFrame("Probando eventos");
        panel=new JPanel();
        bencender=new JButton("Encender");
        msn=new JLabel("Encendiste el botón");

        //Características
        bencender.addActionListener(this); //Añadimos listener al desencadenante del evento.

        marco.setSize(400, 200);
        panel.add(bencender);
        panel.add(msn);
        marco.add(panel);

        //Valores
        msn.setVisible(false);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
        public void actionPerformed(ActionEvent e){
            msn.setVisible(true);
    }
}
