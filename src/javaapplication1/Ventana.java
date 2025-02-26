/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ButtonGroup;
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
        this.setSize(1000, 800);
        
        this.add(login());
        this.add(registro());
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         this.setVisible(true);

    }
    
    public JPanel login(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setOpaque(true);
        panel.setSize(500, 800);
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

    public JPanel registro(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
        panel.setOpaque(true);
        panel.setSize(500, 800);
        panel.setLocation(0, 0);
        panel.setLayout(null);
        
        JLabel acceder = new JLabel("Registro");
        acceder.setSize(300, 70);
        acceder.setOpaque(true);
        acceder.setBackground(Color.black);
        acceder.setLocation(610, 30);
        acceder.setHorizontalAlignment(JLabel.CENTER);
        acceder.setFont(new Font("Serif",Font.BOLD,24));
        acceder.setForeground(Color.WHITE);
        
        JLabel nameUser = new JLabel("NOMBRE DE USUARIO");
        nameUser.setSize(450, 50);
        nameUser.setOpaque(true);
        nameUser.setHorizontalAlignment(JLabel.CENTER);
        nameUser.setLocation(530, 145);
        nameUser.setBackground(Color.YELLOW);
        nameUser.setForeground(Color.black);
        nameUser.setFont(new Font("Serif",Font.BOLD,18));
        
        JTextField campoUsuario = new JTextField();
        campoUsuario.setLocation(530, 200);
        campoUsuario.setSize(450,40);
        campoUsuario.setBackground(Color.white);
        campoUsuario.setOpaque(true);
        
        JLabel contrasena = new JLabel("BIO");
        contrasena.setSize(300, 50);
        contrasena.setLocation(740, 240);
        contrasena.setForeground(Color.black);
        contrasena.setFont(new Font("Serif",Font.BOLD,18));
        
        JTextField campoContrasena = new JTextField();
        campoContrasena.setLocation(530, 290);
        campoContrasena.setSize(450,80);
        campoContrasena.setBackground(Color.white);
        campoContrasena.setOpaque(true);
        
        JLabel preferencias = new JLabel("PREFERENCIAS");
        preferencias.setSize(300, 50);
        preferencias.setLocation(690, 370);
        preferencias.setForeground(Color.black);
        preferencias.setFont(new Font("Serif",Font.BOLD,16));
        
        JRadioButton dulce = new JRadioButton("Dulces");
        dulce.setBounds(530, 430, 100, 20);
        dulce.setBackground(null);
        dulce.setFont(new Font("Serif",Font.BOLD,18));
        dulce.setForeground(Color.BLACK);
        
        JRadioButton salado = new JRadioButton("Salado");
        salado.setBounds(630, 430, 100, 20);
        salado.setBackground(null);
        salado.setFont(new Font("Serif",Font.BOLD,18));
        salado.setForeground(Color.BLACK);
        
        JRadioButton saludable = new JRadioButton("Saludable");
        saludable.setBounds(725, 430, 120, 20);
        saludable.setBackground(null);
        saludable.setFont(new Font("Serif",Font.BOLD,18));
        saludable.setForeground(Color.BLACK);
        
        ButtonGroup grupoPreferencias = new ButtonGroup();
        grupoPreferencias.add(dulce);
        grupoPreferencias.add(salado);
        grupoPreferencias.add(saludable);
        
        
        JLabel terminos = new JLabel("TERMINOS");
        terminos.setSize(450, 50);
        terminos.setOpaque(true);
        terminos.setHorizontalAlignment(JLabel.CENTER);
        terminos.setLocation(530, 460);
        terminos.setBackground(Color.YELLOW);
        terminos.setForeground(Color.black);
        terminos.setFont(new Font("Serif",Font.BOLD,18));
        
        JRadioButton aceptTerms = new JRadioButton("Acepto los terminos");
        aceptTerms.setBounds(530, 520, 200, 20);
        aceptTerms.setBackground(null);
        aceptTerms.setFont(new Font("Serif",Font.BOLD,16));
        aceptTerms.setForeground(Color.BLACK);
        
        JRadioButton rechazarTerms = new JRadioButton("No acepto los terminos");
        rechazarTerms.setBounds(750, 520, 240, 20);
        rechazarTerms.setBackground(null);
        rechazarTerms.setFont(new Font("Serif",Font.BOLD,16));
        rechazarTerms.setForeground(Color.BLACK);
        
        ButtonGroup grupoAceptar = new ButtonGroup();
        grupoAceptar.add(aceptTerms);
        grupoAceptar.add(rechazarTerms);

        
        JComboBox menu = new JComboBox();
        menu.addItem("Camino Real");
        menu.addItem("Pedregal");
        menu.addItem("Calafia");
        menu.setBounds(530, 550, 450, 30);
        menu.setForeground(Color.BLACK);
        
        JButton botonAcceder = new JButton("Crear cuenta");
        botonAcceder.setBounds(530, 600, 450, 60);
        botonAcceder.setFont(new Font("Serif",Font.BOLD,18));
        botonAcceder.setBackground(Color.white);

        panel.add(menu);
        panel.add(aceptTerms);
        panel.add(rechazarTerms);
        panel.add(terminos);
        panel.add(dulce);
        panel.add(salado);
        panel.add(saludable);
        panel.add(preferencias);
        panel.add(botonAcceder);
        panel.add(campoContrasena);
        panel.add(acceder);
        panel.add(nameUser);
        panel.add(campoUsuario);
        panel.add(contrasena);
        
        return panel;
    }
}
