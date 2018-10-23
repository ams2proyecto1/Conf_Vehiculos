package patrones;

import configuraciones.ConfigXML;
import manageXML.leerXML;

public class ConfigurationLoader {


	private static ConfigXML instance;

	private ConfigurationLoader() {

	}

	public static ConfigXML getInstance() {
		if (instance == null) {
			instance = new leerXML().leer();
		}

		return instance;
	}
	
	
}
