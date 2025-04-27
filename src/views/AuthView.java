package views;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import controllers.AuthController;
import models.AuthModel; 

public class AuthView extends JFrame{
	
	private Color primaryColor = new Color(42, 125, 193);
	private Color secondaryColor = new Color(25, 83, 131);
	private Color accentColor = new Color(245, 245, 245);
	private Color textColor = new Color(51, 51, 51);
	private Font titleFont = new Font("SansSerif", Font.BOLD, 24);
	private Font subtitleFont = new Font("SansSerif", Font.PLAIN, 16);
	private Font labelFont = new Font("SansSerif", Font.PLAIN, 14);
	
	public AuthView() { 

		setVisible(true);
		setSize(930, 600);
		setLocationRelativeTo(null); 
		setTitle("Login"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setResizable(true); 
		
	}
	
	public void login()
	{
		
		setTitle("login"); 

		JTextField textField;
		JPasswordField passwordField;
		
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.white, 0, getHeight(), new Color(240, 245, 249));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setSize(1000, 600); 
		
		JLabel lblNewLabel = new JLabel("UABCS - DASC");
		lblNewLabel.setForeground(primaryColor);
		lblNewLabel.setFont(titleFont);
		lblNewLabel.setBounds(107, 35, 210, 26);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sabiduría como meta, patria como destino");
		lblNewLabel_1.setBounds(69, 73, 308, 16);
		lblNewLabel_1.setFont(subtitleFont);
		lblNewLabel_1.setForeground(secondaryColor);
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ingresa al panel administrador");
		lblNewLabel_2_1.setForeground(textColor);
		lblNewLabel_2_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(49, 120, 340, 39);
		lblNewLabel_2_1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(36, 186, 353, 81);
		lblNewLabel_8.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(primaryColor), 
				"Correo electrónico", 
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
				javax.swing.border.TitledBorder.DEFAULT_POSITION, 
				labelFont, 
				primaryColor));
		panel.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBackground(accentColor);
		textField.setBounds(49, 211, 328, 42);
		textField.setFont(new Font("SansSerif", Font.PLAIN, 14));
		panel.add(textField);
		textField.setBorder(new EmptyBorder(5, 10, 5, 10));
		textField.setColumns(10);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(primaryColor), 
				"Contraseña", 
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
				javax.swing.border.TitledBorder.DEFAULT_POSITION, 
				labelFont, 
				primaryColor));
		lblNewLabel_8_1.setBounds(36, 279, 353, 81);
		panel.add(lblNewLabel_8_1);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(accentColor);
		passwordField.setBounds(49, 300, 295, 42);
		passwordField.setBorder(new EmptyBorder(5, 10, 5, 10));
		passwordField.setFont(new Font("SansSerif", Font.PLAIN, 14));
		panel.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/images/hidden.png")));
		lblNewLabel_2.setBounds(351, 315, 24, 16);
		panel.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Recordar contraseña");
		chckbxNewCheckBox.setBounds(36, 372, 180, 23);
		chckbxNewCheckBox.setFont(labelFont);
		chckbxNewCheckBox.setForeground(textColor);
		chckbxNewCheckBox.setOpaque(false);
		panel.add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.setBackground(primaryColor);
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton.setBorder(new LineBorder(secondaryColor, 1, true));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String passText = new String(passwordField.getPassword());
				Boolean flag1 = false, flag2 = false;
				
				if(passText.equals("")) {
					passwordField.setBorder(BorderFactory.createLineBorder(Color.red,2));
				} else {
					passwordField.setBorder(BorderFactory.createLineBorder(Color.green,2));
					flag1 = true;
				}
				
				if(textField.getText().equals("")) {
					textField.setBorder(BorderFactory.createLineBorder(Color.red,2));
				} else {
					textField.setBorder(BorderFactory.createLineBorder(Color.green,2));
					flag2 = true;
				}
				
				if(flag1 && flag2) {
					if(textField.getText().equals("fake@mail.com")) {
						if(passText.equals("12345")) {
							JOptionPane.showMessageDialog(null, "Bienvenido.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
						} else {
							JOptionPane.showMessageDialog(null, "Error al acceder", "Verifique su información", JOptionPane.WARNING_MESSAGE);
						}
					} else {
						JOptionPane.showMessageDialog(null, "Error al acceder", "Verifique su información", JOptionPane.WARNING_MESSAGE);
					}
				}
			}
		});
		btnNewButton.setBounds(36, 413, 353, 37);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("¿Aún no tienes cuenta?");
		lblNewLabel_3.setBounds(225, 462, 152, 16);
		lblNewLabel_3.setFont(labelFont);
		lblNewLabel_3.setForeground(textColor);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton2 = new JButton("Crea una aquí");
		btnNewButton2.setBackground(new Color(240, 240, 240));
		btnNewButton2.setOpaque(true);
		btnNewButton2.setForeground(primaryColor);
		btnNewButton2.setBorder(new LineBorder(primaryColor, 1, true));
		btnNewButton2.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnNewButton2.setBounds(205, 490, 200, 25);
		btnNewButton2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AuthView.this.getContentPane().removeAll();
				AuthView.this.register();
			}
		});
		panel.add(btnNewButton2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(this.getClass().getResource("/images/background.jpg")));
		lblNewLabel_6.setBounds(531, 6, 383, 494);
		lblNewLabel_6.setBorder(BorderFactory.createLineBorder(primaryColor, 5, true));
		panel.add(lblNewLabel_6);
		
		add(panel);
		repaint();
		revalidate();
	}	
	
	public void register()
	{ 	
		setTitle("register");
		
		JTextField textField, nombreField, apellidoField;
		JPasswordField passwordField, confirmPasswordField;
		
		JPanel panel = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;
				GradientPaint gp = new GradientPaint(0, 0, Color.white, 0, getHeight(), new Color(240, 245, 249));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, getWidth(), getHeight());
			}
		};
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setSize(1000, 600); 
		
		JLabel lblNewLabel = new JLabel("UABCS - DASC");
		lblNewLabel.setForeground(primaryColor);
		lblNewLabel.setFont(titleFont);
		lblNewLabel.setBounds(107, 35, 210, 26);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sabiduría como meta, patria como destino");
		lblNewLabel_1.setBounds(69, 73, 308, 16);
		lblNewLabel_1.setFont(subtitleFont);
		lblNewLabel_1.setForeground(secondaryColor);
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Crea tu cuenta");
		lblNewLabel_2_1.setForeground(textColor);
		lblNewLabel_2_1.setFont(new Font("SansSerif", Font.BOLD, 18));
		lblNewLabel_2_1.setBounds(49, 120, 340, 39);
		lblNewLabel_2_1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_2_1);
		
		// Nombre
		JLabel lblNombre = new JLabel("");
		lblNombre.setBounds(36, 170, 162, 70);
		lblNombre.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(primaryColor), 
				"Nombre", 
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
				javax.swing.border.TitledBorder.DEFAULT_POSITION, 
				labelFont, 
				primaryColor));
		panel.add(lblNombre);
		
		nombreField = new JTextField();
		nombreField.setBackground(accentColor);
		nombreField.setBounds(43, 195, 148, 35);
		nombreField.setFont(new Font("SansSerif", Font.PLAIN, 14));
		nombreField.setBorder(new EmptyBorder(5, 10, 5, 10));
		panel.add(nombreField);
		
		// Apellido
		JLabel lblApellido = new JLabel("");
		lblApellido.setBounds(220, 170, 169, 70);
		lblApellido.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(primaryColor), 
				"Apellido", 
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
				javax.swing.border.TitledBorder.DEFAULT_POSITION, 
				labelFont, 
				primaryColor));
		panel.add(lblApellido);
		
		apellidoField = new JTextField();
		apellidoField.setBackground(accentColor);
		apellidoField.setBounds(227, 195, 155, 35);
		apellidoField.setFont(new Font("SansSerif", Font.PLAIN, 14));
		apellidoField.setBorder(new EmptyBorder(5, 10, 5, 10));
		panel.add(apellidoField);
		
		// Email
		JLabel lblEmail = new JLabel("");
		lblEmail.setBounds(36, 250, 353, 70);
		lblEmail.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(primaryColor), 
				"Correo electrónico", 
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
				javax.swing.border.TitledBorder.DEFAULT_POSITION, 
				labelFont, 
				primaryColor));
		panel.add(lblEmail);
		
		textField = new JTextField();
		textField.setBackground(accentColor);
		textField.setBounds(43, 275, 339, 35);
		textField.setFont(new Font("SansSerif", Font.PLAIN, 14));
		textField.setBorder(new EmptyBorder(5, 10, 5, 10));
		panel.add(textField);
		
		// Password
		JLabel lblPassword = new JLabel("");
		lblPassword.setBounds(36, 330, 162, 70);
		lblPassword.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(primaryColor), 
				"Contraseña", 
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
				javax.swing.border.TitledBorder.DEFAULT_POSITION, 
				labelFont, 
				primaryColor));
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(accentColor);
		passwordField.setBounds(43, 355, 148, 35);
		passwordField.setBorder(new EmptyBorder(5, 10, 5, 10));
		passwordField.setFont(new Font("SansSerif", Font.PLAIN, 14));
		panel.add(passwordField);
		
		// Confirm Password
		JLabel lblConfirmPassword = new JLabel("");
		lblConfirmPassword.setBounds(220, 330, 169, 70);
		lblConfirmPassword.setBorder(BorderFactory.createTitledBorder(
				BorderFactory.createLineBorder(primaryColor), 
				"Confirmar Contraseña", 
				javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
				javax.swing.border.TitledBorder.DEFAULT_POSITION, 
				labelFont, 
				primaryColor));
		panel.add(lblConfirmPassword);
		
		confirmPasswordField = new JPasswordField();
		confirmPasswordField.setBackground(accentColor);
		confirmPasswordField.setBounds(227, 355, 155, 35);
		confirmPasswordField.setBorder(new EmptyBorder(5, 10, 5, 10));
		confirmPasswordField.setFont(new Font("SansSerif", Font.PLAIN, 14));
		panel.add(confirmPasswordField);
		
		JButton btnRegister = new JButton("Registrarse");
		btnRegister.setBackground(primaryColor);
		btnRegister.setOpaque(true);
		btnRegister.setForeground(Color.WHITE);
		btnRegister.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnRegister.setBorder(new LineBorder(secondaryColor, 1, true));
		btnRegister.setBounds(36, 420, 353, 37);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Validation logic here
				JOptionPane.showMessageDialog(null, "Registro en construcción", "Información", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		panel.add(btnRegister);
		
		JLabel lblHaveAccount = new JLabel("¿Ya tienes cuenta?");
		lblHaveAccount.setBounds(225, 470, 152, 16);
		lblHaveAccount.setFont(labelFont);
		lblHaveAccount.setForeground(textColor);
		panel.add(lblHaveAccount);
		
		JButton btnLogin = new JButton("Iniciar sesión");
		btnLogin.setBackground(new Color(240, 240, 240));
		btnLogin.setOpaque(true);
		btnLogin.setForeground(primaryColor);
		btnLogin.setBorder(new LineBorder(primaryColor, 1, true));
		btnLogin.setFont(new Font("SansSerif", Font.BOLD, 12));
		btnLogin.setBounds(205, 495, 200, 25);
		btnLogin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AuthView.this.getContentPane().removeAll();
				AuthView.this.login();
			}
		});
		panel.add(btnLogin);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(this.getClass().getResource("/images/background.jpg")));
		lblNewLabel_6.setBounds(531, 6, 383, 494);
		lblNewLabel_6.setBorder(BorderFactory.createLineBorder(primaryColor, 5, true));
		panel.add(lblNewLabel_6);
		
		add(panel);
		repaint();
		revalidate();
	}
	
	public void forgot()
	{ 
	}

}