package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionModel {

	public ConnectionModel() {
		String query = "select * from users";
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/testpro", "root", "yellow");
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				Integer id = rs.getInt(1);
				String name = rs.getString(2);
				//String lastName = rs.getString(3);
				//Date dob = rs.getDate(4);
				String email = rs.getString(3);
				String role = rs.getString(4);
				String phone = rs.getString(5);

				System.out.println("empId:" + id);
				System.out.println("firstName:" + name);
				 
				System.out.println("email: " +email);
				System.out.println("role: " +role);
				System.out.println("phone: " +phone);
			}
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (Exception e) {}
		}
	}

}