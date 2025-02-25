/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class Ventana extends JFrame{
    public Ventana(String title) {
        this.setVisible(true);
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(title);
        this.setSize(500, 800);
        
        this.add(login());
        
    }
    
    public JPanel login(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setOpaque(true);
        panel.setSize(500, 500);
        panel.setLocation(0, 0);
        panel.setLayout(null);
        
        JLabel acceder = new JLabel("ACCEDER");
        acceder.setSize(300, 70);
        acceder.setOpaque(true);
        acceder.setBackground(Color.RED);
        acceder.setLocation(100, 30);
        acceder.setHorizontalAlignment(JLabel.CENTER);
        acceder.setFont(new Font("Serif",Font.BOLD,24));
        acceder.setForeground(Color.WHITE);
        
        JLabel nameUser = new JLabel("NOMBRE DE USUARIO");
        nameUser.setSize(300, 50);
        nameUser.setLocation(20, 150);
        nameUser.setForeground(Color.black);
        nameUser.setFont(new Font("Serif",Font.BOLD,18));
        
        JTextField campoUsuario = new JTextField();
        campoUsuario.setLocation(20, 200);
        campoUsuario.setSize(300,40);
        campoUsuario.setBackground(Color.white);
        campoUsuario.setOpaque(true);
        
        JLabel contrasena = new JLabel("CONTRASENA");
        contrasena.setSize(300, 50);
        contrasena.setLocation(20, 270);
        contrasena.setForeground(Color.black);
        contrasena.setFont(new Font("Serif",Font.BOLD,18));
        
        JTextField campoContrasena = new JTextField();
        campoContrasena.setLocation(20, 340);
        campoContrasena.setSize(300,40);
        campoContrasena.setBackground(Color.white);
        campoContrasena.setOpaque(true);

        JCheckBox checkbox = new JCheckBox("Recordarme");
        checkbox.setBounds(20, 380,150,30);
        checkbox.setBackground(Color.gray);
        checkbox.setFont(new Font("Serif",Font.BOLD,12));

        
        JLabel olvidoContrasena = new JLabel("¿Olvido la contraseña?");
        olvidoContrasena.setSize(150,30);
        olvidoContrasena.setLocation(180, 380);
        olvidoContrasena.setForeground(Color.BLACK);
        olvidoContrasena.setFont(new Font("Serif",Font.ITALIC,12));

        JButton botonAcceder = new JButton("Acceder");
        botonAcceder.setBounds(80, 450, 100, 50);
        
                
        
        panel.add(botonAcceder);
        panel.add(olvidoContrasena);
        panel.add(checkbox);
        panel.add(campoContrasena);
        panel.add(acceder);
        panel.add(nameUser);
        panel.add(campoUsuario);
        panel.add(contrasena);
        
        return panel;
    }

}
