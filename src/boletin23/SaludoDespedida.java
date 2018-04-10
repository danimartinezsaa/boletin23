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
public class SaludoDespedida implements ActionListener{

    JFrame marco;
    JPanel panel;
    JButton bsaludo,bdespedida;
    JLabel lsaludo,ldespedida;

    public SaludoDespedida(){
        marco=new JFrame("CURSO DAM");
        panel=new JPanel();
        bsaludo=new JButton("Saludo");
        bdespedida=new JButton("Despedida");
        lsaludo=new JLabel("Un saludo a DAM");
        ldespedida=new JLabel("Final del programa");
        

        //Características
        bsaludo.addActionListener(this); //Añadimos listener al desencadenante del evento.
        bdespedida.addActionListener(this);
        
        marco.setSize(400, 200);
        panel.add(bsaludo);
        panel.add(bdespedida);
        panel.add(lsaludo);
        panel.add(ldespedida);
        marco.add(panel);

        //Valores
        ldespedida.setVisible(false);
        lsaludo.setVisible(false);
        marco.setLocationRelativeTo(marco);
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
        public void actionPerformed(ActionEvent e){
            Object boton=e.getSource();
            if(boton==bsaludo)
                lsaludo.setVisible(true);
            else
                ldespedida.setVisible(true);
    }
}