package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import manageXML.Leer_XML_Cars;
import objetos.Accesory;
import objetos.Engine;
import objetos.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class Compra_Accesorios extends JFrame {

	private JPanel contentPane;
	JCheckBox acc1;
	JCheckBox acc2;
	JCheckBox acc3;
	JCheckBox acc4;
	JCheckBox acc5;
	JCheckBox acc6;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Compra_Accesorios frame = new Compra_Accesorios();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public Compra_Accesorios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		JLabel CompraAccesorio = new JLabel("Compra de Accesorios");
		CompraAccesorio.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JLabel DatosCoche = new JLabel("Informaci\u00F3n del coche");
		DatosCoche.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		acc1 = new JCheckBox("AutoRadio");
		
		acc2 = new JCheckBox("SistemaMultimedia");
		
		acc3 = new JCheckBox("KitManosLibres");
		
		acc4 = new JCheckBox("Altavoces");
		
		acc5 = new JCheckBox("Tapacubos");
		
		acc6 = new JCheckBox("CadenasDeNieve");
		
		JLabel textArg = new JLabel("Argumento en el precio:");
		textArg.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JTextArea ArgPrecio = new JTextArea();
		ArgPrecio.setText("0");
		
		JButton btnAtras = new JButton("Atras");
		btnAtras.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Seleccion_Submodelo sb = new Seleccion_Submodelo();
				sb.getFrame().setVisible(true);
				dispose();
				
			}
		});
		
		JButton btnFinalizar = new JButton("Finalizar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(DatosCoche, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
					.addGap(136))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textArg)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(acc3)
								.addComponent(acc2)
								.addComponent(acc1))
							.addPreferredGap(ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(CompraAccesorio)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
										.addComponent(acc5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(acc6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(acc4)
										.addComponent(ArgPrecio, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE))
									.addGap(31)))))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(55)
					.addComponent(btnAtras)
					.addPreferredGap(ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
					.addComponent(btnFinalizar)
					.addGap(103))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(CompraAccesorio)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(DatosCoche, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
					.addGap(25)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(acc5)
							.addGap(18)
							.addComponent(acc6)
							.addGap(18)
							.addComponent(acc4))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(acc1)
							.addGap(18)
							.addComponent(acc2)
							.addGap(18)
							.addComponent(acc3)))
					.addGap(58)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textArg)
						.addComponent(ArgPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(42)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAtras)
						.addComponent(btnFinalizar))
					.addContainerGap(49, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public static void Metodo() {
		Leer_XML_Cars coches = new Leer_XML_Cars();
		ArrayList<Accesory> accesorios = coches.getAccesoryAll();
		
	}
}
