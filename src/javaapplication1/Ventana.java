/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author david
 */
public class Ventana extends JFrame{
    
    Image image;
    image =new ImageIcon(getClass().getResource("/imagenes/login.jpg")).getImage());
    
     public Ventana(String titulo){
         this.setTitle(titulo);
         this.setSize(400, 500);
         this.setIconImage(new ImageIcon(getClass().getResource("/imagenes/login.jpg")).getImage());

         this.setVisible(true);
         
         System.out.println(getClass().getResource("/imagenes/login.jpg"));

     }

    
     
}
