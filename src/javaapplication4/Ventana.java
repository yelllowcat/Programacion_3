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
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
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
                        router("consulta");
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
                terms.setBackground(Color.decode("#48cae4"));
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
                if (route.equals("recuperacion")) {
			this.add(this.recuperacion());
	}
                 if (route.equals("alta")) {
			this.add(this.alta());
	}
                  if (route.equals("baja")) {
			this.add(this.baja());
	}
                   if (route.equals("consulta")) {
			this.add(this.consulta());
	}
                    if (route.equals("crear")) {
			this.add(this.crear());
	}
                     if (route.equals("acceder")) {
			this.add(this.acceder());
	}
                      if (route.equals("olvidar")) {
			this.add(this.olvidar());
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
                terms.setBackground(Color.decode("#01092"));
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
        
	public JPanel recuperacion()
	{
		
		Font fuente = new Font("American Typewriter",Font.BOLD,20);
				Font fuente2=new Font("American Typewriter",Font.BOLD,15);

		JPanel mipanel = new JPanel();

		mipanel.setBackground(Color.white);
		mipanel.setOpaque(true);
		mipanel.setSize(400, 400);
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null); //quita el molde
		
		JLabel etiqueta1 = new JLabel("Recuperacion de cuenta");
		etiqueta1.setSize(300, 30);
		etiqueta1.setLocation(30, 40);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("American Typewriter",Font.BOLD,24)); 
		mipanel.add(etiqueta1);
		
		
		JLabel etiqueta2 = new JLabel("Ingrese su email");
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 130);
		etiqueta2.setFont(fuente);
		mipanel.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setSize(300, 30);
		email.setLocation(38, 160);
		email.setFont(fuente);
		mipanel.add(email);
		
		
		
		JButton access = new JButton("Atras");
		access.setBounds(20, 250, 150, 50);
		access.setFont(fuente);
		access.setOpaque(true);
                access.setForeground(Color.white);
		access.setBackground(Color.blue);
		mipanel.add(access);
		
		JButton registro = new JButton("Enviar correo");
		registro.setBounds(230, 250, 150, 50);
		registro.setFont(new Font("American Typewriter",Font.BOLD,15));
		registro.setOpaque(true);
                registro.setForeground(Color.white);
		registro.setBackground(Color.blue);
                
		mipanel.add(registro);
		
		access.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				router("login");
			}
		});
		
		
		return mipanel;
	}
        
        public JPanel alta()
	{
		
		Font fuente = new Font("American Typewriter",Font.BOLD,20);				
                Font fuente2=new Font("American Typewriter",Font.BOLD,15);

		JPanel mipanel = new JPanel();

		mipanel.setBackground(Color.decode("99999"));
		mipanel.setOpaque(true);
		mipanel.setSize(400, 400);
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null); //quita el molde
		
		JLabel etiqueta1 = new JLabel("Alta de cuenta");
		etiqueta1.setSize(200, 30);
		etiqueta1.setLocation(100, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("American Typewriter",Font.BOLD,24)); 
		mipanel.add(etiqueta1);
                
                JLabel etiquetaNombre = new JLabel("Nombre de usuario: ");
		etiquetaNombre.setSize(220, 30);
		etiquetaNombre.setLocation(40, 80);
		etiquetaNombre.setFont(fuente);
		mipanel.add(etiquetaNombre);
                
                JTextField fieldNombre = new JTextField();
		fieldNombre.setSize(300, 30);
		fieldNombre.setLocation(38, 110);
		fieldNombre.setFont(fuente);
		mipanel.add(fieldNombre);
		
		
		JLabel etiqueta2 = new JLabel("Correo Electronico: ");
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 160);
		etiqueta2.setFont(fuente);
		mipanel.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setSize(300, 30);
		email.setLocation(38, 190);
		email.setFont(fuente);
		mipanel.add(email);
		
		JLabel password_tag = new JLabel("Ingrese su contraseña: ");
		password_tag.setSize(250, 30);
		password_tag.setLocation(40, 240);
		password_tag.setFont(fuente);
		mipanel.add(password_tag);
		
		JPasswordField password = new JPasswordField();
		password.setBounds(38, 270, 300, 30);
		password.setFont(fuente);
		mipanel.add(password);
		
		
                
		JRadioButton terms = new JRadioButton("Usuario");
		terms.setSize(120, 30);
                terms.setBackground(Color.decode("99999"));
		terms.setLocation(40, 320); 
		mipanel.add(terms);
                
                JRadioButton terms2 = new JRadioButton("Administrador");
                terms2.setSize(120, 30);
                terms2.setBackground(Color.decode("99999"));
		terms2.setLocation(160, 320); 
		mipanel.add(terms2);
                
                ButtonGroup grupo = new ButtonGroup();
                grupo.add(terms);
                grupo.add(terms2);
		
                
                //botones
		JButton access = new JButton("Atras");
		access.setBounds(20, 380, 150, 50);
		access.setFont(fuente2);
		access.setOpaque(true);
		access.setBackground(Color.red);
		mipanel.add(access);
		
		JButton registro = new JButton("Dar de Alta");
		registro.setBounds(230, 380, 150, 50);
		registro.setFont(fuente2);
		registro.setOpaque(true);
		registro.setBackground(Color.red);
		mipanel.add(registro);
		
		access.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");
			}
		});
		
		
		return mipanel;
	}
        public JPanel baja()
	{
		
		Font fuente = new Font("American Typewriter",Font.BOLD,20);
		
		JPanel mipanel = new JPanel();

		mipanel.setBackground(Color.decode("#f2f2f2"));
		mipanel.setOpaque(true);
		mipanel.setSize(400, 400);
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null); //quita el molde
		
		JLabel etiqueta1 = new JLabel("Baja");
		etiqueta1.setSize(200, 30);
		etiqueta1.setLocation(120, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("American Typewriter",Font.BOLD,24)); 
		mipanel.add(etiqueta1);
		
		
		JLabel etiqueta2 = new JLabel("Eliminar Usuario: ");
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 130);
		etiqueta2.setFont(fuente);
		mipanel.add(etiqueta2);
		
                
		JComboBox list = new JComboBox();
                list.setBounds(40, 170,130,40);
                list.addItem("estudiante 1");
                list.addItem("estudiante 2");
                list.addItem("estudiante 3");
                list.addItem("estudiante 4");
                list.addItem("estudiante 5");
                mipanel.add(list);
                
                
              
                          
		
		JButton access = new JButton("Borrar");
		access.setBounds(250, 160, 100, 50);
		access.setFont(fuente);
		access.setOpaque(true);
		access.setBackground(Color.red);
		mipanel.add(access);
		
		JButton registro = new JButton("Ir al inicio");
		registro.setBounds(100, 300, 200, 50);
		registro.setFont(fuente);
                registro.setForeground(Color.black);
		registro.setOpaque(true);
		registro.setBackground(Color.blue);
		mipanel.add(registro);
		
		registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");
			}
		});
		
		
		return mipanel;
	}
        public JPanel consulta()
	{
		
		Font fuente = new Font("American Typewriter",Font.BOLD,20);
		
		JPanel mipanel = new JPanel();

		mipanel.setBackground(Color.decode("101010"));
		mipanel.setOpaque(true);
		mipanel.setSize(400, 400);
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null); //quita el molde
		
		JLabel etiqueta1 = new JLabel("Consulta");
		etiqueta1.setSize(200, 30);
		etiqueta1.setLocation(120, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("American Typewriter",Font.BOLD,24)); 
		mipanel.add(etiqueta1);
		
		
		JLabel etiqueta2 = new JLabel("Buscar Usuario: ");
		etiqueta2.setSize(200, 30);
		etiqueta2.setLocation(40, 100);
		etiqueta2.setFont(fuente);
		mipanel.add(etiqueta2);
		
		JTextField email = new JTextField();
		email.setSize(200, 30);
		email.setLocation(38, 130);
		email.setFont(fuente);
		mipanel.add(email);
                
                JButton buscar = new JButton("Buscar");
                buscar.setBounds(250, 130, 80, 30);
                mipanel.add(buscar);
                
		
		JLabel password_tag = new JLabel(" Resultados: ");
		password_tag.setSize(250, 30);
		password_tag.setLocation(40, 180);
		password_tag.setFont(fuente);
		mipanel.add(password_tag);
                
                JComboBox list = new JComboBox();
                list.setBounds(40, 230,130,40);
                list.addItem("estudiante 1");
                list.addItem("estudiante 2");
                list.addItem("estudiante 3");
                list.addItem("estudiante 4");
                list.addItem("estudiante 5");
                mipanel.add(list);
                
                
		
		
                        
		
		
		
		JButton registro = new JButton("Inicio");
		registro.setBounds(100, 380, 200, 50);
		registro.setFont(fuente);
		registro.setOpaque(true);
		registro.setBackground(Color.white);
		mipanel.add(registro);
		
		registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");
			}
		});
		
		
		return mipanel;
	}
        public JPanel crear()
	{
		
		Font fuente = new Font("American Typewriter",Font.BOLD,20);
		
		JPanel mipanel = new JPanel();

		mipanel.setBackground(Color.decode("200200"));
		mipanel.setOpaque(true);
		mipanel.setSize(400, 400);
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null); //quita el molde
		
		JLabel etiqueta1 = new JLabel("¿Como crear un usuario?");
		etiqueta1.setSize(400, 30);
		etiqueta1.setLocation(10, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("American Typewriter",Font.BOLD,24)); 
                etiqueta1.setForeground(Color.white);

                mipanel.add(etiqueta1);
		
		
		JLabel etiqueta2 = new JLabel("Ejemplos de nombres válidos");
		etiqueta2.setSize(300, 30);
		etiqueta2.setLocation(40, 130);
		etiqueta2.setFont(fuente);
                etiqueta2.setForeground(Color.white);
		mipanel.add(etiqueta2);
                
                JLabel ins1 = new JLabel("David Gonzalez Vargas");
		ins1.setSize(300, 30);
                ins1.setForeground(Color.white);
		ins1.setLocation(40, 150);
		mipanel.add(ins1);
                
                 JLabel ins2 = new JLabel("Pedro Lerma Sachez");
		ins2.setSize(300, 30);
                ins2.setForeground(Color.white);
		ins2.setLocation(40, 170);
		mipanel.add(ins2);
		
		
		JLabel password_tag = new JLabel("Requisitos para la contrasena: ");
		password_tag.setSize(350, 30);
                password_tag.setForeground(Color.white);
		password_tag.setLocation(40, 210);
		password_tag.setFont(fuente);
		mipanel.add(password_tag);
		
		 JLabel recs = new JLabel("Al menos dos Mayusculas, Dos Minuculas");
		recs.setSize(300, 30);
                recs.setForeground(Color.white);
		recs.setLocation(40, 230);
		mipanel.add(recs);
                
                JLabel recs2 = new JLabel("Y dos caracteres especiales");
		recs2.setSize(300, 30);
                recs2.setForeground(Color.white);
		recs2.setLocation(40, 245);
		mipanel.add(recs2);
		
		
		
		
		
		
		
		JButton registro = new JButton("Inicio");
		registro.setBounds(100, 350, 200, 50);
		registro.setFont(fuente);
		registro.setOpaque(true);
		registro.setBackground(Color.white);
                registro.setForeground(Color.BLACK);
		mipanel.add(registro);
		
		registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");
			}
		});
		
		
		return mipanel;
	}
        public JPanel acceder()
	{
		
		Font fuente = new Font("American Typewriter",Font.BOLD,20);
		
		JPanel mipanel = new JPanel();

		mipanel.setBackground(Color.decode("200200"));
		mipanel.setOpaque(true);
		mipanel.setSize(400, 400);
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null); //quita el molde
		
		JLabel etiqueta1 = new JLabel("¿Como acceder?");
		etiqueta1.setSize(300, 30);
		etiqueta1.setLocation(40, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("American Typewriter",Font.BOLD,24)); 
                etiqueta1.setForeground(Color.white);

                mipanel.add(etiqueta1);
		
		
		JLabel etiqueta2 = new JLabel("Guia inicio de Sesion");
		etiqueta2.setSize(300, 30);
		etiqueta2.setLocation(40, 130);
		etiqueta2.setFont(fuente);
                etiqueta2.setForeground(Color.white);
		mipanel.add(etiqueta2);
                
                JLabel ins1 = new JLabel("En caso de estar registrado, introducir tus credenciales");
		ins1.setSize(350, 30);
                ins1.setForeground(Color.white);
		ins1.setLocation(40, 150);
		mipanel.add(ins1);
                
                 JLabel ins2 = new JLabel("En caso de no tener una cuenta, ir a registro e introcude");
		ins2.setSize(350, 30);
                ins2.setForeground(Color.white);
		ins2.setLocation(40, 170);
		mipanel.add(ins2);
                
                JLabel ins3 = new JLabel("datos para una nueva cuenta");
		ins3.setSize(300, 30);
                ins3.setForeground(Color.white);
		ins3.setLocation(40, 190);
		mipanel.add(ins3);
		
		
		JLabel password_tag = new JLabel("Problemas frecuentes ");
		password_tag.setSize(350, 30);
                password_tag.setForeground(Color.white);
		password_tag.setLocation(40, 230);
		password_tag.setFont(fuente);
		mipanel.add(password_tag);
		
		 JLabel recs = new JLabel("Revisa el uso de mayusculas");
		recs.setSize(300, 30);
                recs.setForeground(Color.white);
		recs.setLocation(40, 250);
		mipanel.add(recs);
                
                JLabel recs2 = new JLabel("Revisa que estes usando el correo correcto");
		recs2.setSize(300, 30);
                recs2.setForeground(Color.white);
		recs2.setLocation(40, 265);
		mipanel.add(recs2);
		
		
		
		
		
		
		
		JButton registro = new JButton("Inicio");
		registro.setBounds(100, 350, 200, 50);
		registro.setFont(fuente);
		registro.setOpaque(true);
		registro.setBackground(Color.white);
                registro.setForeground(Color.BLACK);
		mipanel.add(registro);
		
		registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");
			}
		});
		
		
		return mipanel;
	}
        public JPanel olvidar()
	{
		
		Font fuente = new Font("American Typewriter",Font.BOLD,20);
		
		JPanel mipanel = new JPanel();

		mipanel.setBackground(Color.decode("200200"));
		mipanel.setOpaque(true);
		mipanel.setSize(400, 400);
		mipanel.setLocation(0, 0);
		mipanel.setLayout(null); //quita el molde
		
		JLabel etiqueta1 = new JLabel("Ayuda Recuperar Cuenta");
		etiqueta1.setSize(300, 30);
		etiqueta1.setLocation(40, 30);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("American Typewriter",Font.BOLD,24)); 
                etiqueta1.setForeground(Color.white);

                mipanel.add(etiqueta1);
		
		
		JLabel etiqueta2 = new JLabel("Proceso de recuperacion");
		etiqueta2.setSize(300, 30);
		etiqueta2.setLocation(40, 130);
		etiqueta2.setFont(fuente);
                etiqueta2.setForeground(Color.white);
		mipanel.add(etiqueta2);
                
                JLabel ins1 = new JLabel("Si no recuerdas tu contrasena, presiona ");
		ins1.setSize(350, 30);
                ins1.setForeground(Color.white);
		ins1.setLocation(40, 150);
		mipanel.add(ins1);
                
                 JLabel ins2 = new JLabel("'olvide mi contrasena' en el login");
		ins2.setSize(350, 30);
                ins2.setForeground(Color.white);
		ins2.setLocation(40, 165);
		mipanel.add(ins2);
                
                JLabel ins3 = new JLabel("Introduce tu correo y espera por el codigo de confirmacion");
		ins3.setSize(350, 30);
                ins3.setForeground(Color.white);
		ins3.setLocation(40, 180);
		mipanel.add(ins3);
		JLabel ins4 = new JLabel("Vuelve al apartado de recuperacion e introduce el codigo");
		ins4.setSize(350, 30);
                ins4.setForeground(Color.white);
		ins4.setLocation(40, 195);
		mipanel.add(ins4);
		
		JLabel password_tag = new JLabel("Contactar a Soporte ");
		password_tag.setSize(350, 30);
                password_tag.setForeground(Color.white);
		password_tag.setLocation(40, 250);
		password_tag.setFont(fuente);
		mipanel.add(password_tag);
		
		 JLabel recs = new JLabel("soporte@gmail.com");
		recs.setSize(300, 30);
                recs.setForeground(Color.white);
		recs.setLocation(40, 270);
		mipanel.add(recs);
                
                JLabel recs2 = new JLabel("612 123 456 7");
		recs2.setSize(300, 30);
                recs2.setForeground(Color.white);
		recs2.setLocation(40, 285);
		mipanel.add(recs2);
		
		
		
		
		
		
		
		JButton registro = new JButton("Inicio");
		registro.setBounds(100, 350, 200, 50);
		registro.setFont(fuente);
		registro.setOpaque(true);
		registro.setBackground(Color.white);
                registro.setForeground(Color.BLACK);
		mipanel.add(registro);
		
		registro.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				router("register");
			}
		});
		
		
		return mipanel;
	}
}
