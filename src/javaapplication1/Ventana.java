package javaapplication1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.GrayFilter;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	public Ventana(){
		// TODO Auto-generated constructor stub
		this.setSize(500,500);
	//	this.dibujoCasa();
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}
	public JPanel dibujoCasa() {
		JPanel miPanel = new JPanel();
		return miPanel;
	}
	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D pincel = (Graphics2D) g.create();
		pincel.setColor(new Color(219, 255, 248));
		pincel.fillRect(0, 0, 500, 500);				//fondo azul
		
		pincel.setColor(new Color(190, 167, 96));
		pincel.fillRect(0, 310,500, 25);			//valla trasera
		
		pincel.setColor(new Color(190, 167, 96));
		pincel.fillRect(0, 260,500, 25);			//valla trasera
		

		pincel.setColor(new Color(227, 200, 116)); //valla delantera
		pincel.fillRect(0, 230,25, 160);
		
		pincel.setColor(new Color(227, 200, 116)); // valla delantera
		pincel.fillRect(40, 230,25, 160);
		
		pincel.setColor(new Color(227, 200, 116)); //valla delantera
		pincel.fillRect(80, 230,25, 160);
	
		

		pincel.setColor(new Color(227, 200, 116));
		pincel.fillRect(400, 230,25, 160);
		
		pincel.setColor(new Color(227, 200, 116));
		pincel.fillRect(440, 230,25, 160);
		
		pincel.setColor(new Color(227, 200, 116));
		pincel.fillRect(480, 230,25, 160);
	
		
		pincel.setColor(new Color(162,120,88,255)); //suelo cafe
		pincel.fillRect(0, 485,500, 15);			
		
		pincel.setColor(new Color(255, 252, 201)); //suelo crema
		pincel.fillRect(0, 445,500,40);
		
		pincel.setColor(new Color(76, 131, 64)); // suelo verde claro
		pincel.fillRect(0, 405,500, 40);
				
		
		pincel.setColor(new Color(35, 59, 30)); //suelo verde oscur
		pincel.fillRect(0, 390,500, 15);
		

		pincel.setColor(new Color(122, 122, 122)); //chimenea
		pincel.fillRect(290, 80,50, 70);
	
		
		pincel.setColor(new Color(122, 122, 122)); //base casa gris
		pincel.fillRect(100, 330,300, 60);
		
		pincel.setColor(new Color(232, 211, 77)); // casa anarukka
		pincel.fillRect(110, 150,280, 180);
		
		pincel.setColor(new Color(100, 70, 5));  //puerta
		pincel.fillRect(150, 170,70, 160);
		
		pincel.setColor(new Color(168, 231, 220)); //ventana
		pincel.fillRect(270, 180,80, 80);
		
		int[] x= {100,165,410};
		int[] y= {150,40,150};
		pincel.setColor(new Color(255, 0, 0)); // techo
		pincel.fillPolygon(x, y, 3);
		
		
		
		
		
		
		//
		

	}
}
