/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Ventana extends JFrame{
    
    
     public Ventana(String titulo){
         this.setTitle(titulo);
         this.setSize(400, 500);
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.add(Calculadora());
         this.setVisible(true);
         

     }

        public JPanel Calculadora(){
            JPanel mipanel = new JPanel();
            mipanel.setLayout(new BorderLayout(20,20));
            mipanel.setBackground(Color.GRAY);
            mipanel.setOpaque(true);
            
            JLabel label = new JLabel();
            label.setBackground(Color.WHITE);
            label.setPreferredSize(new Dimension(400, 50));
            label.setOpaque(true);
            
            mipanel.add(label,BorderLayout.NORTH);
            
            JPanel botones = new JPanel();
            botones.setBackground(Color.gray);
            botones.setLayout(new GridLayout(4,3,10,10));
            
            mipanel.add(botones,BorderLayout.CENTER);
            
            JPanel botones2= new JPanel();
            botones2.setBackground(Color.gray);
            botones2.setLayout(new GridLayout(6,1,5,5));

            
            
            mipanel.add(botones2,BorderLayout.EAST);
            
            JButton[] arregloBotones = new JButton[10];
            int i=9;
            for(JButton boton:arregloBotones){
                
                boton = new JButton(""+i);
                i--;
                botones.add(boton);
                boton.setBackground(Color.black);
                boton.setForeground(Color.white);
            }
            JButton botonDot= new JButton(".");
            botones.add(botonDot);
            botonDot.setBackground(Color.black);
            botonDot.setForeground(Color.white);
            
            JButton[] arregloBotones2 = new JButton[6];
            
            for (int j = 0; j < arregloBotones2.length; j++) {
                arregloBotones2[j]= new JButton();
                botones2.add(arregloBotones2[j]);
             arregloBotones2[j].setBackground(Color.yellow);
            arregloBotones2[j].setForeground(Color.black);
            }
            arregloBotones2[0].setText("+");
            arregloBotones2[1].setText("-");
            arregloBotones2[2].setText("*");
            arregloBotones2[3].setText("/");
            arregloBotones2[4].setText("=");
            arregloBotones2[5].setText("CE");
            

            
            return mipanel;
        }
    
     
}
