package factura;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;
import javax.swing.JButton;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtHola;
	private JTextField txtCalle;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_1;

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
		setBounds(100, 100, 500, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setForeground(Color.black);
		panel.setOpaque(true);
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 102, 153));
		panel_1.setBorder(new EmptyBorder(20,20,20,20));
		panel.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Serif", Font.BOLD, 14));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("(Sin Base de datos)");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new EmptyBorder(20,20,0,20));
		panel_2.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7 = new JPanel();
		panel_7.setBorder(new LineBorder(Color.black));

		panel_4.add(panel_7, BorderLayout.CENTER);

		panel_7.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_7_1 = new JPanel();
		panel_7_1.setBorder(new EmptyBorder(10,60,10,60));
		panel_7.add(panel_7_1);
		panel_7_1.setLayout(new GridLayout(2, 4, 20, 0));
		
		JLabel lblNewLabel_3 = new JLabel("Documento:");
		panel_7_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setText("123456");
		textField.setColumns(10);
		panel_7_1.add(textField);
		
		JLabel lblNewLabel_4 = new JLabel("Nombres:");
		panel_7_1.add(lblNewLabel_4);
		
		txtHola = new JTextField();
		txtHola.setText("david");
		txtHola.setColumns(10);
		panel_7_1.add(txtHola);
		
		JLabel lblNewLabel_5 = new JLabel("Direccion:");
		panel_7_1.add(lblNewLabel_5);
		
		txtCalle = new JTextField();
		txtCalle.setText("Calle 13");
		panel_7_1.add(txtCalle);
		txtCalle.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Telefono:");
		panel_7_1.add(lblNewLabel_6);
		
		textField_3 = new JTextField();
		textField_3.setText("612 123 456 7");
		panel_7_1.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel panel_8 = new JPanel();
		panel_4.add(panel_8, BorderLayout.NORTH);
		panel_8.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Datos del cliente");
		panel_8.add(lblNewLabel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new EmptyBorder(0,20,5,20));
		panel_2.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_7 = new JLabel("Datos de factura");
		panel_3.add(lblNewLabel_7, BorderLayout.NORTH);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBorder(new LineBorder(Color.black));
		panel_3.add(panel_9, BorderLayout.CENTER);
		panel_9.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel lblNewLabel_8 = new JLabel("No. Factura:");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("1");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_9.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Fecha:");
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		panel_9.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("03/10/2003");
		panel_9.add(lblNewLabel_11);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBorder(new EmptyBorder(0,20,20,20));
		panel_2.add(panel_5);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_9_1 = new JPanel();
		panel_9_1.setBorder(new LineBorder(Color.black));
		panel_5.add(panel_9_1);
		panel_9_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_13 = new JPanel();
		panel_9_1.add(panel_13, BorderLayout.NORTH);
		panel_13.setLayout(new GridLayout(1, 4, 0, 0));
		
		JLabel lblNewLabel_15 = new JLabel("Producto");
		panel_13.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Cantidad");
		panel_13.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("Valor");
		panel_13.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("Sub Total");
		panel_13.add(lblNewLabel_18);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Agua", "2", "500", "1000.0"},
				{"Cereal", "3", "1000", "500.0"},
				{"Leche", "4", "200", "600.0"},
				{null, null, null, null},
			},
			new String[] {
				"Producto", "Cantidad", "Valor", "Sub Total"
			}
		));
		panel_9_1.add(table);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBorder(new LineBorder(Color.black));
		panel_5.add(panel_10, BorderLayout.NORTH);
		panel_10.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBorder(new EmptyBorder(0,10,0,10));
		panel_10.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 1, 0, 0));
		
		JLabel lblNewLabel_12 = new JLabel("Ver listado de facturas\r\n");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_12.setIcon(new ImageIcon(Ventana.class.getResource("/factura/list.png")));
		panel_11.add(lblNewLabel_12);
		
		JPanel panel_12 = new JPanel();
		panel_10.add(panel_12);
		panel_12.setLayout(new GridLayout(1, 2, 0, 0));
		
		JLabel lblNewLabel_14 = new JLabel("Anadir");
		lblNewLabel_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_14.setIcon(new ImageIcon(Ventana.class.getResource("/factura/badge-plus.png")));
		panel_12.add(lblNewLabel_14);
		
		JLabel lblNewLabel_13 = new JLabel("Eliminar\r\n");
		lblNewLabel_13.setIcon(new ImageIcon(Ventana.class.getResource("/factura/badge-minus.png")));
		panel_12.add(lblNewLabel_13);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBorder(new EmptyBorder(10,20,10,20));
		panel_2.add(panel_6);
		panel_6.setLayout(new GridLayout(1, 3, 0, 0));
		
		JPanel panel_15 = new JPanel();
		panel_15.setBorder(new EmptyBorder(0,5,20,5));
		panel_6.add(panel_15);
		panel_15.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNewLabel_19 = new JLabel("SubTotal:");
		panel_15.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("6600.0");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_15.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("% Descuento:");
		panel_15.add(lblNewLabel_21);
		
		JPanel panel_17 = new JPanel();
		panel_15.add(panel_17);
		panel_17.setLayout(new GridLayout(1, 0, 0, 0));
		
		textField_1 = new JTextField();
		textField_1.setText("5");
		panel_17.add(textField_1);
		textField_1.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setSelected(true);
		panel_17.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_22 = new JLabel("IVA 19%:");
		panel_15.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("1200.0");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_15.add(lblNewLabel_23);
		
		JLabel lblNewLabel_24 = new JLabel("Total Factura:");
		panel_15.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("7000.0");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_15.add(lblNewLabel_25);
		
		JPanel panel_14 = new JPanel();
		panel_6.add(panel_14);
		panel_14.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_26 = new JLabel("Valor Descontado:\r\n");
		panel_14.add(lblNewLabel_26, BorderLayout.CENTER);
		
		JLabel lblNewLabel_27 = new JLabel("330.0");
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_14.add(lblNewLabel_27, BorderLayout.EAST);
		
		JPanel panel_16 = new JPanel();
		panel_6.add(panel_16);
		panel_16.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_18 = new JPanel();
		panel_16.add(panel_18, BorderLayout.SOUTH);
		panel_18.setLayout(new GridLayout(0, 2, 0, 0));
		
		JButton btnNewButton = new JButton("Finalizar");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		panel_18.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Limpiar");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 9));
		panel_18.add(btnNewButton_2);
		
		JPanel panel_19 = new JPanel();
		panel_19.setBackground(new Color(0, 102, 153));
		panel.add(panel_19, BorderLayout.SOUTH);
	}

}
