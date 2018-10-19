package patrones;

public class ConfigurationLoader {
	
	private static ConfigurationLoader instance;
	
	private ConfigurationLoader() {
		
	}
	
	public static ConfigurationLoader getInstance() {
		if(instance == null) {
			instance = new ConfigurationLoader();
		}
		
		return instance;
	}

}
