/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class Ventana extends JFrame{
    public Ventana(String title) {
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(title);
        this.setSize(1000, 500);
        
       this.add(login());
      //  this.add(singUp());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setVisible(true);
         
    }
    
    public JPanel login(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setOpaque(true);
        panel.setSize(500, 500);
        panel.setLocation(0, 0);
        panel.setLayout(null);
        
        JLabel imagen = new JLabel(new ImageIcon("login.jpg"));
      
        imagen.setBounds(0,0,500,500);
        
        
        
        JLabel acceder = new JLabel(" Inicio de sesion");
        acceder.setSize(300, 70);
        acceder.setLocation(100, 30);
        acceder.setHorizontalAlignment(JLabel.CENTER);
        acceder.setFont(new Font("Serif",Font.BOLD,24));
        acceder.setForeground(Color.WHITE);
        
        JLabel nameUser = new JLabel("NOMBRE DE USUARIO");
        nameUser.setSize(300, 50);
        nameUser.setLocation(100, 150);
        nameUser.setForeground(Color.white);
        nameUser.setFont(new Font("Serif",Font.ITALIC,12));
        
        JTextField campoUsuario = new JTextField();
        campoUsuario.setLocation(100, 200);
        campoUsuario.setSize(300,40);
        campoUsuario.setBackground(Color.white);
        campoUsuario.setOpaque(true);
        
        JLabel contrasena = new JLabel("CONTRASENA");
        contrasena.setSize(300, 50);
        contrasena.setLocation(100, 260);
        contrasena.setForeground(Color.white);
        contrasena.setFont(new Font("Serif",Font.ITALIC,12));
        
        JTextField campoContrasena = new JTextField();
        campoContrasena.setLocation(100, 310);
        campoContrasena.setSize(300,40);
        campoContrasena.setBackground(Color.white);
        campoContrasena.setOpaque(true);

       

        
        JButton botonAcceder = new JButton("Acceder");
        botonAcceder.setBounds(150, 400, 200, 50);
        
                
        
        panel.add(botonAcceder);
        panel.add(imagen);
        panel.add(campoContrasena);
        panel.add(acceder);
        panel.add(nameUser);
        panel.add(campoUsuario);
        panel.add(contrasena);
        
        return panel;
    }
    
    public JPanel singUp(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.setOpaque(true);
        panel.setSize(500, 500);
        panel.setLocation(500, 0);
        panel.setLayout(null);
        
        
        
        
        JLabel acceder = new JLabel(" Inicio de sesion");
        acceder.setSize(300, 70);
        acceder.setLocation(100, 30);
        acceder.setHorizontalAlignment(JLabel.CENTER);
        acceder.setFont(new Font("Serif",Font.BOLD,24));
        acceder.setForeground(Color.WHITE);
        
        JLabel nameUser = new JLabel("NOMBRE DE USUARIO");
        nameUser.setSize(300, 50);
        nameUser.setLocation(100, 150);
        nameUser.setForeground(Color.white);
        nameUser.setFont(new Font("Serif",Font.ITALIC,12));
        
        JTextField campoUsuario = new JTextField();
        campoUsuario.setLocation(100, 200);
        campoUsuario.setSize(300,40);
        campoUsuario.setBackground(Color.white);
        campoUsuario.setOpaque(true);
        
        JLabel contrasena = new JLabel("CONTRASENA");
        contrasena.setSize(300, 50);
        contrasena.setLocation(100, 260);
        contrasena.setForeground(Color.white);
        contrasena.setFont(new Font("Serif",Font.ITALIC,12));
        
        JTextField campoContrasena = new JTextField();
        campoContrasena.setLocation(100, 310);
        campoContrasena.setSize(300,40);
        campoContrasena.setBackground(Color.white);
        campoContrasena.setOpaque(true);

       

        
        JButton botonAcceder = new JButton("Acceder");
        botonAcceder.setBounds(150, 400, 200, 50);
        
                
        
        panel.add(botonAcceder);
        panel.add(campoContrasena);
        panel.add(acceder);
        panel.add(nameUser);
        panel.add(campoUsuario);
        panel.add(contrasena);
        
        return panel;
}
    

}
