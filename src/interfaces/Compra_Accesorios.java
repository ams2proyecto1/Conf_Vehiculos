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

		Leer_XML_Cars coches = new Leer_XML_Cars();
		ArrayList<Accesory> acc = coches.getAccesoryAll();
		ArrayList<JCheckBox> arrayAccesorios = new ArrayList<>();
		for (int i = 0; i < coches.getAccesoryAll().size(); i++) {
			JCheckBox box = new JCheckBox(acc.get(i).getName());
			arrayAccesorios.add(box);
			box.setVisible(true);
		}

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
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(DatosCoche, GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE).addGap(136))
				.addGroup(gl_contentPane.createSequentialGroup().addGap(39)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addComponent(CompraAccesorio)
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(textArg)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(ArgPrecio, GroupLayout.PREFERRED_SIZE, 177,
												GroupLayout.PREFERRED_SIZE)
										.addGap(31)))
						.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup().addGap(55).addComponent(btnAtras)
						.addPreferredGap(ComponentPlacement.RELATED, 160, Short.MAX_VALUE).addComponent(btnFinalizar)
						.addGap(103)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addContainerGap().addComponent(CompraAccesorio)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(DatosCoche, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addGap(188)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(ArgPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(textArg))
						.addGap(42).addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnAtras).addComponent(btnFinalizar))
						.addContainerGap(43, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

	public static void Metodo() {
		Leer_XML_Cars coches = new Leer_XML_Cars();
		ArrayList<Accesory> accesorios = coches.getAccesoryAll();

	}
}
