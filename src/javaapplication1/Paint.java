package javaapplication1;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Stroke;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JButton;

public class Paint implements MouseListener, MouseMotionListener{

	private JFrame frame;
	private DrawingPanel drawingPanel; 
	
	private Point lastPoint;
	private List<Point> points = new ArrayList<>();
	private List<Rectangle> figuras = new ArrayList<>();
	private List<Triangle> triangulos = new ArrayList<>();
	private List<Circle> circulos = new ArrayList<>();
    private List<Stroke> strokes = new ArrayList<>();
    private boolean eraserMode = false;
    private Color currentColor = Color.BLACK;
    private int method = 1;
    public int gr=2;

    class Stroke {
        List<Point> points;
        Color color;
        int size;
        boolean isEraser;

        public Stroke(List<Point> points, Color color, int size, boolean isEraser) {
            this.points = new ArrayList<>(points);
            this.color = color;
            this.size = size;
            this.isEraser = isEraser;
        }
    }

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {				
				try {
					Paint window = new Paint();
					window.frame.setVisible(true);					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Paint() {
		initialize();
	}

	private void initialize() {		
		frame = new JFrame();
		frame.setBounds(100, 100, 726, 521);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Pincel");
		btnNewButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello world");
			}
		});
		panel_1.add(btnNewButton, BorderLayout.NORTH);
		
		JPanel panel_3 = new JPanel();
        panel_3.setLayout(new GridLayout(9,1,20,10));
		panel_1.add(panel_3, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				strokes.clear();
				drawingPanel.repaint();				
			}
		});
		
	    JSlider slider = new JSlider(1, 20, 2); 
	    slider.setMajorTickSpacing(5);
	    slider.setPaintTicks(true);
	    slider.setPaintLabels(true);
	    slider.addChangeListener(new ChangeListener() {			
			@Override
			public void stateChanged(ChangeEvent e) {
				gr = slider.getValue();
			}
		});    
	       
		panel_3.add(btnNewButton_1);
		panel_3.add(slider);
		JButton btnNewButton_2 = new JButton("Rectangulo");
		btnNewButton_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				method = 2;
			}			
		});
		JButton btnNewButton_3 = new JButton("Triangulo");
		btnNewButton_3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				method = 3;
			}			
		});
		JButton btnNewButton_4 = new JButton("Cicle");
		btnNewButton_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {				
				method = 4;
			}			
		});
		JButton eraserButton = new JButton("Borrador");
		eraserButton.addActionListener(e -> {
		    currentColor = Color.WHITE;
		    gr = 10;
		    eraserMode = true;
		});
		panel_3.add(btnNewButton_2);
		panel_3.add(btnNewButton_3);
		panel_3.add(btnNewButton_4);
		panel_3.add(eraserButton);
		
		JButton btnRojo = new JButton("Rojo");
		btnRojo.addActionListener(e -> {
		    currentColor = Color.RED;
		    eraserMode = false;
		});
		panel_3.add(btnRojo);
		
		JButton btnAzul = new JButton("Azul");
		btnAzul.addActionListener(e -> {
		    currentColor = Color.BLUE;
		    eraserMode = false;
		});
		panel_3.add(btnAzul);
		
		JButton btnVerde = new JButton("Verde");
		btnVerde.addActionListener(e -> {
		    currentColor = Color.GREEN;
		    eraserMode = false;
		});
		panel_3.add(btnVerde);

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.SOUTH);
			
		drawingPanel = new DrawingPanel();
        panel.add(drawingPanel, BorderLayout.CENTER);
        drawingPanel.addMouseListener(this);
        drawingPanel.addMouseMotionListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(method==2) {
			Rectangle tmp = new Rectangle(e.getX(),e.getY(),100,100);
			figuras.add(tmp);
		}	
		if(method==3) {
			Triangle tmp = new Triangle(e.getX(),e.getY());
			triangulos.add(tmp);
		}
		if(method==4) {
			Circle tmp = new Circle(e.getX(),e.getY(),100,100);
			circulos.add(tmp);
		}	
		drawingPanel.repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		lastPoint = e.getPoint();
        points.add(lastPoint); 
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		if (!points.isEmpty()) {
            strokes.add(new Stroke(new ArrayList<>(points), currentColor, gr, eraserMode));
            points.clear();
        }
	}

	@Override
	public void mouseEntered(MouseEvent e) {}

	@Override
	public void mouseExited(MouseEvent e) {}

	@Override
	public void mouseDragged(MouseEvent e) {
		 Point newPoint = e.getPoint(); 
		 points.add(newPoint);  
	     drawingPanel.repaint();
	     lastPoint = newPoint;
	}

	class DrawingPanel extends JPanel {
	    public DrawingPanel() {
	        setBackground(Color.WHITE);
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	        
	        // Draw saved strokes
	        for (Stroke stroke : strokes) {
	            if (stroke.isEraser) {
	                g2d.setColor(stroke.color);
	                int radius = stroke.size;
	                for (Point p : stroke.points) {
	                    g2d.fillOval(p.x - radius, p.y - radius, 2 * radius, 2 * radius);
	                }
	            } else {
	                g2d.setColor(stroke.color);
	                g2d.setStroke(new BasicStroke(stroke.size));
	                if (stroke.points.size() > 1) {
	                    for (int i = 1; i < stroke.points.size(); i++) {
	                        Point p1 = stroke.points.get(i - 1);
	                        Point p2 = stroke.points.get(i);
	                        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
	                    }
	                }
	            }
	        }
	        
	        // Draw current points
	        if (!points.isEmpty()) {
	            if (eraserMode) {
	                g2d.setColor(currentColor);
	                int radius = gr;
	                for (Point p : points) {
	                    g2d.fillOval(p.x - radius, p.y - radius, 2 * radius, 2 * radius);
	                }
	            } else {
	                g2d.setColor(currentColor);
	                g2d.setStroke(new BasicStroke(gr));
	                if (points.size() > 1) {
	                    for (int i = 1; i < points.size(); i++) {
	                        Point p1 = points.get(i - 1);
	                        Point p2 = points.get(i);
	                        g2d.drawLine(p1.x, p1.y, p2.x, p2.y);
	                    }
	                }
	            }
	        }
	        
	        g2d.setColor(Color.BLACK);
	        for (Rectangle rectangle : figuras) {
	            g2d.drawRect(rectangle.x, rectangle.y, rectangle.w, rectangle.h);
	        }
	        for (Triangle triangle : triangulos) {
	            g2d.drawPolygon(new int[]{triangle.x, triangle.x + 50, triangle.x + 100}, new int[]{triangle.y, triangle.y - 100, triangle.y}, 3);
	        }
	        for (Circle circle : circulos) {
	            g2d.drawOval(circle.x, circle.y, circle.w, circle.h);
	        }
	    }
	}
	
	class Rectangle{ 
	private int x,y,w,h;
	public Rectangle(int x, int y,int w, int h)
{ 
	this.x = x;
	this.y = y;
	this.w = w;
	this.h = h; 
	} 
	}
	class Triangle
	{
		private int x,y;
		public Triangle(int x, int y)
		{ 
		this.x = x;
		this.y = y;
		}
}
	class Circle{ 
		private int x,y,w,h;
		public Circle(int x, int y,int w, int h)
		{ this.x = x;
		this.y = y;
		this.w = w;
		this.h = h; 
		} 
		}

	@Override
	public void mouseMoved(MouseEvent e) {}
}