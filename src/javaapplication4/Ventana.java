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
	
		pincel.setColor(new Color(162, 240, 255));
		pincel.fillRect(0, 0, 500, 500);				//fondo 
		
		pincel.setColor(new Color(177, 111, 59));
		pincel.fillRect(20, 450, 500, 50);				//fondo 
		
		pincel.setColor(new Color(252, 149, 89)); //fondo3
		pincel.fillRect(20, 430, 500, 20);	
			
		pincel.setColor(new Color(113, 194, 255));
		pincel.fillRect(150, 300, 90, 130);
		
		pincel.setColor(new Color(255, 192, 181));
		pincel.fillRect(100, 340, 90, 90);	
		
		pincel.setColor(new Color(0, 124, 0));
		pincel.fillRect(330, 350, 60, 80);
		
		pincel.setColor(new Color(0, 124, 0));
		pincel.fillRect(320, 330, 80, 30);

		pincel.setStroke(new BasicStroke(3));
		pincel.setColor(new Color(99, 61, 32));
		pincel.drawLine(20, 450, 500, 450);
		
		pincel.drawLine(20, 470, 500, 470);
		
		pincel.drawLine(20, 490, 500, 490);
		
		pincel.drawLine(20, 500, 20, 450);
		pincel.drawLine(40, 500, 40, 450);
		pincel.drawLine(60, 500, 60, 450);
		pincel.drawLine(80, 500, 80, 450);
		pincel.drawLine(100, 500, 100, 450);
		pincel.drawLine(120, 500, 120, 450);
		pincel.drawLine(140, 500, 140, 450);
		pincel.drawLine(160, 500, 160, 450);
		pincel.drawLine(180, 500, 180, 450);
		pincel.drawLine(200, 500, 200, 450);
		pincel.drawLine(220, 500, 220, 450);
		pincel.drawLine(240, 500, 240, 450);
		pincel.drawLine(260, 500, 260, 450);
		pincel.drawLine(280, 500, 280, 450);
		pincel.drawLine(300, 500, 300, 450);
		pincel.drawLine(320, 500, 320, 450);
		pincel.drawLine(340, 500, 340, 450);
		pincel.drawLine(360, 500, 360, 450);
		pincel.drawLine(380, 500, 380, 450);
		pincel.drawLine(400, 500, 400, 450);
		pincel.drawLine(420, 500, 420, 450);
		pincel.drawLine(440, 500, 440, 450);
		pincel.drawLine(460, 500, 460, 450);
		pincel.drawLine(480, 500, 480, 450);

		pincel.setColor(new Color(255, 137, 84));
		pincel.fillRect(120, 60, 50, 50);
		pincel.fillRect(170, 60, 50, 50);
		pincel.fillRect(50, 140, 50, 50);
		

		pincel.fillOval(20, 380, 70, 50);
		pincel.setColor(new Color(33, 131, 4));
		pincel.setColor(new Color(0, 0, 0));
		pincel.setStroke(new BasicStroke(2));

		pincel.drawLine(170, 60, 170, 110);


	}
}
