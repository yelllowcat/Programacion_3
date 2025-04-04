package teclado;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;

import javax.swing.SwingConstants;

public class Ventana extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

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
	 String letras []={"Q","W","E","R","T","Y","U","I","O","P","A","S","D","F","G","H","J","K","L","Ñ","Z","X","C","V","B","N","M"};
	 JLabel[] labels ;
	 String[] palabras = {
	            "arbol", "camion", "telefono", "lapiz", "corazon", "accion", "nacion", "jovenes", "angel", "raton",
	            "examen", "azucar", "limon", "reves", "tactil", "musica", "logica", "matematicas", "economia", "fisica",
	            "estomago", "publico", "trafico", "rapido", "facil", "dificil", "carcel", "util", "habitacion", "direccion",
	            "decision", "television", "pelicula", "camara", "computacion", "programacion", "calculo", "medico", "politica", "quimica",
	            "tecnica", "espiritu", "energia", "pajaro", "sabado", "miercoles", "viernes", "sabana", "teoria", "practica",
	            "dialogo", "poesia", "literatura", "pagina", "parrafo", "logro", "esfuerzo", "numero", "botanica", "zoologia",
	            "antropologia", "filosofia", "historia", "geografia", "sintesis", "analisis", "critica", "etica", "estetica", "fisico",
	            "biologia", "tecnologia", "ingenieria", "estructura", "sistema", "sintoma", "medicina", "psicologia", "sociologia", "educacion",
	            "organizacion", "administracion", "produccion", "investigacion", "proyecto", "modelo", "diseno", "proceso", "resultado", "metodo",
	            "teorema", "experimento", "laboratorio", "modelo", "concepto", "planteamiento", "hipotesis", "solucion", "problema", "estrategia"
	        };
	  
	  int random = aleatorio();
	  Timer timer;
	  int seg=0;
	  String palabraEscrita="";
	public Ventana() {
		addKeyListener(this);
			labels = new JLabel[letras.length];

		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JLabel lblTimer = new JLabel("0:0");
		panel_1.add(lblTimer, BorderLayout.EAST);
		
		JLabel lblPalabraescrita = new JLabel(palabraEscrita);
		panel_1.add(lblPalabraescrita, BorderLayout.WEST);
		
		JLabel lblPalabrabuscada = new JLabel(palabras[random]);
		lblPalabrabuscada.setHorizontalAlignment(SwingConstants.CENTER);
		panel_1.add(lblPalabrabuscada, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(3, 9, 0, 0));
		
		JPanel panel_3 = new JPanel();
		contentPane.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("space");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("delete");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1);
		
		setBounds(500,500,800,300);
		
		setVisible(true);
		for (int i = 0; i < letras.length; i++) {
			labels[i] = new JLabel(letras[i]);
			labels[i].setHorizontalAlignment(JLabel.CENTER);
            labels[i].setVerticalAlignment(JLabel.CENTER);
			labels[i].setBorder(new LineBorder(Color.black));
			labels[i].setBackground(Color.gray);;
			labels[i].setOpaque(true); 
			panel_2.add(labels[i]);

	}
		ActionListener taskPerformer= new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				lblPalabraescrita.setText(palabraEscrita);
				String [] split_string = lblTimer.getText().split(":");
				int mil = Integer.parseInt(split_string[1]);
				
				mil+=1;
				
				if(mil>=10) {
					seg++;
					mil=1;
				}
				lblTimer.setText(seg+":"+mil+"");
				 for (JLabel label : labels) {
				        label.setBackground(Color.GRAY);
				        label.repaint(); 
				    }

				if (palabraEscrita.equals(lblPalabrabuscada.getText()) ){
					timer.stop();
					JOptionPane.showMessageDialog(null, "Tardaste: "+seg+":"+mil);
					seg=0;
					mil=0;
					lblTimer.setText(seg+":"+mil+"");

					lblPalabrabuscada.setText(palabras[ aleatorio()]);
					lblPalabraescrita.setText("");
					
				}
			}
		};
		timer = new Timer(100,taskPerformer);
		
	}
	

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		char letraPresionada = Character.toUpperCase(e.getKeyChar()); 
        cambiarColor(letraPresionada, Color.YELLOW); 
		escribir(letraPresionada);
		timer.start();

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
	 private void escribir(char letra) {
		 for (int i = 0; i < letras.length; i++) {
	            if (letras[i].equals(String.valueOf(letra))) {

	              palabraEscrita=  palabraEscrita+letras[i].toLowerCase();
	                System.out.println(palabraEscrita);
	                
	                break;
	            }
		 }
	 }
	 public int aleatorio() {
		 int random=(int)(Math.random() * 26 );
		 
		 return random;
	 }
	 
	}
	


