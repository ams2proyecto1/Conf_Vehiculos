package objetos;

import java.util.Arrays;

public class Submodel {
	private String id;
	private String sid;
	private String name;
	private String caballos;
	private String doors;
	private String motor;
	private String price;
	private String[] lista_accesorios;
	
	public Submodel(String id, String sid, String name, String caballos, String doors, String motor, String price,
			String[] lista_accesorios) {
		super();
		this.id = id;
		this.sid = sid;
		this.name = name;
		this.caballos = caballos;
		this.doors = doors;
		this.motor = motor;
		this.price = price;
		this.lista_accesorios = lista_accesorios;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCaballos() {
		return caballos;
	}

	public void setCaballos(String caballos) {
		this.caballos = caballos;
	}

	public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String[] getLista_accesorios() {
		return lista_accesorios;
	}

	public void setLista_accesorios(String[] lista_accesorios) {
		this.lista_accesorios = lista_accesorios;
	}

	@Override
	public String toString() {
		return "Submodel [id=" + id + ", sid=" + sid + ", name=" + name + ", caballos=" + caballos + ", doors=" + doors
				+ ", motor=" + motor + ", price=" + price + ", lista_accesorios=" + Arrays.toString(lista_accesorios)
				+ "]";
	}
	
	

}
