/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author david
 */
public class Ventana extends JFrame {
    private JLabel pantalla;
    private String operador = "";
    private double num1 = 0, num2 = 0;
    private boolean nuevoNumero = true;

    public Ventana(String title) {
        this.setTitle(title);
        this.setSize(270, 410);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.add(calculadora());
        this.setVisible(true);
        
    }
    
    public JPanel calculadora(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setOpaque(true);
        panel.setSize(500, 470);
        panel.setLocation(0, 0);
        panel.setLayout(null);
        
        pantalla = new JLabel();
        pantalla.setBounds(20, 20, 230, 40);
        pantalla.setBackground(Color.white);
        pantalla.setOpaque(true);
        
        JButton botonCE = new JButton("CE");
        botonCE.setBounds(20, 70, 50, 50);
        botonCE.addActionListener(new Funcionalidad());
        
        JButton boton7 = new JButton("7");
        boton7.setBounds(20, 130, 50, 50);
        boton7.addActionListener(new Funcionalidad());
        
        JButton boton4 = new JButton("4");
        boton4.setBounds(20, 190, 50, 50);
        boton4.addActionListener(new Funcionalidad());

        
        JButton boton1 = new JButton("1");
        boton1.setBounds(20, 250, 50, 50);
        boton1.addActionListener(new Funcionalidad());
        
        JButton boton0 = new JButton("0");
        boton0.setBounds(20, 310, 50, 50);
        boton0.addActionListener(new Funcionalidad());
        
        JButton botonVacio = new JButton();
        botonVacio.setBounds(80, 70, 170, 50);
        botonVacio.addActionListener(new Funcionalidad());
        
        JButton boton8 = new JButton("8");
        boton8.setBounds(80, 130, 50, 50);
        boton8.addActionListener(new Funcionalidad());
        
        JButton boton5 = new JButton("5");
        boton5.setBounds(80, 190, 50, 50);
        boton5.addActionListener(new Funcionalidad());
        
        JButton boton2 = new JButton("2");
        boton2.setBounds(80, 250, 50, 50);
        boton2.addActionListener(new Funcionalidad());
       
        JButton botonDot = new JButton(".");
        botonDot.setBounds(80, 310, 50, 50);
        botonDot.addActionListener(new Funcionalidad());
        
        JButton boton9 = new JButton("9");
        boton9.setBounds(140, 130, 50, 50);
        boton9.addActionListener(new Funcionalidad());
       
        JButton boton6 = new JButton("6");
        boton6.setBounds(140, 190, 50, 50);
        boton6.addActionListener(new Funcionalidad());
        
        JButton boton3 = new JButton("3");
        boton3.setBounds(140, 250, 50, 50);
        boton3.addActionListener(new Funcionalidad());
        
        JButton botonIgual = new JButton("=");
        botonIgual.setBounds(140, 310, 50, 50);
        botonIgual.addActionListener(new Funcionalidad());
       
        JButton botonDiv = new JButton("/");
        botonDiv.setBounds(200, 130, 50, 50);
        botonDiv.addActionListener(new Funcionalidad());
        
        JButton botonMul = new JButton("*");
        botonMul.setBounds(200, 190, 50, 50);
        botonMul.addActionListener(new Funcionalidad());
        
        JButton botonMenos = new JButton("-");
        botonMenos.setBounds(200, 250, 50, 50);
        botonMenos.addActionListener(new Funcionalidad());
        
        JButton botonMas = new JButton("+");
        botonMas.setBounds(200, 310, 50, 50);
        botonMas.addActionListener(new Funcionalidad());
        
        panel.add(botonMenos);
        panel.add(botonMas);
        panel.add(botonIgual);
        panel.add(botonMul);
        panel.add(botonDiv);
        panel.add(boton3);
        panel.add(boton6);
        panel.add(boton9);
        panel.add(boton8);
        panel.add(boton5);
        panel.add(boton2);
        panel.add(botonDot);
        panel.add(botonVacio);
        panel.add(boton4);
        panel.add(boton1);
        panel.add(boton0);
        panel.add(boton7);
        panel.add(botonCE);
        panel.add(pantalla);
        return panel;
    }
    
    public class Funcionalidad implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
String textoBoton = ((JButton) e.getSource()).getText();

            switch (textoBoton) {
                case "CE":
                    pantalla.setText("0");
                    num1 = num2 = 0;
                    operador = "";
                    nuevoNumero = true;
                    break;
                case "=":
                    num2 = Double.parseDouble(pantalla.getText());
                    calculo();
                    operador = "";
                    nuevoNumero = true;
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                    num1 = Double.parseDouble(pantalla.getText());
                    operador = textoBoton;
                    nuevoNumero = true;
                    break;
                default: // Números y el punto
                    if (nuevoNumero) {
                        pantalla.setText(textoBoton);
                        nuevoNumero = false;
                    } else {
                        pantalla.setText(pantalla.getText() + textoBoton);
                    }
                    break;
            }
        }
        }
        
    
    private void calculo(){
        double resultado = 0;
        switch (operador) {
            case "+": resultado = num1 + num2; break;
            case "-": resultado = num1 - num2; break;
            case "*": resultado = num1 * num2; break;
            case "/": resultado = num1 / num2; break;
    }
          pantalla.setText(String.valueOf(resultado));
    }
    }
    

