package aplicacion1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegistroInterfaz {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Registro");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblUsuario = new JLabel("Usuario:");
        lblUsuario.setBounds(50, 50, 100, 30);
        frame.add(lblUsuario);

        JTextField txtUsuario = new JTextField();
        txtUsuario.setBounds(150, 50, 200, 30);
        frame.add(txtUsuario);
        
        JLabel lblContraseña = new JLabel("Contraseña:");
        lblContraseña.setBounds(50, 100, 100, 30);
        frame.add(lblContraseña);

        JPasswordField txtContraseña = new JPasswordField();
        txtContraseña.setBounds(150, 100, 200, 30);
        frame.add(txtContraseña);

        JLabel lblCorreo = new JLabel("Correo:");
        lblCorreo.setBounds(50, 150, 100, 30);
        frame.add(lblCorreo);

        JTextField txtCorreo = new JTextField();
        txtCorreo.setBounds(150, 150, 200, 30);
        frame.add(txtCorreo);
        
        CheckboxGroup grupo = new CheckboxGroup();
        
        Checkbox opcion1 = new Checkbox("Opción 1", grupo, false);
        opcion1.setBounds(50, 200, 80, 40);
        frame.add(opcion1);
        
        Checkbox opcion2 = new Checkbox("Opción 2", grupo, false);
        opcion2.setBounds(200, 200, 80, 40);
        frame.add(opcion2);

        JButton btnRegistrar = new JButton("Registrar");
        btnRegistrar.setBounds(150, 300, 200, 40);
        frame.add(btnRegistrar);
        
        frame.setVisible(true);
        
        btnRegistrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                if (txtUsuario.getText().equals("")) {
                    txtUsuario.setBorder(BorderFactory.createLineBorder(Color.red,3));
                }else{
                    txtUsuario.setBorder(BorderFactory.createLineBorder(Color.green,3));
                }
                
                if (txtCorreo.getText().equals("")) {
                    txtCorreo.setBorder(BorderFactory.createLineBorder(Color.red,3));
                }else{
                    txtCorreo.setBorder(BorderFactory.createLineBorder(Color.green,3));
                }
                
                String contrasena = new String(txtContraseña.getPassword());
                if (contrasena.equals("")) {
                    txtContraseña.setBorder(BorderFactory.createLineBorder(Color.red,3));
                }else{
                    txtContraseña.setBorder(BorderFactory.createLineBorder(Color.green,3));
                }
               if(contrasena.equals(contrasena.equals("") && txtCorreo.getText().equals("david@gmail.com")&&txtCorreo.getText().equals("david") )){
                   JOptionPane.showMessageDialog(null, "Accediste con exito");
                }else{
                   JOptionPane.showMessageDialog(null, "introduce tus datos","alerta",JOptionPane.WARNING_MESSAGE);
               }
                
 
            }
        });
    }

    private static void add(Checkbox checkbox) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
