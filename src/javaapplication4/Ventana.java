package javaapplication4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Ventana extends JFrame{

	public Ventana() {
		
		this.setVisible(true);
		this.setSize(400, 600);
		this.setLocationRelativeTo(null);
		
		this.setTitle("Login");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(true); 
		
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(400,400));
		
		this.add(this.login());
		
		
	
		
		//barra
		JMenuBar barra = new JMenuBar();
		
		JMenu file = new JMenu("Cuenta");
		barra.add(file);
                JMenuItem log = new JMenuItem("login");
		file.add(log);
		JMenuItem reg = new JMenuItem("registro");
		file.add(reg);
		JMenuItem recuperacion= new JMenuItem("Recuperacion de cuenta");
		file.add(recuperacion);
		
		JMenu menu_2 = new JMenu("Usuarios");
		barra.add(menu_2);
		
		
		JMenuItem alta = new JMenuItem("Alta");
		menu_2.add(alta);
		JMenuItem baja = new JMenuItem("Baja");
		menu_2.add(baja);
		JMenuItem consultar = new JMenuItem("Consultar");
		menu_2.add(consultar);
		
		
                JMenu menu3 = new JMenu("Ayuda");
		barra.add(menu3);
		
                
		JMenuItem crear = new JMenuItem("¿Cómo crear un usuario?");
		menu3.add(crear);
		JMenuItem acceder = new JMenuItem("¿Cómo acceder al sistema?");
		menu3.add(acceder);
		JMenuItem olvidar = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		menu3.add(olvidar);
                
                
                
		this.setJMenuBar(barra);
		
		log.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("login");
			}
		});
		
		reg.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("register");
			}
		}); 
                recuperacion.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        router("recuperacion");
                    }
                }
                );
                
               alta.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        router("alta");
                    }
               });
               
               baja.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        router("baja");
                    }
               });
		  consultar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        router("consultar");
                    }
                  });
                  
                  crear.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        router("crear");
                    }
                    
                  });
                  
                  acceder.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        router("acceder");
                    }
                  });
                  
                  olvidar.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        router("olvidar");
                    }
                  });
		
		
		this.repaint();
		this.revalidate();
	}
	
	
	public JPanel login()
	{
		
		Font fuente = new Font("American Typewriter",Font.BOLD,20);
		
		JPanel mipanel = new JPanel();

		mipanel.setBackground(Color.decode("#48cae4"));
		mipanel.setOpaque(true);
		mipanel.setSize(400, 400);
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null); //quita el molde
		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(200, 30);
		etiqueta1.setLocation(120, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("American Typewriter",Font.BOLD,24)); 
		mipanel.add(etiqueta1);
		
		
		JLabel etiqueta2 = new JLabel("Ingrese su email: ");
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 130);
		etiqueta2.setFont(fuente);
		mipanel.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setSize(300, 30);
		email.setLocation(38, 160);
		email.setFont(fuente);
		mipanel.add(email);
		
		JLabel password_tag = new JLabel("Ingrese su contraseña: ");
		password_tag.setSize(250, 30);
		password_tag.setLocation(40, 210);
		password_tag.setFont(fuente);
		mipanel.add(password_tag);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(38, 240, 300, 30);
		password.setFont(fuente);
		mipanel.add(password);
		
		JCheckBox terms = new JCheckBox("Acepto los términos",false);
		terms.setSize(250, 30);
		terms.setLocation(40, 280); 
		mipanel.add(terms);
		
		JLabel forgot_tag = new JLabel("¿Olvidó su contraseña?");
		forgot_tag.setSize(250, 30);
		forgot_tag.setLocation(200, 310); 
		mipanel.add(forgot_tag);
		
		JButton access = new JButton("ACCEDER");
		access.setBounds(100, 350, 200, 50);
		access.setFont(fuente);
		access.setOpaque(true);
		access.setBackground(Color.red);
		mipanel.add(access);
		
		JButton registro = new JButton("Ir a Registro");
		registro.setBounds(100, 430, 200, 50);
		registro.setFont(fuente);
		registro.setOpaque(true);
		registro.setBackground(Color.red);
		mipanel.add(registro);
		
		registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");
			}
		});
		
		
		return mipanel;
	}
	public void router(String route) {
		this.getContentPane().removeAll();
		if (route.equals("register")) {
			this.add(this.registro());
		}
		if (route.equals("login")) {
			this.add(this.login());
	}
		
		this.validate();
		this.repaint();
	}

 	public JPanel registro()
	{
		Font fuente = new Font("American Typewriter",Font.BOLD,20);
		
		JPanel mipanel = new JPanel();

		mipanel.setBackground(Color.decode("#01092"));
		mipanel.setOpaque(true);
		mipanel.setSize(400, 400);
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null); //quita el molde
		
		JLabel etiqueta1 = new JLabel("Registro");
		etiqueta1.setSize(200, 30);
		etiqueta1.setLocation(120, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("American Typewriter",Font.BOLD,24)); 
		mipanel.add(etiqueta1);
		
		
		JLabel etiqueta2 = new JLabel("Ingrese su email: ");
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 130);
		etiqueta2.setFont(fuente);
		mipanel.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setSize(300, 30);
		email.setLocation(38, 160);
		email.setFont(fuente);
		mipanel.add(email);
		
		JLabel password_tag = new JLabel("Ingrese su contraseña: ");
		password_tag.setSize(250, 30);
		password_tag.setLocation(40, 210);
		password_tag.setFont(fuente);
		mipanel.add(password_tag);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(38, 240, 300, 30);
		password.setFont(fuente);
		mipanel.add(password);
		
		JCheckBox terms = new JCheckBox("Acepto los términos",false);
		terms.setSize(250, 30);
		terms.setLocation(40, 280); 
		mipanel.add(terms);
		
		JLabel forgot_tag = new JLabel("¿Olvidó su contraseña?");
		forgot_tag.setSize(250, 30);
		forgot_tag.setLocation(200, 310); 
		mipanel.add(forgot_tag);
		
		JButton access = new JButton("ACCEDER");
		access.setBounds(100, 350, 200, 50);
		access.setFont(fuente);
		access.setOpaque(true);
		access.setBackground(Color.red);
		mipanel.add(access);
		
		JButton btnAcceder = new JButton("Ir a Login");
		btnAcceder.setBounds(100, 430, 200, 50);
		btnAcceder.setFont(fuente);
		btnAcceder.setOpaque(true);
		btnAcceder.setBackground(Color.red);
		mipanel.add(btnAcceder);
		
		btnAcceder.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				router("login");
			}
		});
		
		return mipanel;
	}

}
