package views;

import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;

import controllers.AuthController;
import controllers.HomeController;
import models.AuthModel;
import models.UsersModel; 

public class AuthView {
	
	public AuthView() { 
	}
	
	public void login()
	{
		JFrame ventana = new JFrame();
		
		ventana.setVisible(true);
		ventana.setSize(930, 600);
		ventana.setLocationRelativeTo(null); 
		ventana.setTitle("Login"); 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		ventana.setResizable(true); 
		
		JTextField textField;
		JPasswordField passwordField;
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		//this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setSize(1000, 600); 
		
		JLabel lblNewLabel = new JLabel("UABCS - DASC\n");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 24));
		lblNewLabel.setBounds(107, 35, 210, 26);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel);
		
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(36, 186, 353, 81);
		lblNewLabel_8.setBorder(BorderFactory.createTitledBorder("Correo electrónico"));
		panel.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBackground(new Color(218, 230, 225));
		textField.setBounds(49, 211, 328, 42);
		panel.add(textField);
		textField.setBorder(new LineBorder(new Color(91, 253, 255), 1, true));
		textField.setBorder(null);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(218, 230, 225));
		passwordField.setBounds(49, 300, 295, 42);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String passText = new String(passwordField.getPassword());
				Boolean flag1 = false, flag2 = false;
				
				
				if( passText.equals("") ) {
					
					passwordField.setBorder(BorderFactory.createLineBorder(Color.red,2));
					
				}else {
					
					passwordField.setBorder(BorderFactory.createLineBorder(Color.green,2));
					flag1 = true;
				}
				
				
				if(textField.getText().equals("")) {
					textField.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}else {
					
					textField.setBorder(BorderFactory.createLineBorder(Color.green,2));
					flag2 = true;
				}
				
				if(flag1 && flag2) {
					
					AuthModel am = new AuthModel();
					boolean is_login = am.login(textField.getText(), passText);
					
					if(is_login) {
						JOptionPane.showMessageDialog(null, "Bienvenido.");
						
						ventana.dispose();
						HomeController hc = new HomeController();
						
						hc.home();
						
					}else {
						JOptionPane.showMessageDialog(null, "Error al acceder","verifique su información",JOptionPane.WARNING_MESSAGE);
					}
					
					
				}
				
			}
		});
		btnNewButton.setBounds(36, 413, 341, 37);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Sabiduría como meta, patria como destino ");
		lblNewLabel_1.setBounds(69, 73, 308, 16);
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		
		lblNewLabel_6.setIcon(new ImageIcon(this.getClass().getResource("/images/background.jpg")));
		lblNewLabel_6.setBounds(531, 6, 383, 494);
		lblNewLabel_6.setBorder(BorderFactory.createLineBorder(Color.white,5,true));
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ingresa al panel administrador");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblNewLabel_2_1.setBounds(49, 109, 340, 39);
		lblNewLabel_2_1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setBorder(BorderFactory.createTitledBorder("Contraseña"));
		lblNewLabel_8_1.setBounds(36, 279, 353, 81);
		panel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/images/hidden.png")));
		lblNewLabel_2.setBounds(351, 315, 24, 16);
		panel.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Recordar contraseña");
		chckbxNewCheckBox.setBounds(36, 372, 180, 23);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("¿Aún no tienes cuenta?");
		lblNewLabel_3.setBounds(225, 462, 152, 16);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton2 = new JButton("Crea una aquí");
		btnNewButton2.setBackground(new Color(0, 0, 0));
		btnNewButton2.setOpaque(true);
		btnNewButton2.setForeground(new Color(0, 0, 0));
		btnNewButton2.setBounds(205, 490, 200, 20);
		btnNewButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				ventana.dispose();
				AuthView.this.register();
				//e.getSource().
				 
				
			}});
		panel.add(btnNewButton2);
		
		ventana.add(panel);
		ventana.repaint();
		ventana.revalidate();
	}	
	public void register() {
	    JFrame ventana = new JFrame();
	    
	    ventana.setVisible(true);
	    ventana.setSize(930, 600);
	    ventana.setLocationRelativeTo(null);
	    ventana.setTitle("Registro");
	    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    ventana.setResizable(true);
	    
	    JTextField nombreField;
	    JTextField emailField;
	    JTextField roleField;
	    JTextField phoneField;
	    
	    JPanel panel = new JPanel();
	    panel.setBackground(new Color(255, 255, 255));
	    panel.setLocation(0, 0);
	    panel.setLayout(null);
	    panel.setSize(1000, 600);
	    
	    JLabel lblNewLabel = new JLabel("UABCS - DASC\n");
	    lblNewLabel.setForeground(new Color(0, 0, 0));
	    lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 24));
	    lblNewLabel.setBounds(107, 35, 210, 26);
	    lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
	    panel.add(lblNewLabel);
	    
	    JLabel lblNewLabel_1 = new JLabel("Sabiduría como meta, patria como destino ");
	    lblNewLabel_1.setBounds(69, 73, 308, 16);
	    lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
	    panel.add(lblNewLabel_1);
	    
	    JLabel lblNewLabel_2_1 = new JLabel("Registro de nuevo usuario");
	    lblNewLabel_2_1.setForeground(Color.BLACK);
	    lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
	    lblNewLabel_2_1.setBounds(49, 109, 340, 39);
	    lblNewLabel_2_1.setHorizontalAlignment(JLabel.CENTER);
	    panel.add(lblNewLabel_2_1);
	    
	    // Campo Nombre
	    JLabel lblNombre = new JLabel("");
	    lblNombre.setBounds(36, 155, 353, 65);
	    lblNombre.setBorder(BorderFactory.createTitledBorder("Nombre"));
	    panel.add(lblNombre);
	    
	    nombreField = new JTextField();
	    nombreField.setBackground(new Color(218, 230, 225));
	    nombreField.setBounds(49, 180, 328, 30);
	    panel.add(nombreField);
	    nombreField.setBorder(null);
	    nombreField.setColumns(10);
	    
	    // Campo email
	    JLabel lblEmail = new JLabel("");
	    lblEmail.setBounds(36, 225, 353, 65);
	    lblEmail.setBorder(BorderFactory.createTitledBorder("Correo"));
	    panel.add(lblEmail);
	    
	    emailField = new JTextField();
	    emailField.setBackground(new Color(218, 230, 225));
	    emailField.setBounds(49, 250, 328, 30);
	    panel.add(emailField);
	    emailField.setBorder(null);
	    emailField.setColumns(10);
	    
	    // Campo rol
	    JLabel lblRole = new JLabel("");
	    lblRole.setBounds(36, 295, 353, 65);
	    lblRole.setBorder(BorderFactory.createTitledBorder("Sexo"));
	    panel.add(lblRole);
	    
	    roleField = new JTextField();
	    roleField.setBackground(new Color(218, 230, 225));
	    roleField.setBounds(49, 320, 328, 30);
	    panel.add(roleField);
	    roleField.setBorder(null);
	    roleField.setColumns(10);
	    
	    // Campo telefono
	    JLabel lblPhone = new JLabel("");
	    lblPhone.setBounds(36, 365, 353, 65);
	    lblPhone.setBorder(BorderFactory.createTitledBorder("Edad"));
	    panel.add(lblPhone);
	    
	    phoneField = new JTextField();
	    phoneField.setBackground(new Color(218, 230, 225));
	    phoneField.setBounds(49, 390, 328, 30);
	    panel.add(phoneField);
	    phoneField.setBorder(null); 
	    phoneField.setColumns(10);
	    
	    // Botón de Registro
	    JButton btnRegistrar = new JButton("Registrarse");
	    btnRegistrar.setBackground(new Color(0, 0, 0));
	    btnRegistrar.setOpaque(true);
	    btnRegistrar.setForeground(new Color(255, 255, 255));
	    btnRegistrar.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	            
	            Boolean nombreValido = false, apellidoValido = false;
	            Boolean sexoValido = false, edadValida = false;
	            
	            // Validación del nombre
	            if(nombreField.getText().equals("")) {
	                nombreField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
	            } else {
	                nombreField.setBorder(BorderFactory.createLineBorder(Color.green, 2));
	                nombreValido = true;
	            }
	            
	            // Validación del apellido
	            if(emailField.getText().equals("")) {
	                emailField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
	            } else {
	                emailField.setBorder(BorderFactory.createLineBorder(Color.green, 2));
	                apellidoValido = true;
	            }
	            
	            // Validación del sexo
	            if(roleField.getText().equals("")) {
	                roleField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
	            } else {
	                roleField.setBorder(BorderFactory.createLineBorder(Color.green, 2));
	                sexoValido = true;
	            }
	            
	            // Validación de la edad
	            try {
	                int edad = Integer.parseInt(phoneField.getText());
	                if(edad <= 0 || edad > 120) {
	                    phoneField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
	                } else {
	                    phoneField.setBorder(BorderFactory.createLineBorder(Color.green, 2));
	                    edadValida = true;
	                }
	            } catch(NumberFormatException ex) {
	                phoneField.setBorder(BorderFactory.createLineBorder(Color.red, 2));
	            }
	            
	            // Si todos los campos son válidos
	            if(nombreValido && apellidoValido && sexoValido && edadValida) {
	                // Aquí iría el código para guardar el usuario en la base de datos
	            
							UsersModel um = new UsersModel();
							um.addUser(nombreField.getText().toString(), emailField.getText(), roleField.getText(),phoneField.getText());
						
	                JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
	                
	                ventana.dispose();
	                AuthView.this.login(); // Redirigir al login después del registro
	            }
	        }
	    });
	    btnRegistrar.setBounds(36, 450, 341, 37);
	    panel.add(btnRegistrar);
	    
	    // Botón para volver al login
	    JLabel lblYaTienesCuenta = new JLabel("¿Ya tienes una cuenta?");
	    lblYaTienesCuenta.setBounds(225, 500, 152, 16);
	    panel.add(lblYaTienesCuenta);
	    
	    JButton btnIrLogin = new JButton("Inicia sesión aquí");
	    btnIrLogin.setBackground(new Color(0, 0, 0));
	    btnIrLogin.setOpaque(true);
	    btnIrLogin.setForeground(new Color(0, 0, 0));
	    btnIrLogin.setBounds(205, 530, 200, 20);
	    btnIrLogin.addActionListener(new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            ventana.dispose();
	            AuthView.this.login();
	        }
	    });
	    panel.add(btnIrLogin);
	    
	    // Imagen de fondo (similar al login)
	    JLabel lblBackground = new JLabel("");
	    lblBackground.setIcon(new ImageIcon(this.getClass().getResource("/images/background.jpg")));
	    lblBackground.setBounds(531, 6, 383, 494);
	    lblBackground.setBorder(BorderFactory.createLineBorder(Color.white, 5, true));
	    panel.add(lblBackground);
	    
	    ventana.add(panel);
	    ventana.repaint();
	    ventana.revalidate();
	}
	/*
	public void register()
	{ 	
		System.out.println("Hola");
		JFrame ventana = new JFrame();
		
		ventana.setVisible(true);
		ventana.setSize(930, 600);
		ventana.setLocationRelativeTo(null); 
		ventana.setTitle("registro"); 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		ventana.setResizable(true); 
		
		JTextField textField;
		JPasswordField passwordField;
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		//this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLocation(0, 0);
		panel.setLayout(null);
		panel.setSize(1000, 600); 
		
		JLabel lblNewLabel = new JLabel("UABCS - DASC\n");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 24));
		lblNewLabel.setBounds(107, 35, 210, 26);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel);
		
		
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setBounds(36, 186, 353, 81);
		lblNewLabel_8.setBorder(BorderFactory.createTitledBorder("Correo electrónico"));
		panel.add(lblNewLabel_8);
		
		textField = new JTextField();
		textField.setBackground(new Color(218, 230, 225));
		textField.setBounds(49, 211, 328, 42);
		panel.add(textField);
		textField.setBorder(new LineBorder(new Color(91, 253, 255), 1, true));
		textField.setBorder(null);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(new Color(218, 230, 225));
		passwordField.setBounds(49, 300, 295, 42);
		panel.add(passwordField);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setOpaque(true);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String passText = new String(passwordField.getPassword());
				Boolean flag1 = false, flag2 = false;
				
				
				if( passText.equals("") ) {
					
					passwordField.setBorder(BorderFactory.createLineBorder(Color.red,2));
					
				}else {
					
					passwordField.setBorder(BorderFactory.createLineBorder(Color.green,2));
					flag1 = true;
				}
				
				
				if(textField.getText().equals("")) {
					textField.setBorder(BorderFactory.createLineBorder(Color.red,2));
				}else {
					
					textField.setBorder(BorderFactory.createLineBorder(Color.green,2));
					flag2 = true;
				}
				
				if(flag1 && flag2) {
					
					if(textField.getText().equals("fake@mail.com") ) {
						if(passText.equals("12345")) {
							
							JOptionPane.showMessageDialog(null, "Bienvenido.");
							
						}else {
							JOptionPane.showMessageDialog(null, "Error al acceder","verifique su información",JOptionPane.WARNING_MESSAGE);
						}
					}else {
						JOptionPane.showMessageDialog(null, "Error al acceder","verifique su información",JOptionPane.WARNING_MESSAGE);
					}
					
					
				}
				
			}
		});
		btnNewButton.setBounds(36, 413, 341, 37);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Sabiduría como meta, patria como destino ");
		lblNewLabel_1.setBounds(69, 73, 308, 16);
		lblNewLabel_1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_6 = new JLabel("");
		
		lblNewLabel_6.setIcon(new ImageIcon(this.getClass().getResource("/images/background.jpg")));
		lblNewLabel_6.setBounds(531, 6, 383, 494);
		lblNewLabel_6.setBorder(BorderFactory.createLineBorder(Color.white,5,true));
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2_1 = new JLabel("Ingresa al panel administrador");
		lblNewLabel_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblNewLabel_2_1.setBounds(49, 109, 340, 39);
		lblNewLabel_2_1.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_8_1 = new JLabel("");
		lblNewLabel_8_1.setBorder(BorderFactory.createTitledBorder("Contraseña"));
		lblNewLabel_8_1.setBounds(36, 279, 353, 81);
		panel.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		
		lblNewLabel_2.setIcon(new ImageIcon(this.getClass().getResource("/images/hidden.png")));
		lblNewLabel_2.setBounds(351, 315, 24, 16);
		panel.add(lblNewLabel_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Recordar contraseña");
		chckbxNewCheckBox.setBounds(36, 372, 180, 23);
		panel.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("¿Aún no tienes cuenta?");
		lblNewLabel_3.setBounds(225, 462, 152, 16);
		panel.add(lblNewLabel_3);
		
		JButton btnNewButton2 = new JButton("Crea una aquí");
		btnNewButton2.setBackground(new Color(0, 0, 0));
		btnNewButton2.setOpaque(true);
		btnNewButton2.setForeground(new Color(0, 0, 0));
		btnNewButton2.setBounds(205, 490, 200, 20);
		btnNewButton2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) { 
				
				ventana.dispose();
				AuthView.this.register();
				
				//e.getSource().
				 
				
			}});
		panel.add(btnNewButton2);
		
		ventana.add(panel);
		ventana.repaint();
		ventana.revalidate();
	}*/
	
	public void forgot()
	{ 
	}

}