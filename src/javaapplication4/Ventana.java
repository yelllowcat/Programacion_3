package javaapplication4;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.Stroke;

import javax.swing.GrayFilter;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {

	public Ventana(){
		// TODO Auto-generated constructor stub
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D pincel = (Graphics2D) g.create();
		

		
		
		pincel.setColor(new Color(38, 88, 156));
		pincel.fillRect(0, 0, 500, 500);				//fondo 
		
		
		
		pincel.setColor(new Color(175, 162, 106));
		pincel.fillRect(0, 450, 500, 50);				//fondo 
		
		
		pincel.setColor(new Color(255, 255, 255));  //color nube

		pincel.fillRoundRect(160, 360, 120, 25, 30, 30);
		pincel.fillRoundRect(60, 385, 120, 25, 30, 30); //nubes fondo izquierda
		pincel.fillRoundRect(170, 410, 120, 25, 30, 30);
		
		 //nubes derecha
		pincel.fillRoundRect(400, 360, 80, 25, 30, 30);
		pincel.fillRoundRect(390, 200, 80, 25, 30, 40);
		pincel.fillRoundRect(370, 225, 80, 25, 30, 30);

		
		pincel.setColor(new Color(80, 208, 67));
		pincel.fillRect(0, 430, 500, 20);	
		

		
		pincel.setColor(new Color(208, 245, 247));
		pincel.fillRect(210, 240, 90, 190);	//tubo2
		pincel.fillOval(210, 210, 90, 50);
		
		pincel.fillRect(300, 170, 90, 260);	//tubo2
		pincel.fillOval(300, 140, 90, 50);
		
		pincel.fillRect(20, 240, 90, 190);	//tubo2
		pincel.fillOval(20, 210, 90, 50);
		
		
		pincel.setColor(new Color(116, 158, 255));
		pincel.fillRect(-30, 380, 90, 50);			//tubo1
		
		pincel.fillOval(-30, 350, 90, 50);
			
		
		pincel.fillRect(210, 380, 120, 50);	//tubo2
		
		pincel.fillOval(210, 350, 120, 50);
		
		pincel.setColor(new Color(255, 255, 255));      //nube detras de cubos
		pincel.fillRoundRect(270, 325, 80, 25, 40, 40);
		
		
		pincel.setColor(new Color(116, 158, 255));

		pincel.fillRect(330, 310, 120, 120);	//tub3
		pincel.fillOval(330, 280, 120, 50);
		
		
		
		pincel.fillRect(480, 350, 90, 80);	//tubo4
		
		pincel.fillOval(480, 320, 90, 50);
		
		
		pincel.setColor(new Color(255, 255, 255));      //nube detras de cubos
		pincel.fillRoundRect(400, 415, 80, 25, 40, 40);
		
		pincel.setColor(new Color(80, 208, 67));
		pincel.fillRect(0, 430, 500, 20);	
		
		pincel.setColor(new Color(118, 102, 162)); //tuberia
		pincel.fillRect(250, 380, 50, 50);
		
		pincel.fillRect(245, 360, 60, 20);
		
		pincel.setStroke(new BasicStroke(2));
		pincel.setColor(Color.black); //tuberia contorno
		pincel.drawRect(250, 380, 50, 50);
		
		pincel.drawRect(245, 360, 60, 20);
		

		pincel.setColor(new Color(118, 102, 162)); //tuberia
		pincel.fillRect(470, 400, 50, 30);
		
		pincel.fillRect(465, 380, 60, 20);
		
		pincel.setStroke(new BasicStroke(2));
		pincel.setColor(Color.black); //tuberia contorno
		pincel.drawRect(470, 400, 50, 30);
		
		pincel.drawRect(465, 380, 60, 20);
		
		pincel.setColor(new Color(210, 210, 210));
		pincel.fillRect(440, 410, 20, 20);
		
		pincel.fillRect(440, 390, 20, 20);

		pincel.fillRect(440, 370, 20, 20);
		
		pincel.fillRect(440, 350, 20, 20);
		pincel.setColor(new Color(255, 255, 0)); 

		pincel.fillRect(460, 350, 20, 20);

		pincel.fillRect(480, 350, 20, 20);

		pincel.setStroke(new BasicStroke(2));
		pincel.setColor(Color.black); //contorno bloques grises
		
		pincel.drawLine(466, 357, 466, 362);
		pincel.drawLine(474, 357, 474, 362);;

		
		pincel.drawRect(440, 410, 20, 20);
		
		pincel.drawRect(440, 390, 20, 20);

		pincel.drawRect(440, 370, 20, 20);
		
		pincel.drawRect(440, 350, 20, 20);

		pincel.drawRect(460, 350, 20, 20);

		pincel.drawRect(480, 350, 20, 20);
		
		pincel.setColor(new Color(255, 255, 255)); 

	//	pincel.fillOval(-60, 300, 150, 30);
		
		pincel.fillRoundRect(110, 300, 140, 25, 30, 30);
		
		pincel.fillRoundRect(-40, 260, 120, 25, 30, 30);
		
		//puntos
		pincel.fillOval(70, 290, 15, 20);
		pincel.fillOval(70, 230, 15, 20);
		pincel.fillOval(40, 320, 15, 20);
		pincel.fillOval(55, 260, 15, 20);
		pincel.fillOval(260, 230, 15, 20);
		pincel.fillOval(230, 275, 15, 20);
		pincel.fillOval(230, 330, 15, 20);
		pincel.fillOval(320, 230, 15, 20);
		pincel.fillOval(350, 170, 15, 20);
		pincel.fillOval(350, 300, 15, 20);
		pincel.fillOval(400, 390, 15, 20);

	




	}
}
