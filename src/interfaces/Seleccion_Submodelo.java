package interfaces;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.text.StyledEditorKit.ForegroundAction;

import manageXML.Leer_XML_Cars;
import objetos.Engine;
import objetos.Model;

public class Seleccion_Submodelo {

	private JFrame frame;
	private JLabel lblTitulo;
	private static JList listaSbm;
	private JButton btnAnterior;
	private JButton btnSiguiente;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Seleccion_Submodelo window = new Seleccion_Submodelo();
//					
//
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */
	public Seleccion_Submodelo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		lblTitulo = new JLabel("Selecci\u00F3n de caracter\u00EDsticas del modelo");
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));

		DefaultListModel<String> dlm = new DefaultListModel<String>();
		listaSbm = new JList<>(dlm);
		try {
			leerArchivo(listaSbm, dlm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		btnAnterior = new JButton("Anterior");
		btnAnterior.setFont(new Font("Tahoma", Font.PLAIN, 14));

		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup().addGap(67).addComponent(lblTitulo))
								.addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(listaSbm,
										GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)))
						.addContainerGap())
				.addGroup(groupLayout.createSequentialGroup().addGap(38).addComponent(btnAnterior)
						.addPreferredGap(ComponentPlacement.RELATED, 185, Short.MAX_VALUE).addComponent(btnSiguiente)
						.addGap(33)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup().addContainerGap().addComponent(lblTitulo).addGap(29)
				.addComponent(listaSbm, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(ComponentPlacement.RELATED, 86, Short.MAX_VALUE).addGroup(groupLayout
						.createParallelGroup(Alignment.BASELINE).addComponent(btnAnterior).addComponent(btnSiguiente))
				.addGap(48)));
		frame.getContentPane().setLayout(groupLayout);
	}

	public static void leerArchivo(JList<String> listaSbm, DefaultListModel<String> dlm) throws IOException {
		String cadena;
		int numero;
		File f = new File("./ficheros/temp/cocheSelected.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		cadena = br.readLine();
		numero = Integer.parseInt(cadena);
		System.out.println(numero);
		fr.close();
		br.close();
		Leer_XML_Cars coches = new Leer_XML_Cars();
		ArrayList<Model> modelos = coches.getModelAll();
		ArrayList<Engine> motores = coches.getEngineAll();
		for (Engine motor : motores) {
			String motav = motor.getModelsAvailable();
			String[] array = motav.split(",");
			System.out.println(Arrays.toString(array));
			for (int i = 0; i < array.length; i++) {
				if (modelos.get(numero).getId().equals(array[i])) {
					
					dlm.addElement(modelos.get(numero).getName() + " : " + motor.getDescript());
				}
			}
		}
	}
	
	public JFrame getFrame() {
		return frame;
	}

}
