package principal;

import java.io.File;
import java.io.IOException;

import interfaces.Login;
import patrones.ConfigurationLoader;
import validaciones.ValUserPass;

class ConfVehiculos {

	public static void main(String[] args) throws IOException {

		//llamando al patron de diseño SINGLETON.
		ConfigurationLoader config = ConfigurationLoader.getConfig();
		iniciarVentanaLogin();

	}

	private static void iniciarVentanaLogin() {
		Login l1 = new Login();
		l1.getFrame().setVisible(true);
	}

	public static void comprobarLogin() {

	}
}
