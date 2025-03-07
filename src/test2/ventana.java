package test2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana frame = new ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);{
			
			
			
		}
		
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		Font fuente= new Font("Serif",Font.ITALIC,80);
		Graphics2D pincel = (Graphics2D) g.create();
		
		pincel.setStroke(new BasicStroke(5));
		
		pincel.drawRect(100,100, 80, 80);
		
		pincel.drawLine(0, 0, 800, 800);
		
		pincel.setColor(Color.green);
		
		pincel.setFont(new Font("Serif",Font.ITALIC,40));
		pincel.drawString("hello world", 400, 100);

		
		pincel.setColor(Color.blue);
		pincel.setFont(fuente);
		pincel.drawString("also", 150, 400);
		
		int[] x= {400,350,450};
		int[] y= {200,250,250};

		pincel.drawPolygon(x,y, 3);
		
		try {
			BufferedImage image = ImageIO.read(new File("imagen.png"));
			pincel.drawImage(image, 0, 500, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pincel.drawOval(400, 400, 100, 100);
		
		pincel.fillOval(500, 500, 100, 100);
		
		pincel.setColor(Color.red);
		pincel.fillArc(600, 200, 100, 100, 0, 180);
		
		pincel.setColor(Color.black);
		pincel.setStroke(new BasicStroke(7));
		pincel.drawLine(604, 250, 696, 250);
		
		pincel.setColor(Color.white);
		pincel.fillArc(600, 200, 100, 100, 0, -180);
	}
}
