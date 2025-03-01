/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

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
            mipanel.setLayout(new BorderLayout());
            mipanel.setBackground(Color.black);
            mipanel.setOpaque(true);
            
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout(0,0,20));
            panel.setBackground(Color.white);
            panel.setOpaque(true);
            mipanel.add(panel,BorderLayout.CENTER);
            
            JPanel bordeBot = new JPanel();
            bordeBot.setBackground(Color.white);
            mipanel.add(bordeBot,BorderLayout.SOUTH);
                    
            
            
            JLabel label = new JLabel("Interes");
            label.setFont(new Font("Serif",Font.ITALIC,26));
            label.setForeground(Color.pink);
            label.setBackground(Color.white);
           // label.setPreferredSize(new Dimension(40, 50));
            label.setOpaque(true);
            mipanel.add(label,BorderLayout.NORTH);
            
            JPanel verde = new JPanel();
            verde.setLayout(new BorderLayout());
            verde.setPreferredSize(new Dimension(400, 250));
            verde.setBackground(Color.green);
            verde.setBorder(BorderFactory.createMatteBorder(5, 15, 5, 15, Color.white));
            panel.add(verde,BorderLayout.CENTER);
            
            
            
            JLabel calcularInteres = new JLabel("Calcular Interes");
            verde.add(calcularInteres,BorderLayout.NORTH);
            
            JPanel verdeBottom = new JPanel();
            verdeBottom.setBackground(Color.green);
            verde.add(verdeBottom,BorderLayout.CENTER);
            
            verdeBottom.setLayout(new GridLayout(4, 2,10,20));
            
            JLabel capital = new JLabel("Capital:");
            capital.setBorder(BorderFactory.createMatteBorder(5, 100, 5, 0, Color.green));
            verdeBottom.add(capital);
            
            JTextField fieldCapital = new JTextField();
            fieldCapital.setBackground(Color.white);
            fieldCapital.setOpaque(true);
            fieldCapital.setBorder(BorderFactory.createMatteBorder(5, 15, 5, 15, Color.green));
            verdeBottom.add(fieldCapital);
            
             JLabel tiempo = new JLabel("Tiempo:");
             tiempo.setBorder(BorderFactory.createMatteBorder(5, 100, 5, 0, Color.green));
            verdeBottom.add(tiempo);
            
            JTextField fieldTiempo = new JTextField();
            fieldTiempo.setBackground(Color.white);
            fieldTiempo.setOpaque(true);
            fieldTiempo.setBorder(BorderFactory.createMatteBorder(5, 15, 5, 15, Color.green));
            verdeBottom.add(fieldTiempo);
            
            JLabel tasa = new JLabel("Tasa interes:");
            tasa.setBorder(BorderFactory.createMatteBorder(5, 100, 5, 0, Color.green));
            verdeBottom.add(tasa);
            
            JTextField fieldTasa = new JTextField();
            fieldTasa.setBackground(Color.white);
            fieldTasa.setOpaque(true);
            fieldTasa.setBorder(BorderFactory.createMatteBorder(5, 15, 5, 15, Color.green));
            verdeBottom.add(fieldTasa);
            
            JButton calcular = new JButton("Calcular");
            calcular.setBackground(Color.black);
            calcular.setForeground(Color.white);
            calcular.setBorder(BorderFactory.createMatteBorder(5, 30, 5, 0, Color.green));

            verdeBottom.add(calcular);
            
            JButton cancelar = new JButton("Cancelar");
            cancelar.setBackground(Color.BLACK);
            cancelar.setForeground(Color.white);
            cancelar.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 30, Color.green));
            verdeBottom.add(cancelar);
                    
            
            JPanel rosa = new JPanel();
            rosa.setPreferredSize(new Dimension(400, 100));
            rosa.setBackground(Color.pink);
            rosa.setBorder(BorderFactory.createMatteBorder(5, 15, 5, 15, Color.white));
            rosa.setLayout(new GridLayout(2, 2,10,20));
            panel.add(rosa,BorderLayout.SOUTH);
            
             JLabel Interes = new JLabel("Interes:");
             Interes.setBorder(BorderFactory.createMatteBorder(5, 100, 5, 0, Color.pink));
            rosa.add(Interes);
            
            JTextField fieldInteres = new JTextField();
            fieldInteres.setBackground(Color.white);
            fieldInteres.setOpaque(true);
            fieldInteres.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 100, Color.pink));
            rosa.add(fieldInteres);
            
            JLabel monto = new JLabel("Monto:");
            monto.setBorder(BorderFactory.createMatteBorder(5, 100, 5, 0, Color.pink));
            rosa.add(monto);
            
            JTextField fieldMonto = new JTextField();
            fieldMonto.setBackground(Color.white);
            fieldMonto.setOpaque(true);
            fieldMonto.setBorder(BorderFactory.createMatteBorder(5, 0, 5, 100, Color.pink));
            rosa.add(fieldMonto);
            
            
            JPanel botones2= new JPanel();
            botones2.setBackground(Color.gray);
            botones2.setLayout(new GridLayout());
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        return mipanel;
     }
}