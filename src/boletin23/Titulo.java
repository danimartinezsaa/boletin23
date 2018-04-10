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
public class Titulo implements ActionListener{

    JFrame marco;
    JPanel panel;
    JButton bprogramacion,bbases;

    public Titulo(){
        marco=new JFrame("CURSO DAM");
        panel=new JPanel();
        bprogramacion=new JButton("Programación");
        bbases=new JButton("Bases");

        //Características
        bprogramacion.addActionListener(this); //Añadimos listener al desencadenante del evento.
        bbases.addActionListener(this);
        
        marco.setSize(400, 200);
        panel.add(bprogramacion);
        panel.add(bbases);
        marco.add(panel);

        //Valores
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
        public void actionPerformed(ActionEvent e){
            Object boton=e.getSource();
            if(boton==bbases)
                marco.setTitle("Bases de datos");
            else
                marco.setTitle("Programación");
    }
}