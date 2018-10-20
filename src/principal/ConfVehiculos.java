package principal;

import interfaces.Login;
import validaciones.ValUserPass;

class ConfVehiculos {

	public static void main(String[] args) {
		iniciarVentanaLogin();
		valUserPass();
	}
	private static void iniciarVentanaLogin() {
		Login l1 = new Login();
		l1.getFrame().setVisible(true);
	}
	private static void valUserPass() {
		
	}
}
