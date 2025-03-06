package test3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;

public class ventana {

	private JFrame frame;
	private JTextField txtJuanCarlos;
	private JTextField txtArcilla;
	private JTextField txtDiaz;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ventana window = new ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ventana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(104,255,85),20));
		panel.setBackground(new Color(104,255,85));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(104,255,85));
		panel.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(2, 2, 10, 10));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(143, 240, 164));
		panel_2.setForeground(new Color(104,255,85));
		panel_1.add(panel_2);
		panel_2.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Datos generales");
		panel_2.add(lblNewLabel,BorderLayout.NORTH);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(143, 240, 164));
		panel_2.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new GridLayout(7, 2));
		
		JLabel lblNewLabel_1 = new JLabel("Nombres:");
		panel_6.add(lblNewLabel_1);
		
		txtJuanCarlos = new JTextField();
		txtJuanCarlos.setText("Juan Carlos");
		panel_6.add(txtJuanCarlos);
		txtJuanCarlos.setColumns(10);
		
		JLabel lblApellidoPaterno = new JLabel("Apellido Paterno:");
		panel_6.add(lblApellidoPaterno);
		
		txtArcilla = new JTextField();
		txtArcilla.setText("Arcilla");
		panel_6.add(txtArcilla);
		txtArcilla.setColumns(10);
		
		JLabel lblApellidoMaterno = new JLabel("Apellido Materno:");
		panel_6.add(lblApellidoMaterno);
		
		txtDiaz = new JTextField();
		txtDiaz.setText("Diaz");
		panel_6.add(txtDiaz);
		txtDiaz.setColumns(10);
		
		JLabel lblFechaNacimiento = new JLabel("Fecha Nacimiento:");
		panel_6.add(lblFechaNacimiento);
		
		textField = new JTextField();
		textField.setText("07/01/1990");
		panel_6.add(textField);
		textField.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		panel_6.add(lblSexo);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBackground(new Color(143, 240, 164));
		panel_6.add(chckbxNewCheckBox);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(143, 240, 164));
		panel_6.add(panel_7);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBackground(new Color(143, 240, 164));
		panel_6.add(chckbxNewCheckBox_1);
		
		JLabel lblNacionalidad = new JLabel("Nacionalidad:");
		panel_6.add(lblNacionalidad);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Peru"}));
		panel_6.add(comboBox_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 204, 204));
		panel_1.add(panel_3);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel_2 = new JLabel("Perfil del Usuario");
		lblNewLabel_2.setBackground(new Color(255, 204, 204));
		panel_3.add(lblNewLabel_2, BorderLayout.NORTH);
		
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(new Color(255, 204, 204));
		panel_3.add(panel_8, BorderLayout.CENTER);
		panel_8.setLayout(new GridLayout(2, 1, 0, 0));
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(255, 204, 204));
		panel_9.setForeground(new Color(53, 132, 228));
		panel_8.add(panel_9);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("/home/david/Downloads/istockphoto-1388253782-612x612 (3).jpg"));
		panel_9.add(lblNewLabel_3);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(255, 204, 204));
		panel_8.add(panel_10);
		panel_10.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(255, 204, 204));
		panel_10.add(panel_11);
		panel_11.setLayout(new GridLayout(0, 1, 0, 5));
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox_2.setBackground(new Color(255, 204, 204));
		panel_11.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxNewCheckBox_3.setBackground(new Color(255, 204, 204));
		panel_11.add(chckbxNewCheckBox_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(255, 102, 102));
		panel_1.add(panel_4);
		panel_4.setLayout(new BorderLayout(0, 0));
		
		JLabel lblDatosOpcionales = new JLabel("Datos opcionales");
		lblDatosOpcionales.setBackground(new Color(255, 102, 102));
		panel_4.add(lblDatosOpcionales, BorderLayout.NORTH);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_12.setBackground(new Color(255, 102, 102));
		panel_4.add(panel_12, BorderLayout.CENTER);
		panel_12.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblNewLabel_4 = new JLabel("Descripcion");
		panel_12.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Preferencias");
		panel_12.add(lblNewLabel_5);
		
		JTextArea txtrHolaAmigosDe = new JTextArea();
		txtrHolaAmigosDe.setWrapStyleWord(true);
		txtrHolaAmigosDe.setLineWrap(true);
		txtrHolaAmigosDe.setTabSize(4);
		txtrHolaAmigosDe.setRows(4);
		txtrHolaAmigosDe.setText("Hola amigos de youtube, gracias por compartir mis videos");
		panel_12.add(txtrHolaAmigosDe);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Cantar", "Escuchar musica", "Leer", "Deportes", "Otros"}));
		comboBox.setSelectedIndex(4);
		panel_12.add(comboBox);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(new Color(255, 102, 102));
		panel_13.setSize(600,100);
		panel_4.add(panel_13, BorderLayout.SOUTH);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(143, 240, 164));
		panel_1.add(panel_5);
		panel_5.setLayout(new FlowLayout(FlowLayout.CENTER, 70, 40));
		
		JButton btnNewButton = new JButton("Nuevo");
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(119, 118, 123));
		panel_5.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Guardar");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(119, 118, 123));
		panel_5.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Salir");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(119, 118, 123));
		panel_5.add(btnNewButton_2);
		
		
		JLabel lblRegistro = new JLabel("Registro de Usuarios");
		lblRegistro.setBackground(new Color(0, 0, 0));
		lblRegistro.setForeground(new Color(237, 51, 59));
		panel.add(lblRegistro, BorderLayout.NORTH);
	}

}
