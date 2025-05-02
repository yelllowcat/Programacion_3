package aplication;

import controllers.AuthController;

public class main {

	public static void main(String[] args) {
		
		AuthController app = new AuthController(); 
		app.login();
	}

}