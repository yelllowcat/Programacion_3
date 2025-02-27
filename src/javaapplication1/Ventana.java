/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author david
 */
public class Ventana extends JFrame implements ActionListener{
    private JMenuBar barra;
    private JMenu menu1,menu2;
    
    private JMenuItem item1,item2;
    
    public Ventana(String title) {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle(title);
        this.setSize(500, 500);
        this.setLocationRelativeTo(null);
        this.add(login());
        this.setJMenuBar(menu());
        this.setVisible(true);
    }
    
    
    public JPanel login(){
        JPanel panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setOpaque(true);
        panel.setSize(500, 500);
        panel.setLocation(0, 0);
        panel.setLayout(null);
        
        JLabel imagen = new JLabel(new ImageIcon("fondo.jpg"));
        imagen.setBounds(0,0,500,500);
        
        
        
        JLabel acceder = new JLabel(" Inicio de sesion");
        acceder.setSize(300, 70);
        acceder.setLocation(100, 30);
        acceder.setHorizontalAlignment(JLabel.CENTER);
        acceder.setFont(new Font("Serif",Font.BOLD,24));
        acceder.setForeground(Color.WHITE);
        
        JLabel nameUser = new JLabel("NOMBRE DE USUARIO");
        nameUser.setSize(300, 50);
        nameUser.setLocation(100, 110);
        nameUser.setForeground(Color.black);
        nameUser.setFont(new Font("Serif",Font.ITALIC,12));
        
        JTextField campoUsuario = new JTextField();
        campoUsuario.setLocation(100, 160);
        campoUsuario.setSize(300,40);
        campoUsuario.setBackground(Color.white);
        campoUsuario.setOpaque(true);
        
        JLabel contrasena = new JLabel("CONTRASENA");
        contrasena.setSize(300, 50);
        contrasena.setLocation(100, 220);
        contrasena.setForeground(Color.black);
        contrasena.setFont(new Font("Serif",Font.ITALIC,12));
        
        JTextField campoContrasena = new JTextField();
        campoContrasena.setLocation(100, 270);
        campoContrasena.setSize(300,40);
        campoContrasena.setBackground(Color.white);
        campoContrasena.setOpaque(true);

       ImageIcon user = new ImageIcon("user.png");
        JLabel userLogo = new JLabel(user);
        userLogo.setBounds(50, 150, 50, 50);
        
        ImageIcon candado = new ImageIcon("candado.png");
        JLabel password = new JLabel(candado);
        password.setBounds(50, 260, 50, 50);
        


        
        JButton botonAcceder = new JButton("Acceder");
        botonAcceder.setBounds(150, 350, 200, 50);
        
        
        
        
        
        
        panel.add(imagen);
        imagen.add(userLogo);
        imagen.add(password);
        imagen.add(campoContrasena);
        imagen.add(acceder);
        imagen.add(nameUser);
        imagen.add(campoUsuario);
        imagen.add(contrasena);
        imagen.add(botonAcceder);
        
        
        return panel;
    }
    
     
    
    public JMenuBar menu(){

        JMenuBar barra = new JMenuBar();

         menu1 = new JMenu("Archivo");
         menu2 = new JMenu("Ayuda");

         item1 = new JMenuItem("Abrir");
         item2 = new JMenuItem("Nuevo");
         
         item1.addActionListener(this);
         item2.addActionListener(this);

         menu1.add(item1);
         menu1.add(item2);

        barra.add(menu1);
        barra.add(menu2);
        
        
        
        return barra;
}

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== item1) {
            JOptionPane.showConfirmDialog(null, "Abrir el explorador de archivos");
            
        }
        if (e.getSource()== item2) {
        JOptionPane.showInputDialog("Nombre del archivo");
            
        }
    }
      
   
  

}
