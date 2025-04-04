package javaapplication1;


import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame implements KeyListener{
	public String letras []={"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Ñ","Z","X","C","V","B","N","M"};
	public JLabel[] labels ;
	  String[] palabras = {
	            "manzana", "banana", "cereza", "durazno", "uva", "fresa", "sandía", "kiwi", "mango", "papaya",
	            "piña", "pera", "naranja", "limón", "melón", "guayaba", "coco", "ciruela", "higo", "granada",
	            "zapote", "toronja", "arándano", "avellana", "castaña", "nuez", "almendra", "pistacho", "cacahuate", "chirimoya",
	            "tomate", "zanahoria", "lechuga", "espinaca", "brócoli", "coliflor", "pepino", "pimiento", "rábano", "berenjena",
	            "calabaza", "cebolla", "ajo", "apio", "betabel", "champiñón", "esparrago", "guisante", "lenteja", "garbanzo",
	            "arroz", "trigo", "avena", "cebada", "centeno", "maíz", "quinoa", "soja", "mijo", "sorgo",
	            "cordero", "cerdo", "pollo", "pavo", "res", "pescado", "salmón", "atún", "merluza", "trucha",
	            "langosta", "camarón", "pulpo", "calamar", "mejillón", "ostra", "almeja", "vieira", "caracol", "anguila",
	            "queso", "yogur", "mantequilla", "crema", "leche", "huevo", "miel", "azúcar", "sal", "pimienta",
	            "chocolate", "vainilla", "canela", "jengibre", "mostaza", "vinagre", "aceite", "salsa", "manteca", "levadura"
	        };
	  int random = (int)(Math.random() * 26 );

	public Ventana() {
		// TODO Auto-generated constructor stub
		labels = new JLabel[letras.length];
        setLayout(new GridLayout(3,9,5,5));
        addKeyListener(this);
        System.out.println(random);
        setTitle(palabras[random]);
		for (int i = 0; i < letras.length; i++) {
			labels[i] = new JLabel(letras[i]);
			labels[i].setHorizontalAlignment(JLabel.CENTER);
            labels[i].setVerticalAlignment(JLabel.CENTER);
			labels[i].setBorder(new LineBorder(Color.black));
			labels[i].setBackground(Color.gray);;
			labels[i].setOpaque(true); 
			add(labels[i]);
		}
		setBounds(500,500,800,300);

		setVisible(true);

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		 char letraPresionada = Character.toUpperCase(e.getKeyChar()); 
	        cambiarColor(letraPresionada, Color.YELLOW); 
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 char letraLiberada = Character.toUpperCase(e.getKeyChar());
	        cambiarColor(letraLiberada, Color.gray); 
		
	}
	 private void cambiarColor(char letra, Color color) {
	        for (int i = 0; i < letras.length; i++) {
	            if (letras[i].equals(String.valueOf(letra))) {
	                labels[i].setBackground(color);
	                break;
	            }
	        }
	    }
	
}
