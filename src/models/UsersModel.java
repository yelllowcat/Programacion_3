package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class UsersModel {

	
	private List<User> usuarios = new ArrayList<>();
	
	public UsersModel() {
		// TODO Auto-generated constructor stub
	}
	
	public List getAll()
	{
		
		String query = "select * from users";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testpro", "root", "yellow");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) { 
				
				Integer id = rs.getInt(1);
				String name = rs.getString(2); 
				String email = rs.getString(3); 
				String role = rs.getString(4); 
				String phone = rs.getString(5); 

				System.out.println("empId:" + id);
				System.out.println("firstName:" + name);
				System.out.println("email:" + email);
				System.out.println("role:" + role);
				System.out.println("phone:" + phone);
				
				 
				System.out.println(""); 
				
				usuarios.add(new User(id,name,email,role,phone,null,null));
			}
			
			rs.close();
			
			return usuarios;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return usuarios;
	}
	
	public User get(int id_Target)
	{
		
		String query = "select * from users where id = "+id_Target;
		Connection conn = null;
		Statement stmt = null;
		User myuser = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testpro", "root", "yellow");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			while (rs.next()) { 
				
				Integer id = rs.getInt(1);
				String name = rs.getString(2); 
				String email = rs.getString(3); 
				String role = rs.getString(4); 
				String phone = rs.getString(5); 

				System.out.println("empId:" + id);
				System.out.println("firstName:" + name);
				System.out.println("email:" + email);
				System.out.println("role:" + role);
				System.out.println("phone:" + phone);
				
				 
				System.out.println(""); 
				 myuser = new User(id,name,email,role,phone,null,null);
			}
			
			rs.close();
			
			return myuser;
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		return myuser;
	}
	
	public boolean remove(int id) {
		
		String query = "DELETE FROM users WHERE `users`.`id` ="+id;
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testpro", "root", "yellow");
			stmt = conn.createStatement();
			
			stmt.executeUpdate(query);
			
			return true; 
				
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		
		
		return false;
		
	}

	public void addUser(String nombre,String email,String role,String phone) {
	 String query = "INSERT INTO users (name, email, role, phone) VALUES (?, ?, ?, ?)";
	    try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testpro", "root", "yellow");
	         PreparedStatement pstmt = conn.prepareStatement(query)) {
	        
	        pstmt.setString(1, nombre);
	        pstmt.setString(2, email);
	        pstmt.setString(3, role);
	        pstmt.setString(4, phone);

	        pstmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
}
	public void update(int id, String name, String email, String role, String phone) {
	    String query = "UPDATE users SET name=?, email=?, role=?, phone=? WHERE id=?";
	    
	    try (Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testpro", "root", "yellow");
	         PreparedStatement pstmt = conn.prepareStatement(query)) {
	        
	        pstmt.setString(1, name);
	        pstmt.setString(2, email);
	        pstmt.setString(3, role);
	        pstmt.setString(4, phone);
	        pstmt.setInt(5, id);
	        
	        int rowsAffected = pstmt.executeUpdate();
	        if (rowsAffected > 0) {
	            System.out.println("Usuario actualizado correctamente.");
	        } else {
	            System.out.println("No se encontró el usuario con ID: " + id);
	        }
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}