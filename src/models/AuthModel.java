package models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class AuthModel {

	public boolean login(String email,String pass) {
      

		String url = this.getClass().getResource("/files/users.txt").getPath();
		 BufferedReader reader;

		  try {
		   reader = new BufferedReader(new FileReader(url));
		   String line = reader.readLine();

		   
		   while (line != null) {
		    System.out.println("linea: "+line);
		    // read next line
			   String[] p = line.split(","); // Split using a comma
			 line = reader.readLine();
			 
			 if(email.equals(p[1])) {
					if(pass.equals(p[2])) {
						return true;
					} else {
						return false;
					}
				} 
		   }
		 
         
			
	        
	    
		   reader.close();
	     
			
		   
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		 
		
		return false;
	}

}