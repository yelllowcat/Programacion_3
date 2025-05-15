package views;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import controllers.UsersController;
import models.User;
import models.UsersModel;

public class UsersView {

	public UsersView() {
		
	}
	
	
	public void index(List usuarios)
	{
		JFrame ventana = new JFrame();
		
		ventana.setVisible(true);
		ventana.setSize(930, 600);
		ventana.setLocationRelativeTo(null); 
		ventana.setTitle("Login"); 
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		ventana.setResizable(true);  
		ventana.setLayout(new java.awt.BorderLayout());
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		//this.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLocation(0, 0);
		panel.setLayout(new java.awt.FlowLayout(FlowLayout.CENTER)); 
		panel.setSize(1000, 600); 
		
		JLabel lblNewLabel = new JLabel("UABCS - DASC\n");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Kefa", Font.PLAIN, 24));
		lblNewLabel.setBounds(107, 35, 210, 26);
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		panel.add(lblNewLabel);
		
		JPanel panel2 = new JPanel();
		panel2.setBackground(new Color(255, 255, 255));
		//this.getContentPane().add(panel, BorderLayout.CENTER);
		panel2.setLocation(0, 0);
		panel2.setLayout(new BorderLayout()); 
		panel2.setSize(1000, 600); 
		
		  String[][] datos ;
		        // Encabezados de las columnas
		        String[] columnas = {"ID", "Nombre", "Email","Role","Phone","Creado","Actualizado","Eliminar"};

		        // Crear la tabla con los datos y encabezados
		        DefaultTableModel modelo = new DefaultTableModel(columnas, 0); // 0 = sin filas al inicio

		        JTable tabla = new JTable(modelo);
		        // Agregar la tabla a un JScrollPane (para que tenga scroll)
		        JScrollPane scrollPane = new JScrollPane(tabla);

		        panel2.add(scrollPane,BorderLayout.CENTER);
		        
		    
		for (Iterator iterator = usuarios.iterator(); iterator.hasNext();) {
			User usuario = (User) iterator.next();
			Object[] fila = {usuario.id, usuario.name, usuario.email,usuario.role,usuario.phone};
			modelo.addRow(fila);
			JButton delete = new JButton("Eliminar");
			panel.add(delete);
			delete.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					UsersModel um = new UsersModel();
					System.out.println("user id: "+usuario.id);
					um.remove(usuario.id);
					
					ventana.dispose();
					
					UsersController us = new UsersController();
					us.index();
				}
				
			});

			
			
		}
		
		 
		
		ventana.add(panel, java.awt.BorderLayout.NORTH);  
		ventana.add(panel2, java.awt.BorderLayout.SOUTH); 
        ventana.setVisible(true);
		ventana.repaint();
		ventana.revalidate();
	}

}