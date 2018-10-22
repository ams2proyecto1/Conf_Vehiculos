package manageXML;

import java.io.File;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 *
 * @author Sean
 */

public class leerXML {

	private static String[] user = null;
	private static String[] pass = null;
	
	public static void leer() {
		try {
			File archivo = new File("./ficheros/cv_config.xml");
			
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
			Document document = documentBuilder.parse(archivo);
			document.getDocumentElement().normalize();
			
			//String[] user = null;
			//String[] pass = null;
			
			System.out.println("Elemento raiz:" + document.getDocumentElement().getNodeName());
			NodeList nList = document.getElementsByTagName("configuracion");
			System.out.println("----------------------------");
			
			
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);	
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;
					
					String ccp = eElement.getElementsByTagName("car_configuration_path").item(0).getTextContent();
					String ccfn = eElement.getElementsByTagName("car_configuration_file_name").item(0).getTextContent();
					
					NodeList nUser = document.getElementsByTagName("login");
					NodeList nPass = document.getElementsByTagName("password");
					
					user = new String[nUser.getLength()];
					pass = new String[nPass.getLength()];
					
					for (int temp2 = 0; temp2 < nUser.getLength(); temp2++) {
						Node nNode2 = nUser.item(temp2);	
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {
							Element eElement2 = (Element) nNode2;
							getUser()[temp2] = eElement2.getTextContent();
						}
					}
					
					
					for (int temp3 = 0; temp3 < nPass.getLength(); temp3++) {
						Node nNode3 = nPass.item(temp3);	
						if (nNode.getNodeType() == Node.ELEMENT_NODE) {
							Element eElement3 = (Element) nNode3;
							getPass()[temp3] = eElement3.getTextContent();
						}
					}
					
					
					String sfp = eElement.getElementsByTagName("specifications_file_path").item(0).getTextContent();
					
					System.out.println("car_configuration_path: " + ccp);
					System.out.println("car_configuration_file_name: " + ccfn);
					System.out.println("Usuarios: " + Arrays.toString(getUser()));
					System.out.println("Contraseñas: " + Arrays.toString(getPass()));
					System.out.println("specifications_file_path: " + sfp);
					
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String[] getUser() {
		return user;
	}

	public static String[] getPass() {
		return pass;
	}
	
	public static void main(String[] args) {
		leer();
	}

}

