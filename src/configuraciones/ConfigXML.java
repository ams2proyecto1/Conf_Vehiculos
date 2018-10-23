package configuraciones;

public class ConfigXML {
	private String car_configuration_path, car_cofiguration_file_name, speficications_file_path, version;
	private String[] employee_list, employee_password;
	private boolean employee_version;
	
	public ConfigXML() {
		
	}
	
	public ConfigXML(String car_configuration_path, String car_cofiguration_file_name,
			String speficications_file_path, String version, String[] employee_list, String[] employee_password,
			boolean employee_version) {
		this.car_configuration_path = car_configuration_path;
		this.car_cofiguration_file_name = car_cofiguration_file_name;
		this.speficications_file_path = speficications_file_path;
		this.version = version;
		this.employee_list = employee_list;
		this.employee_password = employee_password;
		this.employee_version = employee_version;
	}
	
	public String getCar_configuration_path() {
		return car_configuration_path;
	}

	public String getCar_cofiguration_file_name() {
		return car_cofiguration_file_name;
	}

	public String getSpeficications_file_path() {
		return speficications_file_path;
	}

	public String getVersion() {
		return version;
	}

	public String[] getEmployee_list() {
		return employee_list;
	}

	public String[] getEmployee_password() {
		return employee_password;
	}

	public boolean isEmployee_version() {
		return employee_version;
	}

	public void setCar_configuration_path(String car_configuration_path) {
		this.car_configuration_path = car_configuration_path;
	}

	public void setCar_cofiguration_file_name(String car_cofiguration_file_name) {
		this.car_cofiguration_file_name = car_cofiguration_file_name;
	}

	public void setSpeficications_file_path(String speficications_file_path) {
		this.speficications_file_path = speficications_file_path;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setEmployee_list(String[] employee_list) {
		this.employee_list = employee_list;
	}

	public void setEmployee_password(String[] employee_password) {
		this.employee_password = employee_password;
	}

	public void setEmployee_version(boolean employee_version) {
		this.employee_version = employee_version;
	}
	
	


}
