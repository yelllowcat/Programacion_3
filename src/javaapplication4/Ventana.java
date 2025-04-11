package javaapplication4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;



public class Ventana extends JFrame  {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private DrawingPanel drawPanel;
    int seg=0;
    int x=200,y=200;
    private int actual=0;
    Timer timer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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

	public Ventana() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setBackground(new Color(28, 113, 216));
                JLabel label= new JLabel("0:00");
                panel_2.add(label);
		
		JPanel panel = new JPanel();
		panel_1.add(panel, BorderLayout.CENTER);
		panel.setBackground(new Color(0, 0, 0));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(28, 113, 216));
		panel_1.add(panel_3, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		panel_3.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				x=200;
				y=200;
				drawPanel.repaint();
                requestFocusInWindow(); 

			}
		});
		int delay = 10; //milliseconds
    ActionListener taskPerformer = new ActionListener() {
         public void actionPerformed(ActionEvent evt) {
          
 String [] split_string = label.getText().split(":");
            int mil = Integer.parseInt(split_string[1]);
               mil+=1;
				
				if(mil>=10) {
					seg++;
					mil=1;
				}
				label.setText(seg+":"+mil+"");
             
             
           
                                      update();

         }
         
     };
  timer =new Timer(delay, taskPerformer);
  

				 
		
        drawPanel = new DrawingPanel();
        panel.setLayout(new BorderLayout(0, 0));
        
        panel.add(drawPanel, BorderLayout.CENTER);
        setFocusable(true);
                    addKeyListener(new colisionDetector());

	}
	  class DrawingPanel extends JPanel {
		    public DrawingPanel() {
		        setBackground(Color.black);
		    }

		    @Override
		    protected void paintComponent(Graphics g) {
		        super.paintComponent(g);
		        Graphics2D g2d = (Graphics2D) g;
		        
		        // Configuración del dibujo
		        g2d.setColor(Color.yellow);
		       g2d.fillOval(x, y, 30, 30);
                       g2d.setColor(Color.gray);
                       g2d.fillRect(20, 20, 30, 150);
		    }
		    }
       

 
             
     class colisionDetector implements KeyListener{
          
 
        @Override
        public void keyTyped(KeyEvent e) {
        }
              

        @Override
        public void keyPressed(KeyEvent e) {
             actual =e.getKeyCode();
                   update();
                   timer.start();
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
              
}      
     public void update(){
         int auxX = x;
        int auxY = y;
      
              if (actual==68 ) {            
			x++;
			if(x>440) {
				x=-29;
			}
                  
		}
		if (actual==87) {
			y--;
			if (y < -30) {
				y=353;
			}
                }
		if (actual==65) {
         
			x--;
			if (x< -30) {
				x=440;
		}
                }
		if (actual==83) {
			y++;
			if (y>354) {
			y=-29;	
			}
		}
                 if ((y>20 && x>20 && x<50 && y<170)==true){
                     x=auxX;
                     y=auxY;
                 }
                 
            
				
		drawPanel.repaint(); 
     }
}