package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		JCheckBox acc1 = new JCheckBox("New check box");
		
		JCheckBox acc2 = new JCheckBox("New check box");
		
		JCheckBox acc3 = new JCheckBox("New check box");
		
		JCheckBox acc4 = new JCheckBox("New check box");
		
		JCheckBox acc5 = new JCheckBox("New check box");
		
		JCheckBox acc6 = new JCheckBox("New check box");
		
		JCheckBox acc7 = new JCheckBox("New check box");
		
		JCheckBox acc8 = new JCheckBox("New check box");
		
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
						.addComponent(acc4)
						.addComponent(acc3)
						.addComponent(acc2)
						.addComponent(acc1)
						.addComponent(textArg)
						.addComponent(btnAtras))
					.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnFinalizar)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(CompraAccesorio, Alignment.TRAILING)
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(acc5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(acc6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(acc7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(acc8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(ArgPrecio))
								.addGap(101))))
					.addContainerGap())
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
							.addComponent(acc7)
							.addGap(18)
							.addComponent(acc8))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(acc1)
							.addGap(18)
							.addComponent(acc2)
							.addGap(18)
							.addComponent(acc3)
							.addGap(18)
							.addComponent(acc4)))
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textArg)
						.addComponent(ArgPrecio, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnAtras)
						.addComponent(btnFinalizar))
					.addContainerGap(40, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
