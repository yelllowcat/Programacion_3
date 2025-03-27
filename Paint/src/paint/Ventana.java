package paint;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JSlider;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPanel panel_3;
	private JPanel panel_5;
	private JPanel panel_4;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_4;
	private JLabel lblBrocha;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel lblNewLabel_5;
	private JPanel panel_6;
	private JLabel lblNewLabel_3;
	private JSlider slider;

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
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 255));
		contentPane.setBorder(new EmptyBorder(40, 40, 40, 40));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 192));
		panel_1.setPreferredSize(new Dimension(140,500));
		contentPane.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(0, 1, 0, 50));
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 255, 255));
		panel_1.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));
		
		lblNewLabel_1 = new JLabel("Herramientas");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_1);
		
		lblBrocha = new JLabel("Pincel\r\n");
		lblBrocha.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBrocha.setIcon(new ImageIcon(Ventana.class.getResource("/paint/pencil.png")));
		panel_3.add(lblBrocha);
		
		lblNewLabel_2 = new JLabel("Borrador");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setIcon(new ImageIcon(Ventana.class.getResource("/paint/eraser.png")));
		panel_3.add(lblNewLabel_2);
		
		panel_6 = new JPanel();
		panel_6.setBackground(new Color(255, 255, 255));
		panel_3.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 2, 0, 0));
		
		lblNewLabel_3 = new JLabel("Grosor");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		panel_6.add(lblNewLabel_3);
		
		slider = new JSlider();
		slider.setBackground(new Color(255, 255, 255));
		panel_6.add(slider);
		
		lblNewLabel_4 = new JLabel("Formas");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_4);
		
		label_1 = new JLabel("Rectangulo");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_1.setIcon(new ImageIcon(Ventana.class.getResource("/paint/rectangle-horizontal.png")));
		panel_3.add(label_1);
		
		lblNewLabel = new JLabel("Circulo");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setIcon(new ImageIcon(Ventana.class.getResource("/paint/circle.png")));
		panel_3.add(lblNewLabel);
		
		label_2 = new JLabel("Triangulo");
		label_2.setIcon(new ImageIcon(Ventana.class.getResource("/paint/triangle.png")));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_3.add(label_2);
		
		label_3 = new JLabel("Linea");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_3.setIcon(new ImageIcon(Ventana.class.getResource("/paint/slash.png")));
		panel_3.add(label_3);
		
		lblNewLabel_5 = new JLabel("Colores");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		panel_3.add(lblNewLabel_5);
		
		panel_5 = new JPanel();
		panel_3.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 0, 0));
		panel_5.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new GridLayout(2, 4, 0, 0));
		
		btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(255, 255, 255));
		panel_4.add(btnNewButton);
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(0, 0, 0));
		panel_4.add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(128, 128, 128));
		panel_4.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(255, 0, 0));
		panel_4.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(0, 255, 64));
		panel_4.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(0, 128, 255));
		btnNewButton_5.setPreferredSize(new Dimension(10,10));
		panel_4.add(btnNewButton_5);
		
		label_4 = new JLabel("");
		panel_3.add(label_4);
		
		label_5 = new JLabel("");
		panel_3.add(label_5);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));

		panel_2.setPreferredSize(new Dimension(540,500));

		contentPane.add(panel_2, BorderLayout.EAST);
	}

}
