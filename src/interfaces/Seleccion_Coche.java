package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class Seleccion_Coche extends JFrame {
	JLabel usuario;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					seleccionCoche frame = new seleccionCoche();
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
	public Seleccion_Coche() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 583, 572);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(contentPane);

		JLabel titulo = new JLabel("SELECCIONA EL MODELO DEL COCHE");
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 16));

		JLabel ImagenSelect = new JLabel();
		ImagenSelect.setIcon(new ImageIcon("./imagenes/seat-alhambra.jpg"));

		JTextArea info = new JTextArea();
		info.setText("El SEAT Alhambra es el buque insignia \nde la gama SEAT por tamaño y \ncapacidad de transporte.");

		JButton btnSiguiente = new JButton("Siguiente");

		JButton btnAnterior = new JButton("Anterior");
		Login l1 = new Login();
		usuario = new JLabel("Usuario: " );

		JButton ImageSEAT1 = new JButton("");
		ImageSEAT1.setIcon(new ImageIcon("./imagenes/seat-alhambra-min.jpg"));
		ImageSEAT1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImagenSelect.setIcon(new ImageIcon("./imagenes/seat-alhambra.jpg"));
				info.setText(
						"El SEAT Alhambra es el buque insignia \nde la gama SEAT por tamaño y \ncapacidad de transporte.");
			}
		});

		JButton ImageSEAT2 = new JButton("");
		ImageSEAT2.setIcon(new ImageIcon("./imagenes/seat-arona-min.jpg"));
		ImageSEAT2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImagenSelect.setIcon(new ImageIcon("./imagenes/seat-arona.jpg"));
				info.setText(
						"El SEAT Arona es el primer crossover \ndel segmento B de SEAT. Se trata de una \nversión crossover del SEAT Ibiza.");
			}
		});

		JButton ImageSEAT3 = new JButton("");
		ImageSEAT3.setIcon(new ImageIcon("./imagenes/seat-ateca-min.jpg"));
		ImageSEAT3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImagenSelect.setIcon(new ImageIcon("./imagenes/seat-ateca.jpg"));
				info.setText(
						"El SEAT Ateca es el primer SUV de SEAT. \nEs un todocamino de tamaño mediano, \ncomparable al Audi Q3 o al Kia Sportage.");
			}
		});

		JButton ImageSEAT4 = new JButton("");
		ImageSEAT4.setIcon(new ImageIcon("./imagenes/seat-ibiza-min.jpg"));
		ImageSEAT4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImagenSelect.setIcon(new ImageIcon("./imagenes/seat-ibiza.jpg"));
				info.setText(
						"El SEAT Ibiza es el utilitario de SEAT, \nla opción del segmento B del fabricante \nespañol, un coche pequeño que es rival \ndel Reanult Clio, del Peugeot 208, del \nMazda2 o del Ford Fiesta.");
			}
		});

		JButton ImageSEAT5 = new JButton("");
		ImageSEAT5.setIcon(new ImageIcon("./imagenes/seat-leon-min.jpg"));
		ImageSEAT5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImagenSelect.setIcon(new ImageIcon("./imagenes/seat-leon.jpg"));
				info.setText(
						"El SEAT León es un compacto de precio \ncompetitivo disponible con carrocerías de \n5 puertas, 3 puertas y carrocería familiar.");
			}
		});

		JButton ImageSEAT6 = new JButton("");
		ImageSEAT6.setIcon(new ImageIcon("./imagenes/seat-panda-min.jpg"));
		ImageSEAT6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImagenSelect.setIcon(new ImageIcon("./imagenes/seat-panda.jpg"));
				info.setText(
						"El SEAT Panda es un automóvil utilitario \n(segmento A) diseñado por Giorgetto \nGiugiaro y producido por esta firma bajo \nlicencia de Fiat.");
			}
		});

		JButton ImageSEAT7 = new JButton("");
		ImageSEAT7.setIcon(new ImageIcon("./imagenes/seat-tarraco-min.jpg"));
		ImageSEAT7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ImagenSelect.setIcon(new ImageIcon("./imagenes/seat-tarraco.jpg"));
				info.setText(
						"El SEAT Tarraco es un todocamino \ngrande de hasta 7 plazas fabricado por \nSEAT, que se sitúa un escalón por \nencima del SEAT Ateca.");
			}
		});

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addComponent(ImageSEAT1)
						.addComponent(ImageSEAT2).addComponent(ImageSEAT3).addComponent(ImageSEAT4)
						.addComponent(ImageSEAT5).addComponent(ImageSEAT6).addComponent(ImageSEAT7))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
						.createSequentialGroup().addGap(56)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(titulo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGap(61))
								.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnAnterior)
										.addPreferredGap(ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
										.addComponent(btnSiguiente))
								.addComponent(ImagenSelect, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 337,
										Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(info, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE)))
				.addGap(12).addComponent(usuario).addGap(18)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE).addComponent(titulo)
						.addComponent(usuario))
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(ImageSEAT1, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(ImageSEAT2, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(ImageSEAT3, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(ImageSEAT4, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(ImageSEAT5, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE))
						.addComponent(ImagenSelect, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
						.createSequentialGroup()
						.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING).addGroup(gl_contentPane
								.createSequentialGroup().addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(ImageSEAT6, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(ImageSEAT7, GroupLayout.PREFERRED_SIZE, 55, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 56, Short.MAX_VALUE))
								.addGroup(gl_contentPane.createSequentialGroup()
										.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnAnterior)
										.addPreferredGap(ComponentPlacement.RELATED)))
						.addGap(52))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(6)
								.addComponent(info, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED).addComponent(btnSiguiente)
								.addGap(55)))));
		contentPane.setLayout(gl_contentPane);
	}
}