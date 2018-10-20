package validaciones;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

import interfaces.Login;

public class ValUserPass {

	public void valUserPass(String user, String pass) {

		boolean hayEspacios = validacionEspacios(user, pass);
		if (!hayEspacios) {
			comprobarLogin(user, pass);
		}

	}

	private boolean validacionEspacios(String user, String pass) {
		if (user.indexOf(' ') != -1 && pass.indexOf(' ') != -1) {
			JOptionPane.showMessageDialog(null, "el usuario y la contraseña no pueden contener espacios", "Error",
					JOptionPane.ERROR_MESSAGE);
			return true;

		} else if (pass.indexOf(' ') != -1) {
			JOptionPane.showMessageDialog(null, "la contraseña no puede contener espacios", "Error",
					JOptionPane.ERROR_MESSAGE);
			return true;
		} else if (user.indexOf(' ') != -1) {
			JOptionPane.showMessageDialog(null, "el usuario no puede contener espacios", "Error",
					JOptionPane.ERROR_MESSAGE);
			return true;
		}
		return false;
	}

	private void comprobarLogin(String user, String pass) {
		boolean userExists = false;
		boolean passSuccess = false;

		String[] listUsers = { "Carlos", "Marc", "Carlos" };
		String[] listPass = { "123", "132", "543" };
		ArrayList<Integer> posiciones = new ArrayList<Integer>();
		for (int i = 0; i < listUsers.length; i++) {
			if (user.equals(listUsers[i])) {
				posiciones.add(i);
			}
		}

		if (posiciones.size() > 0) {
			userExists = true;
			for (int i = 0; i < posiciones.size(); i++) {
				if (pass.equals(listPass[posiciones.get(i)])) {
					passSuccess = true;
				}
			}
		} else {
			System.out.println("usuario invalido");
		}
		
		if(passSuccess && userExists) {
			System.out.println("USER SUCCESS");
		}else if (userExists && !passSuccess) {
			System.out.println("Contraseña invalida");
		}

	}
}
